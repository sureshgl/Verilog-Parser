
#include "zt_stl_rsh_class.h"

void zt_stl_rsh_class::fn_zt_stl_rsh(kiwibitset shift,kiwibitset din,kiwibitset* dout){
	for (int i=0; i<NUMWRDS; i++){
		if (i==shift)
			*dout  = din.get(i*BITDATA,(i+1)*BITDATA-1);
	}
}
