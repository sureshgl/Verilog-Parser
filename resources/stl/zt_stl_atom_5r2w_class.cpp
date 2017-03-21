/*
 * zt_stl_atom_5r2w_class.cpp
 *
 *  Created on: 01-Mar-2016
 *      Author: krpalle
 */

#include "zt_stl_atom_5r2w_class.h"

void zt_stl_atom_5r2w_class::fn_rst(kiwibitset rst){
	if (RSTINIT)
	{
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
}

void zt_stl_atom_5r2w_class::fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0){
	if( read_0 )
	{
		*rd_dout_0 = mem[rd_adr_0];
	}
}
void zt_stl_atom_5r2w_class::fn_read_1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1){
	if( read_1 )
	{
		*rd_dout_1 = mem[rd_adr_1];
	}
}
void zt_stl_atom_5r2w_class::fn_read_2(kiwibitset read_2,kiwibitset rd_adr_2,kiwibitset* rd_dout_2){
	if( read_2 )
	{
		*rd_dout_2 = mem[rd_adr_2];
	}
}
void zt_stl_atom_5r2w_class::fn_read_3(kiwibitset read_3,kiwibitset rd_adr_3,kiwibitset* rd_dout_3){
	if( read_3 )
	{
		*rd_dout_3 = mem[rd_adr_3];
	}
}
void zt_stl_atom_5r2w_class::fn_read_4(kiwibitset read_4,kiwibitset rd_adr_4,kiwibitset* rd_dout_4){
	if( read_4 )
	{
		*rd_dout_4 = mem[rd_adr_4];
	}
}
void zt_stl_atom_5r2w_class::fn_write_5(kiwibitset write_5,kiwibitset wr_adr_5,kiwibitset wr_din_5){
	if ( write_5)
		mem[wr_adr_5] = wr_din_5;
}
void zt_stl_atom_5r2w_class::fn_write_6(kiwibitset write_6,kiwibitset wr_adr_6,kiwibitset wr_din_6){
	if ( write_6)
		mem[wr_adr_6] = wr_din_6;
}
