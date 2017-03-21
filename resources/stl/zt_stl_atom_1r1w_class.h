/*
 * zt_stl_atom_1r1w_class.h
 *
 *  Created on: 06-Apr-2016
 *      Author: kmalempa
 */
#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_ATOM_1R1W_CLASS_H_
#define ZT_STL_ATOM_1R1W_CLASS_H_

class zt_stl_atom_1r1w_class {
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

	zt_stl_atom_1r1w_class(){}
	zt_stl_atom_1r1w_class(Int NUMADDR,
			Int BITADDR,
			Int BITDATA,
			Int SRAM_DELAY,
			Int RSTINIT,
			Int RSTSTRT,
			Int RSTINCR,
			Int FORMAL_FULL)
	{
		mem = new kiwibitset[NUMADDR];
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
	void fn_write(kiwibitset write_1,kiwibitset wr_adr_1 ,kiwibitset wr_din_1);
	void fn_read(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	void fn_rst(kiwibitset rst);
	~zt_stl_atom_1r1w_class(){
		delete mem;
	}
};



#endif /* ZT_STL_ATOM_1R1W_CLASS_H_ */
