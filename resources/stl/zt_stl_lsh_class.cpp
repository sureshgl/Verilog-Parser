
#include "zt_stl_lsh_class.h"

void zt_stl_lsh_class::fn_zt_stl_lsh(kiwibitset shift,kiwibitset din,kiwibitset* dout){
	for (int i=0; i<NUMWRDS; i++){
		if (i==shift)
			dout->set(i*BITDATA,(i+1)*BITDATA-1,din);
	}
}




