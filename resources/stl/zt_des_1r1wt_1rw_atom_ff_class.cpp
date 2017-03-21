/*
 * zt_des_1r1wt_1rw_atom_ff.cpp
 *
 *  Created on: 06-Apr-2016
 *      Author: krpalle
 */
#include "zt_des_1r1wt_1rw_atom_ff_class.h"

void zt_des_1r1wt_1rw_atom_ff_class::fn_rst(kiwibitset rst){
	for(int i=0;i<FIFOCNT;i++){
		mem[i] = 0;
	}
}

void zt_des_1r1wt_1rw_atom_ff_class::fn_write(kiwibitset write_1,kiwibitset wr_adr_1,kiwibitset wr_din_1){
	if(write_1){
		mem[wr_adr_1] = wr_din_1;
	}
}

void zt_des_1r1wt_1rw_atom_ff_class::fn_read(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0){
	if(read_0){
		*rd_dout_0 = mem[rd_adr_0];
	}
}

