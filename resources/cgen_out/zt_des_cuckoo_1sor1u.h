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
#ifndef CRC_LOOP_CLASS_H_
#define CRC_LOOP_CLASS_H_
class crc_loop_class{
public:
Wire* crc_tmp_0;

zt_stl_shift_class* del_0;

Wire* crc_tmp_1;

zt_stl_shift_class* del_1;

Wire* crc_tmp_sel;

zt_stl_shift_class* del_sel;

};

#endif

#ifndef BNK_LOOP_READ_CLASS_H_
#define BNK_LOOP_READ_CLASS_H_
class bnk_loop_read_class{
public:
};

#endif

#ifndef BNK_LOOP_WRITE_CLASS_H_
#define BNK_LOOP_WRITE_CLASS_H_
class bnk_loop_write_class{
public:
};

#endif

#ifndef ZT_DES_CUCKOO_1SOR1U_CLASS_H
#define ZT_DES_CUCKOO_1SOR1U_CLASS_H
class zt_des_cuckoo_1sor1u_class{
public:
Int NUMVBNK;
Int KYWIDTH;
Int DTWIDTH;
Int NUMVROW;
Int FIFOCNT;
Int CRCPOLYID;
Int BITFIFO;
Int PHWIDTH;
Int BITVROW;
Int BITVBNK;
Int CRC_DELAY;
Int MEM_DELAY;
crc_loop_class* crc_loop_class_obj;


bnk_loop_read_class* bnk_loop_read_class_obj;


bnk_loop_write_class* bnk_loop_write_class_obj;


Reg* qup_key_1;
Reg* qup_dat_1;
Reg* qup_del_1;
Reg* qup_en_1;
Wire* mem_ready;
Wire* select_key;
Wire* select_row;
Wire* sr_row_0;
Wire* qup_row_1;
Reg* key_dout;
Reg* dat_dout;
Reg* vld_dout;
Wire* disp_hit;
Reg* disp_bnk;
Wire* disp_key;
Wire* disp_dat;
Wire* up_hit_1;
Wire* up_bnk_1;
Reg* qsr_dout_0;
Reg* qsr_del_0;
Reg* qsr_hit_0;
Reg* bsr_hit_0;
Reg* sr_bnk_0;
Reg* ov_hit_1;
Reg* ov_bnk_1;
Reg* in_hit_1;
Reg* in_bnk_1;
Reg** atom;
Reg* fifo;
Reg* count;
Reg* head;
Reg* tail;
Reg* empty;
Reg* full;
Reg* ready;
Wire* crc_tmp_0;
Wire* crc_tmp_1;
Wire* crc_tmp_sel;
Reg* var_sr_key;
zt_des_cuckoo_1sor1u_class(Int NUMVBNK,Int KYWIDTH,Int DTWIDTH,Int NUMVROW,Int FIFOCNT,Int CRCPOLYID,Int BITFIFO,Int PHWIDTH,Int BITVROW,Int BITVBNK,Int CRC_DELAY,Int MEM_DELAY){
this->NUMVBNK=NUMVBNK;
this->KYWIDTH=KYWIDTH;
this->DTWIDTH=DTWIDTH;
this->NUMVROW=NUMVROW;
this->FIFOCNT=FIFOCNT;
this->CRCPOLYID=CRCPOLYID;
this->BITFIFO=BITFIFO;
this->PHWIDTH=PHWIDTH;
this->BITVROW=BITVROW;
this->BITVBNK=BITVBNK;
this->CRC_DELAY=CRC_DELAY;
this->MEM_DELAY=MEM_DELAY;
crc_loop_class_obj = new crc_loop_class[NUMVBNK];

for (int i=0;i<NUMVBNK;i++){
crc_loop_class_obj[i].crc_tmp_0 = new Wire(BITVROW-1-0+1);

crc_loop_class_obj[i].del_0 = new zt_stl_shift_class(BITVROW,CRC_DELAY);

crc_loop_class_obj[i].crc_tmp_1 = new Wire(BITVROW-1-0+1);

crc_loop_class_obj[i].del_1 = new zt_stl_shift_class(BITVROW,CRC_DELAY);

crc_loop_class_obj[i].crc_tmp_sel = new Wire(BITVROW-1-0+1);

crc_loop_class_obj[i].del_sel = new zt_stl_shift_class(BITVROW,CRC_DELAY);

}

bnk_loop_read_class_obj = new bnk_loop_read_class[NUMVBNK];

for (int i=0;i<NUMVBNK;i++){
}

bnk_loop_write_class_obj = new bnk_loop_write_class[NUMVBNK];

for (int i=0;i<NUMVBNK;i++){
}

qup_key_1 = new Reg(KYWIDTH-1 - 0 + 1);
qup_dat_1 = new Reg(DTWIDTH-1 - 0 + 1);
qup_del_1 = new Reg(1);
qup_en_1 = new Reg(1);
mem_ready = new Wire(NUMVBNK-1 - 0 + 1);
select_key = new Wire(KYWIDTH-1 - 0 + 1);
select_row = (Wire*)initialize_array(NUMVBNK-1 - 0 +1,BITVROW-1 - 0 + 1);
sr_row_0 = (Wire*)initialize_array(NUMVBNK-1 - 0 +1,BITVROW-1 - 0 + 1);
qup_row_1 = (Wire*)initialize_array(NUMVBNK-1 - 0 +1,BITVROW-1 - 0 + 1);
key_dout = (Reg*)initialize_array(NUMVBNK-1 - 0 +1,KYWIDTH-1 - 0 + 1);
dat_dout = (Reg*)initialize_array(NUMVBNK-1 - 0 +1,DTWIDTH-1 - 0 + 1);
vld_dout = (Reg*)initialize_array(NUMVBNK-1 - 0 +1,1);
disp_hit =  new Wire(1);
disp_bnk = new Reg(BITVBNK-1 - 0 + 1);
disp_key = new Wire(KYWIDTH-1 - 0 + 1);
disp_dat = new Wire(DTWIDTH-1 - 0 + 1);
up_hit_1 =  new Wire(1);
up_bnk_1 = new Wire(BITVBNK-1 - 0 + 1);
qsr_dout_0 = new Reg(DTWIDTH-1 - 0 + 1);
qsr_del_0 = new Reg(1);
qsr_hit_0 = new Reg(1);
bsr_hit_0 = new Reg(1);
sr_bnk_0 = new Reg(BITVBNK-1 - 0 + 1);
ov_hit_1 = new Reg(1);
ov_bnk_1 = new Reg(BITVBNK-1 - 0 + 1);
in_hit_1 = new Reg(1);
in_bnk_1 = new Reg(BITVBNK-1 - 0 + 1);
atom = (Reg**)initialize_array(NUMVBNK-1 - 0 +1,NUMVROW-1 - 0 +1,PHWIDTH-1 - 0 + 1);
fifo = (Reg*)initialize_array(FIFOCNT-1 - 0 +1,KYWIDTH+DTWIDTH+1-1 - 0 + 1);
count = new Reg(31 - 0 + 1);
head = new Reg(BITFIFO-1 - 0 + 1);
tail = new Reg(BITFIFO-1 - 0 + 1);
empty = new Reg(1);
full = new Reg(1);
ready = new Reg(1);
crc_tmp_0 = new Wire(BITVROW-1 - 0 + 1);
crc_tmp_1 = new Wire(BITVROW-1 - 0 + 1);
crc_tmp_sel = new Wire(BITVROW-1 - 0 + 1);
var_sr_key = new Reg(BITVROW-1 - 0 + 1);
}
void zt_des_cuckoo_1sor1u(Wire clk,
Wire rst,
Wire* ready,
Wire search_0,
Wire sr_key_0,
Wire* sr_dout_0,
Wire* sr_vld_0,
Wire* sr_hit_0,
Wire update_1,
Wire up_key_1,
Wire up_din_1,
Wire up_del_1,
Wire* up_bp_1,
Wire* t1_writeA,
Wire* t1_addrA,
Wire* t1_dinA,
Wire* t1_readB,
Wire* t1_addrB,
Wire t1_doutB);
};
#endif
