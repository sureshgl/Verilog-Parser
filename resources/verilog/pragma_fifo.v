module fifo_basic(rst,clk,ready,full,empty,pu_en,pu_data,po_en,po_data);
//pragma functionality_splitting {"functions" : [{"name" : "push" , "inputPorts" : ["pu_en","pu_data"], "outputPorts" : []},{"name" : "pop" , "inputPorts" : ["po_en"], "outputPorts" : ["po_data"]}, { "name" : "rst" , "inputPorts" : ["rst"], "outputPorts" : []}]}

parameter DEPTH = 32;
parameter LG_DEPTH = 5;
parameter WIDTH = 10;

input rst;
input clk;
output reg ready;

output full;
output empty;

input pu_en;
input [WIDTH-1:0] pu_data;

input po_en;
output reg [WIDTH-1:0] po_data;

reg [WIDTH-1:0] mem [0:DEPTH-1];

reg [LG_DEPTH-1:0] head;
reg [LG_DEPTH-1:0] tail;
reg [LG_DEPTH:0] count;
assign empty = (count == 0);
assign full  = (count == DEPTH);

wire push = !full  && pu_en;
wire pop  = !empty && po_en;

always_comb
  po_data = mem[head];

always @(posedge clk) begin
  if(rst) begin
    head <= 0; 
    tail <= 0;
    count <= 0;
    ready <= 1;
    //for(int i=0; i<DEPTH;i++) mem[i] <= 0;
  end else begin
    if (push) begin
      mem[tail] <= pu_data;
      if(tail == DEPTH-1)
        tail <= 0;
      else 
        tail <= tail+1;
    end
    if (pop) begin
      if(head == DEPTH-1) 
        head <= 0;
      else 
        head <= head +1;
    end
    if (push && pop) 
      count <= count;
    else if (push) 
      count <= count + 1;
    else if (pop) 
      count <= count - 1;
    else 
      count <= count;
  end
end

endmodule
