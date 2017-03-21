/*
 * zt_stl_mem_1r1w_class.h
 *
 *  Created on: 02-Mar-2016
 *      Author: kmalempa
 */

#include "../common/Int.h"
#include "../common/kiwibitset.h"

using namespace std;
#ifndef ZT_STL_MEM_1R1W_CLASS_H_
#define ZT_STL_MEM_1R1W_CLASS_H_
class zt_stl_mem_1r1w_class{
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

	zt_stl_mem_1r1w_class(){}
	zt_stl_mem_1r1w_class(Int NUMADDR,Int BITADDR,Int BITDATA,Int SRAM_DELAY,Int RSTINIT,Int RSTSTRT,Int RSTINCR,Int FORMAL_FULL):
		NUMADDR(NUMADDR)
	,BITADDR(BITADDR)
	,BITDATA(BITDATA)
	,SRAM_DELAY(SRAM_DELAY)
	,RSTINIT(RSTINIT)
	,RSTSTRT(RSTSTRT)
	,RSTINCR(RSTINCR)
	,FORMAL_FULL(FORMAL_FULL)

	{
		mem = new kiwibitset[NUMADDR];
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
	void fn_read_0(kiwibitset read_0, kiwibitset addr_0, kiwibitset* rd_dout_0);
    void fn_write_1(kiwibitset write_1, kiwibitset wr_adr_1, kiwibitset wr_din_1);
	void fn_rst(kiwibitset rst);
	~zt_stl_mem_1r1w_class(){
		delete mem;
	}
};
#endif
