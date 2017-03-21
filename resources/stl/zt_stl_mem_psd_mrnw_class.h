#include "../common/Int.h"
#include "../common/kiwibitset.h"

using namespace std;
#ifndef ZT_STL_MEM_PSD_MRNW_CLASS_H_
#define ZT_STL_MEM_PSD_MRNW_CLASS_H_


class zt_stl_mem_psd_mrnw_class{
private :
	Int NUMRDPT;
	Int NUMWRPT;
	Int NUMVBNK;
	Int NUMVROW;
	Int BITDATA;
	Int SRAM_DELAY;
	Int RSTINIT;
	Int RSTSTRT;
	Int RSTINCR;
	Int RSTFLAT;
	Int FORMAL_FULL;
	kiwibitset **mem;
public:
	zt_stl_mem_psd_mrnw_class(){}
	zt_stl_mem_psd_mrnw_class(Int NUMRDPT,Int NUMWRPT,Int NUMVBNK,Int NUMVROW,Int BITDATA,Int SRAM_DELAY,Int RSTINIT,Int RSTSTRT,Int RSTINCR,Int RSTFLAT,Int FORMAL_FULL):
		NUMRDPT(NUMRDPT),
		NUMWRPT(NUMWRPT),
		NUMVBNK(NUMVBNK),
		NUMVROW(NUMVROW),
		BITDATA(BITDATA),
		SRAM_DELAY(SRAM_DELAY),
		RSTINIT(RSTINIT),
		RSTSTRT(RSTSTRT),
		RSTINCR(RSTINCR),
		RSTFLAT(RSTFLAT),
		FORMAL_FULL(FORMAL_FULL)
	{
		mem = new kiwibitset*[NUMVBNK];
		for(int i = 0; i < NUMVBNK; i++ )
		{
			*mem[i] = new kiwibitset*[NUMVROW];
		}
		for(int i = 0; i < NUMVBNK; i++ ){
			for(int j = 0; i < NUMVROW; i++ ){
				mem[i][j] = kiwibitset(BITDATA,0);
			}
		}
	}
	void fn_read(kiwibitset read,kiwibitset rd_bnk,kiwibitset rd_row,kiwibitset* rd_dout);
	void fn_write(kiwibitset write,kiwibitset wr_bnk,kiwibitset wr_row,kiwibitset wr_din);
	void fn_rst(kiwibitset rst);
	~zt_stl_mem_psd_mrnw_class(){
		delete mem;
	}

};


#endif /* ZT_STL_MEM_PSD_MRNW_CLASS_H_ */
