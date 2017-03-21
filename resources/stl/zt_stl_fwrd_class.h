#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_FWRD_CLASS_H_
#define ZT_STL_FWRD_CLASS_H_

class zt_stl_fwrd_class {
public:
	Int NUMRDPT;
	Int NUMWRPT;
	Int BITADDR;
	Int BITDATA;
	Int PIPEDEL;

	zt_stl_fwrd_class(){}
	zt_stl_fwrd_class(Int NUMRDPT,Int NUMWRPT,Int BITADDR,Int BITDATA,Int PIPEDEL):
		NUMRDPT(NUMRDPT),NUMWRPT(NUMWRPT),BITADDR(BITADDR),BITDATA(BITDATA),PIPEDEL(PIPEDEL){}

	void fn_zt_stl_fwrd(kiwibitset din, kiwibitset* dout);

};



#endif /* ZT_STL_FWRD_H_ */
