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

#ifndef FDEL_LOOP_CLASS_H_
#define FDEL_LOOP_CLASS_H_
class fdel_loop_class{
public:
};

#endif

#ifndef ZT_STL_SHIFT_CLASS_H
#define ZT_STL_SHIFT_CLASS_H
class zt_stl_shift_class{
public:
Int BITDATA;
Int DELAY;
fdel_loop_class* fdel_loop_class_obj;


Reg* din_reg;
zt_stl_shift_class(Int BITDATA,Int DELAY){
this->BITDATA=BITDATA;
this->DELAY=DELAY;
fdel_loop_class_obj = new fdel_loop_class[DELAY];

for (int i=0;i<DELAY;i++){
}

din_reg = (Reg*)initialize_array(DELAY - 0 +1,BITDATA-1 - 0 + 1);
}
void zt_stl_shift(Wire clk,
Wire din,
Wire* dout);
};
#endif
