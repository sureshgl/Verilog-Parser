

#include "zt_stl_mem_psd_mrnw_class.h"

void zt_stl_mem_psd_mrnw_class::fn_rst(kiwibitset rst){
	if (RSTINIT)
	{
		for(int i = 0; i < NUMVBNK; i++ ){
			for(int j = 0; i < NUMVROW; i++ ){
				mem[i][j] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
			}
		}

	}
}

void zt_stl_mem_psd_mrnw_class::fn_read(kiwibitset read,kiwibitset rd_bnk,kiwibitset rd_row,kiwibitset* rd_dout){
	if( read )
	{
		*rd_dout = mem[rd_bnk][rd_row];
	}
}
void zt_stl_mem_psd_mrnw_class::fn_write(kiwibitset write,kiwibitset wr_bnk,kiwibitset wr_row,kiwibitset wr_din){
	if ( write ){
		mem[wr_bnk][wr_row] = wr_din;
	}
}




