/*
 * zt_stl_wrpri_class.cpp
 *
 *  Created on: 06-Apr-2016
 *      Author: pvelumul
 */

#include "zt_stl_wrpri_class.h"

void zt_stl_wrpri_class::fn_write(kiwibitset wr_in,kiwibitset wr_adr,kiwibitset* wr_out){
	for (int i=0; i<NUMWRPT; i=i+1)
		wr_adr_int[i] = wr_adr.get(i*BITADDR,(i+1)*BITADDR-1);
	if (ENAWPRI == 0) {
		*wr_out = wr_in;
	} else {
		*wr_out = wr_in;
		for (int i=0; i<NUMWRPT; i=i+1)
			for (int j=i+1; j<NUMWRPT; j=j+1)
				if (wr_in[j] && (wr_adr_int[j] == wr_adr_int[i]))
					wr_out[i] = 0;
	}
}



