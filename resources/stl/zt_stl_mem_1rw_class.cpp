#include "zt_stl_mem_1rw_class.h"

void zt_stl_mem_1rw_class::fn_rst(kiwibitset rst){
	for(int i = 0; i < NUMADDR; i++ )
	{
		mem[i] = 0;
	}
}

void zt_stl_mem_1rw_class::fn_readWrite(kiwibitset read_0,kiwibitset addr_0,kiwibitset write_0,kiwibitset din_0,kiwibitset* dout_0){
	if( read_0 )
	{
		*dout_0 = (mem[addr_0]);
	}else
		if ( write_0 ){
			mem[addr_0] = din_0;
		}
}




