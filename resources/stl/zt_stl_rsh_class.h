#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_RSH_CLASS_H_
#define ZT_STL_RSH_CLASS_H_
class zt_stl_rsh_class{
private:
	Int  NUMWRDS;
	Int  BITDATA;
	Int  BITWRDS;

public :
	zt_stl_rsh_class(){}
	zt_stl_rsh_class(Int NUMWRDS,Int BITDATA,Int BITWRDS):
		NUMWRDS(NUMWRDS),
		BITDATA(BITDATA),
		BITWRDS((NUMWRDS>1) ? kiwi_log2(NUMWRDS) : 1)
	{

	}
	void fn_zt_stl_rsh(kiwibitset shift,kiwibitset din,kiwibitset* dout);
	~zt_stl_rsh_class(){

	}
};
#endif /* ZT_STL_RSH_CLASS_H_ */
