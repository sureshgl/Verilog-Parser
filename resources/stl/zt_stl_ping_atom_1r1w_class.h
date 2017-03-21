#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_PING_ATOM_1R1W_CLASS_H_
#define ZT_STL_PING_ATOM_1R1W_CLASS_H_

class zt_stl_ping_atom_1r1w_class{
private:
	Int NUMQPRT;
	Int BITQPRT;
	Int NUMPING;
	Int BITPING;
	Int BITDATA;
	Int SRAM_DELAY;
	Int RSTINIT;
	Int RSTSTRT;
	Int RSTINCR;
	Int FORMAL_FULL;
	kiwibitset *mem;
public:
	zt_stl_ping_atom_1r1w_class(){}
	zt_stl_ping_atom_1r1w_class(Int NUMQPRT,Int BITQPRT,Int NUMPING,Int BITPING,Int BITDATA,Int SRAM_DELAY,Int RSTINIT,Int RSTSTRT,Int RSTINCR,Int FORMAL_FULL):
		NUMQPRT(NUMQPRT),
		BITQPRT(BITQPRT),
		NUMPING(NUMPING),
		BITPING(BITPING),
		BITDATA(BITDATA),
		SRAM_DELAY(SRAM_DELAY),
		RSTINIT(RSTINIT),
		RSTSTRT(RSTSTRT),
		RSTINCR(RSTINCR),
		FORMAL_FULL(FORMAL_FULL)
	{
		mem = new kiwibitset[NUMQPRT];
		for(int i = 0; i < NUMQPRT; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
	void fn_rst(kiwibitset rst);
	void fn_write_1(kiwibitset write_1,kiwibitset wr_adr_1,kiwibitset wr_din_1);
	void fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	~zt_stl_ping_atom_1r1w_class(){
		delete mem;
	}
};



#endif /* ZT_STL_PING_ATOM_1R1W_CLASS_H_ */
