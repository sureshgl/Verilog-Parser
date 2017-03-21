/*
 * zt_stl_atom_2r1w_class.h
 *
 *  Created on: 06-Apr-2016
 *      Author: kmalempa
 */
#include "../common/Int.h"
#include "../common/kiwibitset.h"


#ifndef ZT_STL_ATOM_2R1W_CLASS_H_
#define ZT_STL_ATOM_2R1W_CLASS_H_

class zt_stl_atom_2r1w_class {
public :
	kiwibitset *mem;
	Int NUMADDR;
	Int BITADDR;
	Int BITDATA;
	Int SRAM_DELAY;
	Int RSTINIT;
	Int RSTSTRT;
	Int RSTINCR;
	Int FORMAL_FULL;

	zt_stl_atom_2r1w_class(){}
	zt_stl_atom_2r1w_class(Int NUMADDR,
			Int BITADDR,
			Int BITDATA,
			Int SRAM_DELAY,
			Int RSTINIT,
			Int RSTSTRT,
			Int RSTINCR,
			Int FORMAL_FULL):
        NUMADDR(NUMADDR),
        BITADDR(BITADDR),
        BITDATA(BITDATA),
        SRAM_DELAY(SRAM_DELAY),
        RSTINIT(RSTINIT),
        RSTSTRT(RSTSTRT),
        RSTINCR(RSTINCR),
        FORMAL_FULL(FORMAL_FULL)
	{
		mem = new kiwibitset[NUMADDR];
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
	void fn_write_2(kiwibitset write_2,kiwibitset wr_adr_2 ,kiwibitset wr_din_2);
	void fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	void fn_read_1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1);
	void fn_rst(kiwibitset rst);
	~zt_stl_atom_2r1w_class(){
		delete mem;
	}
};



#endif /* ZT_STL_ATOM_1R1W_CLASS_H_ */
