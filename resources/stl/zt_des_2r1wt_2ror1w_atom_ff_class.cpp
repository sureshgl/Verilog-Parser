/*
 * zt_des_2r1wt_2ror1w_atom_ff_class.cpp
 *
 *  Created on: 06-Apr-2016
 *      Author: krpalle
 */

#include "zt_des_2r1wt_2ror1w_atom_ff_class.h"

void zt_des_2r1wt_2ror1w_atom_ff_class::fn_rst(kiwibitset rst){
	for(int i=0;i<FIFOCNT;i++){
		mem[i] = 0;
	}
}

void zt_des_2r1wt_2ror1w_atom_ff_class::fn_write2(kiwibitset write_2,kiwibitset wr_adr_2,kiwibitset wr_din_2){
	if(write_2){
		mem[wr_adr_2] = wr_din_2;
	}
}

void zt_des_2r1wt_2ror1w_atom_ff_class::fn_read1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1){
	if(read_1){
		*rd_dout_1 = mem[rd_adr_1];
	}
}

void zt_des_2r1wt_2ror1w_atom_ff_class::fn_read0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0){
	if(read_0){
		*rd_dout_0 = mem[rd_adr_0];
	}
}

