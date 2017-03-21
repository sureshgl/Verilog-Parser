/*
 * zt_stl_atom_bw_1r2w_class.h
 *
 *  Created on: 06-Apr-2016
 *      Author: krpalle
 */


#include "../common/Int.h"
#include "../common/kiwibitset.h"


#ifndef ZT_STL_ATOM_BW_1R2W_CLASS_H_
#define ZT_STL_ATOM_BW_1R2W_CLASS_H_

class zt_stl_atom_bw_1r2w_class{
private :
	Int BITDATA;
	Int NUMADDR;
	Int SRAM_DELAY;
	Int ENAWPRI;
	Int BITADDR;
	Int RSTINIT;
	Int RSTSTRT;
	Int RSTINCR;
	Int FORMAL_FULL;

	kiwibitset *mem;
public:
	zt_stl_atom_bw_1r2w_class(){}
	zt_stl_atom_bw_1r2w_class(Int BITDATA,Int NUMADDR,Int SRAM_DELAY,Int ENAWPRI,Int BITADDR,Int RSTINIT,Int RSTSTRT,Int RSTINCR,Int FORMAL_FULL):
		BITDATA(BITDATA)
	,NUMADDR(NUMADDR)
	,SRAM_DELAY(SRAM_DELAY)
	,ENAWPRI(ENAWPRI)
	,BITADDR(BITADDR)
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
	void fn_rst(kiwibitset rst);
	void fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	void fn_write_1(kiwibitset write_1,kiwibitset wr_adr_1,kiwibitset wr_din_1,kiwibitset wr_bw_1);
	void fn_write_2(kiwibitset write_2,kiwibitset wr_adr_2,kiwibitset wr_din_2,kiwibitset wr_bw_2);
	~zt_stl_atom_bw_1r2w_class(){
		delete mem;
	}

};




#endif /* ZT_STL_ATOM_BW_1R2W_CLASS_H_ */
