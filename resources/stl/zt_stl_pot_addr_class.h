/*
 * zt_stl_pot_addr.h
 *
 *  Created on: 07-Apr-2016
 *      Author: kmalempa
 */

#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_POT_ADDR_CLASS_H_
#define ZT_STL_POT_ADDR_CLASS_H_

class zt_stl_pot_addr_class {
	Int NUMVBNK;
	Int NUMVROW;
	Int NUMADDR;
	Int BITADDR;
	Int BITVBNK;
	Int BITVROW;


	zt_stl_pot_addr_class(){}
	zt_stl_pot_addr_class(Int NUMVBNK, Int NUMVROW):
		NUMVBNK(NUMVBNK),NUMVROW(NUMVROW),NUMADDR(NUMVBNK*NUMVROW),BITADDR((NUMADDR>1) ? kiwi_log2(NUMADDR) : 1),
		BITVBNK((NUMVBNK>1) ? kiwi_log2(NUMVBNK) : 1),BITVROW((NUMVROW>1) ? kiwi_log2(NUMVROW) : 1) {}

	void fn_zt_stl_pot_addr(kiwibitset vaddr,kiwibitset* vbadr,kiwibitset* vradr);
};



#endif /* ZT_STL_POT_ADDR_H_ */
