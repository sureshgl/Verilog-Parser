/*
* Copyright (C) 2014 Memoir Systems Inc. These coded instructions, statements, and computer programs are
* Confidential Proprietary Information of Memoir Systems Inc. and may not be disclosed to third parties
* or copied in any form, in whole or in part, without the prior written consent of Memoir Systems Inc.
* */

module algo_1rw_ref (read_0, addr_0, read_vld_0, read_serr_0, read_derr_0, dout_0, read_padr_0, write_0, din_0, clk, rst);

  input                read_0;
  input [3:0]  addr_0;
  output               read_vld_0;
  output [3:0]   dout_0;
  output               read_serr_0;
  output               read_derr_0;
  output [4:0] read_padr_0;

  input                write_0;
  input [3:0]    din_0;

  input                clk;
  input                rst;

  // output pipeline
  reg read_vld_0_reg[0:0];
  reg [3:0] dout_0_reg[0:0];
  reg read_serr_0_reg[0:0];
  reg read_derr_0_reg[0:0];
  reg [4:0] read_padr_0_reg[0:0];

  integer d;
  always @(posedge clk)
    for (d = 0; d > 0; d = d - 1) begin
      read_vld_0_reg[d] <= read_vld_0_reg[d-1];
      dout_0_reg[d] <= dout_0_reg[d-1];
      read_serr_0_reg[d] <= read_serr_0_reg[d-1];
      read_derr_0_reg[d] <= read_derr_0_reg[d-1];
      read_padr_0_reg[d] <= read_padr_0_reg[d-1];
    end

  assign read_vld_0 = read_vld_0_reg[0];
  assign dout_0 = dout_0_reg[0];
  assign read_serr_0 = read_serr_0_reg[0];
  assign read_derr_0 = read_derr_0_reg[0];
  assign read_padr_0 = read_padr_0_reg[0];

  // The following is for error injection support

  bit err[4:0][3:0];

  integer b_int, r_int;
  initial begin
    for (b_int=0; b_int<5; b_int=b_int+1)
      for (r_int=0; r_int<4; r_int=r_int+1)
        err[b_int][r_int] = 1'b0;
  end


  wire [1:0] badr0;
  wire [1:0] radr0;
  np2_addr #(
    .NUMADDR (16), .BITADDR (4),
    .NUMVBNK (4), .BITVBNK (2),
    .NUMVROW (4), .BITVROW (2))
    rd_adr_0 (.vbadr(badr0), .vradr(radr0), .vaddr(addr_0));

  // for paddr reporting purpose
  wire [-1:0] wdadr0;
  wire [1:0] sradr0;
  np2_addr #(
    .NUMADDR (4), .BITADDR (2),
    .NUMVBNK (1), .BITVBNK (0),
    .NUMVROW (4), .BITVROW (2))
    rd_wrd_0 (.vbadr(wdadr0), .vradr(sradr0), .vaddr(radr0));

  // On reads, return serr/derr if one/more banks have an error on the same row
  integer b0, c0;
  reg [1:0] tmp0;
  always_comb
    if (read_0) begin
      c0 = 0;
      for (b0 = 4; b0 >= 0; b0 = b0 - 1)

        if (err[b0][radr0]) begin

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

      err[badr0][radr0] <= 1'b0;
      err[4][radr0] <= 1'b0;

    end


  reg [3 :0] mem[15:0];
  // This is for backdoor access support
  reg bdw_flag[15:0]; // backdoor written flag

  integer f_int;
  initial begin
    for (f_int=0; f_int<16; f_int=f_int+1)
      bdw_flag[f_int] = 1'b0;
  end


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

      bdw_flag[addr_0] <= 1'b0;

    end

endmodule

