
#include "zt_stl_flat_atom_2r2w_class.h"

void zt_stl_flat_atom_2r2w_class::fn_rst(kiwibitset rst){
	if (RSTINIT)
	{
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = new kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
}

void zt_stl_flat_atom_2r2w_class::fn_write_2(kiwibitset write_2,kiwibitset wr_adr_2,kiwibitset wr_din_2){
	if ( write_2 > 0 ) {
		mem[wr_adr_2] = wr_din_2;
	}
}

void zt_stl_flat_atom_2r2w_class::fn_write_3(kiwibitset write_3,kiwibitset wr_adr_3,kiwibitset wr_din_3){
	if ( write_3 > 0 ) {
		mem[wr_adr_3] = wr_din_3;
	}
}

void zt_stl_flat_atom_2r2w_class::fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0){
	if( read_0 )
	{
		*rd_dout_0 = (mem[rd_adr_0]);
	}
}

void zt_stl_flat_atom_2r2w_class::fn_read_1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1){
	if( read_1 )
	{
		*rd_dout_1 = (mem[rd_adr_1]);
	}
}

void zt_stl_flat_atom_2r2w_class::fn_flatout(kiwibitset* fout){
    for (int i=NUMADDR-1; i>=0; i--) {
        *fout =  *fout << BITDATA;
        *fout =  *fout | mem[i];
    }
}



