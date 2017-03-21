#include "../common/Int.h"
#include "../common/kiwibitset.h"

#ifndef ZT_STL_FLAT_ATOM_2R2W_CLASS_H_
#define ZT_STL_FLAT_ATOM_2R2W_CLASS_H_
class zt_stl_flat_atom_2r2w_class{
private:
	Int NUMADDR;
	Int BITADDR;
	Int BITDATA;
	Int SRAM_DELAY;
	Int ENAWPRI;
	Int RSTINIT;
	Int RSTSTRT;
	Int RSTINCR;
	Int FORMAL_FULL;
	kiwibitset *mem;
public:
	zt_stl_flat_atom_2r2w_class(){}
	zt_stl_flat_atom_2r2w_class(Int NUMADDR,Int BITADDR,Int BITDATA,Int SRAM_DELAY,Int ENAWPRI,Int RSTINIT,Int RSTSTRT,Int RSTINCR,Int FORMAL_FULL):
		NUMADDR(NUMADDR),
		BITADDR(BITADDR),
		BITDATA(BITDATA),
		SRAM_DELAY(SRAM_DELAY),
		ENAWPRI(ENAWPRI),
		RSTINIT(RSTINIT),
		RSTSTRT(RSTSTRT),
		RSTINCR(RSTINCR),
		FORMAL_FULL(FORMAL_FULL)
	{
		mem = new kiwibitset[NUMADDR];
		for(int i = 0; i < NUMADDR; i++ )
		{
			mem[i] = kiwibitset((size_t)BITDATA,RSTSTRT + i*RSTINCR);
		}
	}
	void fn_rst(kiwibitset rst);
	void fn_write_2(kiwibitset write_2,kiwibitset wr_adr_2,kiwibitset wr_din_2);
	void fn_write_3(kiwibitset write_3,kiwibitset wr_adr_3,kiwibitset wr_din_3);
	void fn_read_0(kiwibitset read_0,kiwibitset rd_adr_0,kiwibitset* rd_dout_0);
	void fn_read_1(kiwibitset read_1,kiwibitset rd_adr_1,kiwibitset* rd_dout_1);
    void fn_flatout(kiwibitset* fout);
	~zt_stl_flat_atom_2r2w_class(){
		delete mem;
	}
};

#endif /* ZT_STL_FLAT_ATOM_2R2W_CLASS_H_ */
