#include "../common/Int.h"
#include "../common/kiwibitset.h"

using namespace std;
#ifndef ZT_STL_WRPRI_CLASS_H_
#define ZT_STL_WRPRI_CLASS_H_

class zt_stl_wrpri_class{
public :
	Int BITADDR;
	Int NUMWRPT;
	Int ENAWPRI;
	kiwibitset* wr_out;
	kiwibitset* wr_adr_int;


	zt_stl_wrpri_class(){}
	zt_stl_wrpri_class(Int BITADDR,Int NUMWRPT,Int ENAWPRI):
		BITADDR(BITADDR)
	,NUMWRPT(NUMWRPT)
	,ENAWPRI(ENAWPRI)
	,wr_out(new kiwibitset(1,0))
	,wr_adr_int(initialize_array(NUMWRPT-1-0+1,BITADDR-1-0+1))
	{

	}
	void fn_write(kiwibitset wr_in,kiwibitset wr_adr,kiwibitset* wr_out);
	~zt_stl_wrpri_class(){
	}

};

#endif /* ZT_STL_WRPRI_CLASS_H_ */
