
#include "zt_stl_ping_atom_1r1w_class.h"

void zt_stl_ping_atom_1r1w_class::fn_rst(kiwibitset rst){
	if (RSTINIT)
	{
		for(int i = 0; i < NUMQPRT; i++ )
		{
			mem[i] = new kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
}

void zt_stl_ping_atom_1r1w_class::fn_write_1(kiwibitset write_1,kiwibitset wr_adr_1,kiwibitset wr_din_1){
	if ( write_1 > 0 )
		mem[wr_adr_1] = wr_din_1;
}

void zt_stl_ping_atom_1r1w_class::fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0){
	if( read_0 )
	{
		*rd_dout_0 = mem[rd_adr_0];
	}
}
