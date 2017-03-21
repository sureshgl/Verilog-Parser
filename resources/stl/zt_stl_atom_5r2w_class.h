
#include "../common/Int.h"
#include "../common/kiwibitset.h"

using namespace std;
#ifndef ZT_STL_ATOM_5R2W_CLASS_H_
#define ZT_STL_ATOM_5R2W_CLASS_H_
class zt_stl_atom_5r2w_class{
private :
	Int BITDATA;
	Int NUMADDR;
	Int SRAM_DELAY;
	Int ENAWPRI;
	Int BITADDR;
	Int RSTINIT;
	Int RSTSTRT;
	Int RSTINCR;
	Int FORMAL_FULL;

	kiwibitset *mem;
public:
	zt_stl_atom_5r2w_class(){}
	zt_stl_atom_5r2w_class(Int NUMADDR,Int BITADDR,Int SRAM_DELAY,Int ENAWPRI,Int RSTINIT,Int RSTSTRT,Int BITDATA,Int RSTINCR,Int FORMAL_FULL):
		BITDATA(BITDATA)
	,NUMADDR(NUMADDR)
	,SRAM_DELAY(SRAM_DELAY)
	,ENAWPRI(ENAWPRI)
	,BITADDR(BITADDR)
	,RSTINIT(RSTINIT)
	,RSTSTRT(RSTSTRT)
	,RSTINCR(RSTINCR)
	,FORMAL_FULL(FORMAL_FULL)
	{
		mem = new kiwibitset[NUMADDR];
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
	void fn_rst(kiwibitset rst);
	void fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	void fn_read_1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1);
	void fn_read_2(kiwibitset read_2,kiwibitset rd_adr_2,kiwibitset* rd_dout_2);
	void fn_read_3(kiwibitset read_3,kiwibitset rd_adr_3,kiwibitset* rd_dout_3);
	void fn_read_4(kiwibitset read_4,kiwibitset rd_adr_4,kiwibitset* rd_dout_4);
	void fn_write_5(kiwibitset write_5,kiwibitset wr_adr_5,kiwibitset wr_din_5);
	void fn_write_6(kiwibitset write_6,kiwibitset wr_adr_6,kiwibitset wr_din_6);
	~zt_stl_atom_5r2w_class(){
		delete mem;
	}
};
#endif
