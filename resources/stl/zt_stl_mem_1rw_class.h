/*
 * zt_stl_mem_1rw_class.h
 *
 *  Created on: 02-Mar-2016
 *      Author: kmalempa
 */

#include "../common/kiwibitset.h"
#include "../common/Int.h"

using namespace std;
#ifndef ZT_STL_MEM_1RW_CLASS_H_
#define ZT_STL_MEM_1RW_CLASS_H_
class zt_stl_mem_1rw_class{
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

	zt_stl_mem_1rw_class(){}
	zt_stl_mem_1rw_class(Int NUMADDR,Int BITADDR,Int BITDATA,Int SRAM_DELAY,Int RSTINIT,Int RSTSTRT,Int RSTINCR,Int FORMAL_FULL):
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
	void fn_readWrite(kiwibitset read_0,kiwibitset addr_0,kiwibitset write_0,kiwibitset din_0,kiwibitset* dout_0);
	void fn_rst(kiwibitset rst);
	~zt_stl_mem_1rw_class(){
		delete mem;
	}
};
#endif
