/*
 * zt_des_2r1wt_2ror1w_atom_ff.h
 *
 *  Created on: 06-Apr-2016
 *      Author: krpalle
 */

#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_DES_2R1WT_2ROR1W_ATOM_FF_H_
#define ZT_DES_2R1WT_2ROR1W_ATOM_FF_H_

class zt_des_2r1wt_2ror1w_atom_ff_class{
private:
	Int NUMADDR;
	Int BITADDR;
	Int BITDATA;
	Int DAT_DELAY;
	Int FIFOCNT;
	Int BITFIFO;
	kiwibitset *mem;
public:
	zt_des_2r1wt_2ror1w_atom_ff_class(){}
	zt_des_2r1wt_2ror1w_atom_ff_class(Int NUMADDR,Int BITADDR,Int BITDATA,Int DAT_DELAY,Int FIFOCNT):
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
	void fn_write2(kiwibitset write_2,kiwibitset wr_adr_2,kiwibitset wr_din_2);
	void fn_read1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1);
	void fn_read0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	~zt_des_2r1wt_2ror1w_atom_ff_class(){
		delete mem;
	}
};


#endif /* ZT_DES_2R1WT_2ROR1W_ATOM_FF_H_ */
