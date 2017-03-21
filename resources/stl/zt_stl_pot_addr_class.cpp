#include "zt_stl_pot_addr_class.h"

void zt_stl_pot_addr_class::fn_zt_stl_pot_addr(kiwibitset vaddr,kiwibitset* vbadr,kiwibitset* vradr){
	if(NUMVROW == 1)  {
		*vbadr = vaddr;
		*vradr = 1; //1'b0;
	}
	else if (NUMVBNK == 1) {
		*vbadr = 1;
		*vradr = vaddr; //1'b0;
	}
	else if (NUMVROW == (1<<BITVROW)) {
		*vbadr = vaddr.get(BITVROW,BITADDR-1);
		*vradr = vaddr.get(0,BITVROW-1);
	}
	else if (NUMVBNK == (1<<BITVBNK)) {
		*vbadr = vaddr.get(0,BITVBNK-1);
		*vradr = vaddr.get(BITVBNK,BITADDR-1);
	}
	else {
		*vbadr = 1 ;//{BITVBNK{1'hx}};
		*vradr = 1 ;// {BITVROW{1'hx}};
	}
}


