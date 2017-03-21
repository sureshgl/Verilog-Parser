/*
 * zt_des_1r1wt_1rw_atom_ff.h
 *
 *  Created on: 06-Apr-2016
 *      Author: krpalle
 */

#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_DES_1R1WT_1RW_ATOM_FF_CLASS_H_
#define ZT_DES_1R1WT_1RW_ATOM_FF_CLASS_H_

class zt_des_1r1wt_1rw_atom_ff_class{
private:
	Int NUMADDR;
	Int BITADDR;
	Int BITDATA;
	Int DAT_DELAY;
	Int FIFOCNT;
	Int BITFIFO;
	kiwibitset *mem;
public:
	zt_des_1r1wt_1rw_atom_ff_class(){}
	zt_des_1r1wt_1rw_atom_ff_class(Int NUMADDR,Int BITADDR,Int BITDATA,Int DAT_DELAY,Int FIFOCNT):
		NUMADDR(NUMADDR)
	,BITADDR(BITADDR)
	,BITDATA(BITDATA)
	,DAT_DELAY(DAT_DELAY)
	,FIFOCNT(FIFOCNT)
	,BITFIFO((FIFOCNT > 1) ? kiwi_log2(FIFOCNT) : 1)
	{
		mem = new kiwibitset[FIFOCNT];
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = new kiwibitset((size_t)BITDATA,0);
		}

	}
	void fn_rst(kiwibitset rst);
	void fn_write(kiwibitset write_1,kiwibitset wr_adr_1,kiwibitset wr_din_1);
	void fn_read(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	~zt_des_1r1wt_1rw_atom_ff_class(){
		delete mem;
	}
};



#endif /* ZT_DES_1R1WT_1RW_ATOM_FF_CLASS_H_ */
