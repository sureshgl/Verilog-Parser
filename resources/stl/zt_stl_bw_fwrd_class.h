#include "../common/Int.h"
#include "../common/kiwibitset.h"

using namespace std;
#ifndef ZT_STL_BW_FWRD_CLASS_H_
#define ZT_STL_BW_FWRD_CLASS_H_

class zt_stl_bw_fwrd_class{
private :
	Int NUMRDPT;
	Int NUMWRPT;
	Int BITADDR;
	Int BITDATA;
	Int PIPEDEL;

public :
	zt_stl_bw_fwrd_class(){}
	zt_stl_bw_fwrd_class(Int NUMRDPT,Int NUMWRPT,Int BITADDR,Int BITDATA,Int PIPEDEL):
		NUMRDPT(NUMRDPT),
		NUMWRPT(NUMWRPT),
		BITADDR(BITADDR),
		BITDATA(BITDATA),
		PIPEDEL(PIPEDEL)
	{
	}
	void fn_zt_stl_bw_fwrd_class(kiwibitset read,kiwibitset radr,kiwibitset* fdout,kiwibitset* fbw,kiwibitset write,kiwibitset wadr,kiwibitset wdin,kiwibitset wbw);

	~zt_stl_bw_fwrd_class(){}
};



#endif /* ZT_STL_BW_FWRD_CLASS_H_ */
