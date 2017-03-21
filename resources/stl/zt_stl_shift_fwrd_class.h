#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_SHIFT_FWRD_CLASS_H_
#define ZT_STL_SHIFT_FWRD_CLASS_H_

class zt_stl_shift_fwrd_class {
public:
	Int BITDATA;
	Int BITTAGW;
	Int DELAY;
	Int NUMWRP;

	zt_stl_shift_fwrd_class(){}
	zt_stl_shift_fwrd_class(Int BITDATA,Int BITTAGW,Int DELAY,Int NUMWRP):
		BITDATA(BITDATA),BITTAGW(BITTAGW),DELAY(DELAY),NUMWRP(NUMWRP){}

	void fn_zt_stl_shift_fwrd(kiwibitset din, kiwibitset* dout);
};

#endif /* ZT_STL_SHIFT_FWRD_H_ */
