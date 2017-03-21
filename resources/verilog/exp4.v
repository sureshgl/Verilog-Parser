module algo_1rw_ref (read_0, addr_0, read_vld_0, read_serr_0, read_derr_0, dout_0, read_padr_0, write_0, din_0, clk, rst);
  
  parameter WIDTH = 4;
  parameter NUMADDR = 16;
  parameter BITADDR = 4;
  parameter MEM_DELAY = 1;
  parameter BITVROW = 2;
  parameter NUMVROW = 4;
  parameter BITVBNK = 2;
  parameter NUMVBNK = 4;
  parameter NUMSROW = 4;
  parameter BITSROW = 2;
  parameter NUMWRDS = 1;
  parameter BITWRDS = 0;
  parameter BITPADR = 5;
  
  parameter EXTWIDTH = WIDTH+1;
  
  input                read_0;
  input [BITADDR-1:0]  addr_0;
  output               read_vld_0;
  output [WIDTH-1:0]   dout_0;
  output               read_serr_0;
  output               read_derr_0;
  output [BITPADR-1:0] read_padr_0;

  input                write_0;
  input [WIDTH-1:0]    din_0;

  input                clk;
  input                rst;

  // output pipeline
  reg read_vld_0_reg[MEM_DELAY-1:0];
  reg [WIDTH-1:0] dout_0_reg[MEM_DELAY-1:0];
  reg read_serr_0_reg[MEM_DELAY-1:0];
  reg read_derr_0_reg[MEM_DELAY-1:0];
  reg [BITPADR-1:0] read_padr_0_reg[MEM_DELAY-1:0];

  integer d;
  always @(posedge clk)
    for (d = MEM_DELAY-1; d > 0; d = d - 1) begin
      read_vld_0_reg[d] <= read_vld_0_reg[d-1];
      dout_0_reg[d] <= dout_0_reg[d-1];
      read_serr_0_reg[d] <= read_serr_0_reg[d-1];
      read_derr_0_reg[d] <= read_derr_0_reg[d-1];
      read_padr_0_reg[d] <= read_padr_0_reg[d-1];
    end

  assign read_vld_0 = read_vld_0_reg[MEM_DELAY-1];
  assign dout_0 = dout_0_reg[MEM_DELAY-1];
  assign read_serr_0 = read_serr_0_reg[MEM_DELAY-1];
  assign read_derr_0 = read_derr_0_reg[MEM_DELAY-1];
  assign read_padr_0 = read_padr_0_reg[MEM_DELAY-1];

  // The following is for error injection support
`ifdef SUPPORTED
  // systemVerilog sparse memory -- location only allocated when indexed
  bit err[NUMVBNK+1][*];
`else
  bit err[NUMVBNK:0][NUMVROW-1:0];

  integer b_int, r_int;
  initial begin
    for (b_int=0; b_int<NUMVBNK+1; b_int=b_int+1)
      for (r_int=0; r_int<NUMVROW; r_int=r_int+1)
        err[b_int][r_int] = 1'b0;
  end
`endif

  wire [BITVBNK-1:0] badr0;
  wire [BITVROW-1:0] radr0;
  np2_addr #(
    .NUMADDR (NUMADDR), .BITADDR (BITADDR),
    .NUMVBNK (NUMVBNK), .BITVBNK (BITVBNK),
    .NUMVROW (NUMVROW), .BITVROW (EXTWIDTH))
    rd_adr_0 (.vbadr(badr0), .vradr(radr0), .vaddr(addr_0));

  // for paddr reporting purpose
  wire [BITWRDS-1:0] wdadr0;
  wire [BITSROW-1:0] sradr0;
  np2_addr #(
   .NUMADDR (NUMADDR), .BITADDR (BITADDR),
    .NUMVBNK (NUMVBNK), .BITVBNK (BITVBNK),
    .NUMVROW (NUMVROW), .BITVROW (BITVROW))
    rd_wrd_0 (.vbadr(wdadr0), .vradr(sradr0), .vaddr(radr0));

  // On reads, return serr/derr if one/more banks have an error on the same row
  integer b0, c0;
  reg [BITVBNK-1:0] tmp0;
  always_comb
    if (read_0) begin
      c0 = 0;
      for (b0 = NUMVBNK; b0 >= 0; b0 = b0 - 1)
`ifdef SUPPORTED
        if (err[b0].exists(radr0)) begin
`else
        if (err[b0][radr0]) begin
`endif
          tmp0 = b0;
          c0 = c0 + 1;
        end
    end

  always @(posedge clk)
    if (rst) begin
      read_serr_0_reg[0] <= 1'b0;
      read_derr_0_reg[0] <= 1'b0;
    end else if (read_0) begin
      if (c0 == 0) begin
        read_serr_0_reg[0] <= 1'b0;
        read_derr_0_reg[0] <= 1'b0;
        read_padr_0_reg[0] <= {badr0,wdadr0,sradr0};
      end else if (c0 == 1) begin
        read_serr_0_reg[0] <= 1'b1;
        read_derr_0_reg[0] <= 1'b0;
        read_padr_0_reg[0] <= {tmp0,wdadr0,sradr0};
      end else begin
        read_serr_0_reg[0] <= 1'b1;
        read_derr_0_reg[0] <= 1'b1;
        read_padr_0_reg[0] <= {tmp0,wdadr0,sradr0};
      end
    end

  // on write, clear error (if exists) on that bank and the extra bank
  always @(posedge clk)
    if (write_0) begin
`ifdef SUPPORTED
      if (err[badr0].exists(radr0))
        err[badr0].delete(radr0);
      if (err[NUMVBNK].exists(radr0))
        err[NUMVBNK].delete(radr0);
`else
      err[badr0][radr0] <= 1'b0;
      err[NUMVBNK][radr0] <= 1'b0;
`endif
    end

`ifdef SUPPORTED
  // systemVerilog sparse memory -- location only allocated when indexed
  bit [WIDTH-1 :0] mem[*];
  // This is for backdoor access support
  bit bdw_flag[*]; // backdoor written flag
`else
  reg [WIDTH-1 :0] mem[NUMADDR-1:0];
  // This is for backdoor access support
  reg bdw_flag[NUMADDR-1:0]; // backdoor written flag

  integer f_int;
  initial begin
    for (f_int=0; f_int<NUMADDR; f_int=f_int+1)
      bdw_flag[f_int] = 1'b0;
  end
`endif

  always @(posedge clk)
    if (rst)
      read_vld_0_reg[0] <= 1'b0;
    else if (read_0) begin
      read_vld_0_reg[0] <= 1'b1;
      dout_0_reg[0] <= mem[addr_0];
    end else
      read_vld_0_reg[0] <= 1'b0;

  always @(posedge clk)
    if (write_0) begin
      mem[addr_0] <= din_0;
`ifdef SUPPORTED
      if (mem.exists(addr_0)) bdw_flag.delete(addr_0);
`else
      bdw_flag[addr_0] <= 1'b0;
`endif
    end

endmodule