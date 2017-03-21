module zt_stl_shift (
  clk, din, dout
);

parameter BITDATA = 8;
parameter DELAY   = 0;

input                clk;
input  [BITDATA-1:0] din;
output [BITDATA-1:0] dout;

reg [BITDATA-1:0]    din_reg [0:DELAY];

genvar fdel_var;
generate for (fdel_var=0; fdel_var<=DELAY; fdel_var=fdel_var+1) begin: fdel_loop
  if (fdel_var>0) begin: flp_loop
    always @(posedge clk)
      din_reg[fdel_var] <= din_reg[fdel_var-1];
  end else begin: nflp_loop
    always_comb 
      din_reg[fdel_var] = din;
  end
end
endgenerate

assign dout = din_reg[DELAY];

endmodule // zt_stl_shift

