module zt_des_cuckoo_1sor1u (
  clk, rst, ready,
  search_0, sr_key_0, sr_dout_0, sr_vld_0, sr_hit_0,
  update_1, up_key_1, up_din_1,  up_del_1, up_bp_1,
  t1_writeA, t1_addrA, t1_dinA, t1_readB, t1_addrB, t1_doutB
);

parameter NUMVBNK = 4;
parameter KYWIDTH = 5;
parameter DTWIDTH = 1;
parameter NUMVROW = 4;
parameter FIFOCNT = 4;
parameter CRCPOLYID = 0;

parameter  BITFIFO = $clog2(FIFOCNT) + 1;
parameter PHWIDTH =  1 + KYWIDTH + DTWIDTH;
parameter BITVROW = NUMVROW>1 ? $clog2(NUMVROW) : 1;
parameter BITVBNK = NUMVBNK>1 ? $clog2(NUMVBNK) : 1;

parameter CRC_DELAY = 0;
parameter MEM_DELAY = 0;

input clk;
input rst;
output ready;

input                search_0;
input  [KYWIDTH-1:0] sr_key_0;
output [DTWIDTH-1:0] sr_dout_0;
output               sr_vld_0;
output               sr_hit_0;

input                update_1;
input  [KYWIDTH-1:0] up_key_1;
input  [DTWIDTH-1:0] up_din_1;
input                up_del_1;
output               up_bp_1;

output [NUMVBNK-1:0]          t1_writeA;
output [NUMVBNK*BITVROW -1:0] t1_addrA;
output [NUMVBNK*PHWIDTH-1:0]  t1_dinA;
output [NUMVBNK-1:0]          t1_readB;
output [NUMVBNK*BITVROW -1:0] t1_addrB;
input  [NUMVBNK*PHWIDTH-1:0]  t1_doutB;


reg [KYWIDTH-1:0] qup_key_1;
reg [DTWIDTH-1:0] qup_dat_1;
reg               qup_del_1;
reg               qup_en_1;

wire [NUMVBNK-1:0] mem_ready;

wire [KYWIDTH-1:0] select_key;
wire [BITVROW-1:0] select_row [0:NUMVBNK-1];

wire [BITVROW-1:0] sr_row_0 [0:NUMVBNK-1];
wire [BITVROW-1:0] qup_row_1 [0:NUMVBNK-1];

reg [KYWIDTH-1:0] key_dout [0:NUMVBNK-1];
reg [DTWIDTH-1:0] dat_dout [0:NUMVBNK-1];
reg vld_dout [0:NUMVBNK-1];

wire               disp_hit;
reg  [BITVBNK-1:0] disp_bnk;
wire [KYWIDTH-1:0] disp_key;
wire [DTWIDTH-1:0] disp_dat;

wire up_hit_1;
wire [BITVBNK-1:0] up_bnk_1;

reg [DTWIDTH-1:0] qsr_dout_0;
reg               qsr_del_0;
reg               qsr_hit_0;

reg bsr_hit_0;
reg [BITVBNK-1:0] sr_bnk_0;

reg ov_hit_1;
reg [BITVBNK-1:0] ov_bnk_1;

reg in_hit_1;
reg [BITVBNK-1:0] in_bnk_1;

reg [PHWIDTH-1:0] atom [0:NUMVBNK-1][0:NUMVROW-1];

reg [KYWIDTH+DTWIDTH+1-1:0] fifo [0:FIFOCNT-1];

reg[31:0] count;
reg[BITFIFO-1:0] head;
reg[BITFIFO-1:0] tail;
reg empty;
reg full;
assign empty = (count == 0);
assign full  = (count >= FIFOCNT);
assign up_bp_1 = full;

reg ready;
integer i,j;
always @(posedge clk)
  if(rst) begin
    qup_en_1 <= 1'b0;
    count <= 1'b0;
    head <= 1'b0;
    tail <= 1'b0;
    qsr_hit_0<= 1'b0;
    qsr_dout_0 <= {DTWIDTH{1'b0}};
    qsr_del_0 <= 1'b0;
    for(i=0;i<NUMVBNK;i++)
    begin
      for(j=0; j<NUMVROW;j++)
      begin
        atom[i][j] <= {PHWIDTH{1'b0}};
      end
    end
    for(i=0;i<FIFOCNT;i++) begin
      fifo[i] <= 1'b0;
    end
    ready = 1'b1;
  end else begin if(search_0 == 1'b1) begin
    qsr_hit_0 = 0;
    for(i=0;i<FIFOCNT;i++) begin
      if(fifo[i][KYWIDTH+DTWIDTH:DTWIDTH+1] == sr_key_0 && !qsr_hit_0)begin
        qsr_dout_0 <= fifo[i][DTWIDTH:1]; 
        qsr_del_0 <= fifo[i][0];
        qsr_hit_0 <= 1'b1;
      end
    end
  end
end


always @(posedge clk) begin
  if(!search_0) begin 
   if(!empty) begin
      qup_key_1 <= fifo[head][KYWIDTH+DTWIDTH+1-1:DTWIDTH+1];
      qup_dat_1 <= fifo[head][DTWIDTH:1];
      qup_del_1 <= fifo[head][0];
    //  qup_en_1 <= !qup_del_1;
     fifo[head] <= 0;
     if(qup_del_1) begin
        qup_en_1 <= 0;
      end else
        qup_en_1 <=1;
      count <= count-1;
      head <= (head+1)%FIFOCNT;
      fifo[head] <= 1'b0;
    end else begin
      qup_en_1 <= 1;
    end
  end
end

genvar crc_var;
generate for(crc_var=0;crc_var<NUMVBNK;crc_var=crc_var+1) begin : crc_loop

  wire   [BITVROW-1:0] crc_tmp_0 = 0 | sr_key_0 >> CRCPOLYID;
  zt_stl_shift #(.BITDATA(BITVROW), .DELAY(CRC_DELAY)) del_0 (.clk(clk), .din(crc_tmp_0), .dout(sr_row_0[crc_var]));

  wire   [BITVROW-1:0] crc_tmp_1 = 0 | qup_key_1 >> CRCPOLYID;
  zt_stl_shift #(.BITDATA(BITVROW), .DELAY(CRC_DELAY)) del_1 (.clk(clk), .din(crc_tmp_1), .dout(qup_row_1[crc_var]));

  wire   [BITVROW-1:0] crc_tmp_sel = 0 | select_key >> CRCPOLYID;
  zt_stl_shift #(.BITDATA(BITVROW), .DELAY(CRC_DELAY)) del_sel (.clk(clk), .din(crc_tmp_sel), .dout(select_row[crc_var]));
end
endgenerate

genvar bnk_var;
integer keyi,dati,vldi;
reg [BITVROW-1:0] var_sr_key;
generate for(bnk_var=0; bnk_var<NUMVBNK; bnk_var=bnk_var+1) begin : bnk_loop_read
  //var_sr_key <= search_0 ? sr_row_0[bnk_var] : qup_row_1[bnk_var]; 
  always @(posedge clk) begin
  if(search_0) begin
    var_sr_key <= sr_row_0[bnk_var];
  end else begin
    var_sr_key <=  qup_row_1[bnk_var]; 
  end
    if(rst) begin
      for(keyi=0;keyi<NUMVBNK;keyi++) begin
        key_dout[keyi] <= {KYWIDTH{1'b0}};
      end
      for(dati=0;dati<NUMVBNK;dati++) begin
        dat_dout[dati] <= {DTWIDTH{1'b0}};
      end
      for(vldi=0;vldi<NUMVBNK;vldi++) begin
        vld_dout[vldi] <= 0;
      end
    end
    if(search_0 | qup_en_1) begin
      vld_dout[bnk_var] <= atom[bnk_var][var_sr_key][0];
      key_dout[bnk_var] <= atom[bnk_var][var_sr_key][KYWIDTH:1];
      dat_dout[bnk_var] <= atom[bnk_var][var_sr_key][DTWIDTH+KYWIDTH:KYWIDTH+1];
    end
  end
end 
endgenerate

always_comb begin
  bsr_hit_0 = 0;
  sr_bnk_0 = 0;
  for(integer sbi_0=0; sbi_0<NUMVBNK; sbi_0=sbi_0+1)
    if(search_0 && !bsr_hit_0 && (sr_key_0 == key_dout[sbi_0]) && vld_dout[sbi_0]) begin
      bsr_hit_0  = 1'b1;
      sr_bnk_0 = sbi_0;
    end
  end

  assign sr_hit_0 = qsr_hit_0  ? !qsr_del_0 : bsr_hit_0;
  assign sr_dout_0 = qsr_hit_0 ? qsr_dout_0 : dat_dout[sr_bnk_0];
  assign sr_vld_0 = search_0;

  always_comb begin
    ov_hit_1 = 0;
    ov_bnk_1 = 0;
    for(integer sbi_1=0; sbi_1<NUMVBNK; sbi_1=sbi_1+1)
      if(qup_en_1 && !ov_hit_1 && (qup_key_1 == key_dout[sbi_1]) && vld_dout[sbi_1]) begin
        ov_hit_1  = 1'b1;
        ov_bnk_1 = sbi_1;
      end
    end

    always_comb begin
      in_hit_1 = 0;
      in_bnk_1 = 0;
      for(integer sbi_1=0; sbi_1<NUMVBNK; sbi_1=sbi_1+1)
        if(qup_en_1 && !qup_del_1 && !in_hit_1 && !vld_dout[sbi_1]) begin
          in_hit_1  = 1'b1;
          in_bnk_1 = sbi_1;
        end
      end

      always @(posedge clk)
        if(rst) begin  disp_bnk <= 0; end
        else begin disp_bnk <= (disp_bnk+1)%NUMVBNK; end

        assign disp_key = key_dout[disp_bnk];
      assign disp_dat = dat_dout[disp_bnk];

      assign up_hit_1 = ov_hit_1 || in_hit_1;
      assign up_bnk_1 = ov_hit_1 ? ov_bnk_1 : in_bnk_1;
      assign disp_hit = qup_en_1 && !qup_del_1 && !up_hit_1;

      genvar bnk_var_1;
      generate for(bnk_var_1=0; bnk_var_1<NUMVBNK; bnk_var_1=bnk_var_1+1) begin : bnk_loop_write
        always @(posedge clk) begin
          if(up_hit_1 ? (up_bnk_1 == bnk_var_1) : disp_hit && (disp_bnk == bnk_var_1)) begin
            atom[bnk_var_1][qup_row_1[bnk_var_1]] <= {qup_dat_1,qup_key_1,!qup_del_1};
          end
        end
      end
      endgenerate



      always @(posedge clk) begin
        if(update_1 && !full) begin
          fifo[tail] <= {up_key_1,up_din_1,up_del_1};
          tail <= (tail+1)%FIFOCNT;
          count <= count+1;
          if(disp_hit && (count+1 <= FIFOCNT)) begin
            fifo[tail] <= {disp_key,disp_dat,1'b0};
            tail <= (tail+1)%FIFOCNT;
            count <= count + 1;
          end
        end
      end

endmodule //zt_des_cuckoo_1sor1u
