#include <iostream>
#include <dlfcn.h>
#include <execinfo.h>
#include <typeinfo>
#include <string>
#include <memory>
#include <cxxabi.h>
#include <list>
#include <cstdlib>
#include "/auto/memoir-archive/pvelumul/pooja_testbench/dev/memoverse/parsers_cgen/../../zt/des/cref/common/Genvar.h"
#include "/auto/memoir-archive/pvelumul/pooja_testbench/dev/memoverse/parsers_cgen/../../zt/des/cref/common/Wire.h"
#include "/auto/memoir-archive/pvelumul/pooja_testbench/dev/memoverse/parsers_cgen/../../zt/des/cref/common/Reg.h"
#include "/auto/memoir-archive/pvelumul/pooja_testbench/dev/memoverse/parsers_cgen/../../zt/des/cref/common/Int.h"
using namespace std;

#include "zt_stl_shift.h"
void zt_stl_shift_class::zt_stl_shift(Wire clk,Wire din,Wire* dout)
{
Genvar fdel_var;

for(fdel_var=0;fdel_var<=DELAY;fdel_var=fdel_var+1){
if(fdel_var>0+1){
if( clk)
din_reg[fdel_var] = din_reg[fdel_var-1];
}
else  {
din_reg[fdel_var]=din;
}

}
 *dout = din_reg[DELAY];
}
