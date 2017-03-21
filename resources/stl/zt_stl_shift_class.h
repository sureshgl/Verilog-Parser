#include "../common/Int.h"
#include "../common/kiwibitset.h"

using namespace std;
#ifndef ZT_STL_SHIFT_CLASS_H_
#define ZT_STL_SHIFT_CLASS_H_
class zt_stl_shift_class{
public :
	Int BITDATA;
	Int DELAY;
	zt_stl_shift_class(){}
	zt_stl_shift_class(Int BITDATA,Int DELAY):BITDATA(BITDATA),DELAY(DELAY){}
	void fn_zt_stl_shift(kiwibitset din,kiwibitset* dout);
};
#endif
