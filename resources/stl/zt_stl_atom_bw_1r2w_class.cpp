/*
 * zt_stl_atom_bw_1r2w_class.cpp
 *
 *  Created on: 06-Apr-2016
 *      Author: krpalle
 */

#include "zt_stl_atom_bw_1r2w_class.h"

void zt_stl_atom_bw_1r2w_class::fn_rst(kiwibitset rst){
	if (RSTINIT)
		{
			for(int i = 0; i < NUMADDR; i++ )
			{
				mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
			}
		}
}

void zt_stl_atom_bw_1r2w_class::fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0){
	if(read_0)
		*rd_dout_0 = mem[rd_adr_0];
}

void zt_stl_atom_bw_1r2w_class::fn_write_1(kiwibitset write_1,kiwibitset wr_adr_1,kiwibitset wr_din_1,kiwibitset wr_bw_1){
	if(write_1){
		mem[wr_adr_1] = (mem[wr_adr_1] & (~wr_bw_1)) | wr_din_1;
	}
}

void zt_stl_atom_bw_1r2w_class::fn_write_2(kiwibitset write_2,kiwibitset wr_adr_2,kiwibitset wr_din_2,kiwibitset wr_bw_2){
	if(write_2){
		mem[wr_adr_2] = (mem[wr_adr_2] & (~wr_bw_2)) | wr_din_2;
	}
}


