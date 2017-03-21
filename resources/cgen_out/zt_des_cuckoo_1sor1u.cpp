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

#include "zt_des_cuckoo_1sor1u.h"
void zt_des_cuckoo_1sor1u_class::zt_des_cuckoo_1sor1u(Wire clk,Wire rst,Wire* ready,Wire search_0,Wire sr_key_0,Wire* sr_dout_0,Wire* sr_vld_0,Wire* sr_hit_0,Wire update_1,Wire up_key_1,Wire up_din_1,Wire up_del_1,Wire* up_bp_1,Wire* t1_writeA,Wire* t1_addrA,Wire* t1_dinA,Wire* t1_readB,Wire* t1_addrB,Wire t1_doutB)
{
 *empty = (*count == 0);
 *full  = (*count >= FIFOCNT);
 *up_bp_1 = *full;
int i,j;
if( clk)
if(rst){

    *qup_en_1 = 0;

    *count = 0;

    *head = 0;

    *tail = 0;

    *qsr_hit_0= 0;

    *qsr_dout_0 = concat(DTWIDTH,0);

    *qsr_del_0 = 0;

    for(i=0;i<NUMVBNK;i++)
    {

      for(j=0; j<NUMVROW;j++)
      {

        atom[i][j] = concat(PHWIDTH,0);

      }

    }

    for(i=0;i<FIFOCNT;i++) {

      fifo[i] = 0;

    }

    *ready = 1;

  }
else  {
 if(search_0 == 1) {

    *qsr_hit_0 = 0;

    for(i=0;i<FIFOCNT;i++) {

      if(fifo[i].get(DTWIDTH+1,KYWIDTH+DTWIDTH) == sr_key_0 && !*qsr_hit_0){

        *qsr_dout_0 = fifo[i].get(1,DTWIDTH);
 
        *qsr_del_0 = fifo[i][0];

        *qsr_hit_0 = 1;

      }

    }

  }

}
if( clk)
{

  if(!search_0) {
 
   if(!*empty) {

      *qup_key_1 = fifo[*head].get(DTWIDTH+1,KYWIDTH+DTWIDTH+1-1);

      *qup_dat_1 = fifo[*head].get(1,DTWIDTH);

      *qup_del_1 = fifo[*head][0];

    //  qup_en_1 <= !qup_del_1;

     fifo[*head] = 0;

     if(*qup_del_1) {

        *qup_en_1 = 0;

      }
 else  
        *qup_en_1 =1;

      *count = *count-1;

      *head = (*head+1)%FIFOCNT;

      fifo[*head] = 0;

    }
 else   {

      *qup_en_1 = 1;

    }

  }

}
Genvar crc_var;

for(crc_var=0;crc_var<NUMVBNK;crc_var=crc_var+1){
(*crc_loop_class_obj[crc_var].crc_tmp_0) = 0 | sr_key_0 >> CRCPOLYID;

(*crc_loop_class_obj[crc_var].del_0).zt_stl_shift(clk,(*crc_loop_class_obj[crc_var].crc_tmp_0),&(sr_row_0[crc_var]));

(*crc_loop_class_obj[crc_var].crc_tmp_1) = 0 | *qup_key_1 >> CRCPOLYID;

(*crc_loop_class_obj[crc_var].del_1).zt_stl_shift(clk,(*crc_loop_class_obj[crc_var].crc_tmp_1),&(qup_row_1[crc_var]));

(*crc_loop_class_obj[crc_var].crc_tmp_sel) = 0 | *select_key >> CRCPOLYID;

(*crc_loop_class_obj[crc_var].del_sel).zt_stl_shift(clk,(*crc_loop_class_obj[crc_var].crc_tmp_sel),&(select_row[crc_var]));

}
Genvar bnk_var;

int keyi,dati,vldi;for(bnk_var=0;bnk_var<NUMVBNK;bnk_var=bnk_var+1){
if( clk)
{

  if(search_0) {

    *var_sr_key = sr_row_0[bnk_var];

  }
 else   {

    *var_sr_key =  qup_row_1[bnk_var];
 
  }

    if(rst) {

      for(keyi=0;keyi<NUMVBNK;keyi++) {

        key_dout[keyi] = concat(KYWIDTH,0);

      }

      for(dati=0;dati<NUMVBNK;dati++) {

        dat_dout[dati] = concat(DTWIDTH,0);

      }

      for(vldi=0;vldi<NUMVBNK;vldi++) {

        vld_dout[vldi] = 0;

      }

    }

    if(search_0 | *qup_en_1) {

      vld_dout[bnk_var] = atom[bnk_var][*var_sr_key][0];

      key_dout[bnk_var] = atom[bnk_var][*var_sr_key].get(1,KYWIDTH);

      dat_dout[bnk_var] = atom[bnk_var][*var_sr_key].get(KYWIDTH+1,DTWIDTH+KYWIDTH);

    }

  }

}
{

  *bsr_hit_0 = 0;

  *sr_bnk_0 = 0;

  for(int  sbi_0=0; sbi_0<NUMVBNK; sbi_0=sbi_0+1)
    if(search_0 && !*bsr_hit_0 && (sr_key_0 == key_dout[sbi_0]) && vld_dout[sbi_0]) {

      *bsr_hit_0  = 1;

      *sr_bnk_0 = sbi_0;

    }

  }
 *sr_hit_0 = *qsr_hit_0  ? !*qsr_del_0 : *bsr_hit_0;
 *sr_dout_0 = *qsr_hit_0 ? *qsr_dout_0 : dat_dout[*sr_bnk_0];
 *sr_vld_0 = search_0;
{

    *ov_hit_1 = 0;

    *ov_bnk_1 = 0;

    for(int  sbi_1=0; sbi_1<NUMVBNK; sbi_1=sbi_1+1)
      if(*qup_en_1 && !*ov_hit_1 && (*qup_key_1 == key_dout[sbi_1]) && vld_dout[sbi_1]) {

        *ov_hit_1  = 1;

        *ov_bnk_1 = sbi_1;

      }

    }
{

      *in_hit_1 = 0;

      *in_bnk_1 = 0;

      for(int  sbi_1=0; sbi_1<NUMVBNK; sbi_1=sbi_1+1)
        if(*qup_en_1 && !*qup_del_1 && !*in_hit_1 && !vld_dout[sbi_1]) {

          *in_hit_1  = 1;

          *in_bnk_1 = sbi_1;

        }

      }
if( clk)
if(rst){
  *disp_bnk = 0;
 }
else  {
 *disp_bnk = (*disp_bnk+1)%NUMVBNK;
 }
 *disp_key = key_dout[*disp_bnk];
 *disp_dat = dat_dout[*disp_bnk];
 *up_hit_1 = *ov_hit_1 || *in_hit_1;
 *up_bnk_1 = *ov_hit_1 ? *ov_bnk_1 : *in_bnk_1;
 *disp_hit = *qup_en_1 && !*qup_del_1 && !*up_hit_1;
Genvar bnk_var_1;

for(bnk_var_1=0;bnk_var_1<NUMVBNK;bnk_var_1=bnk_var_1+1){
if( clk)
{

          if(*up_hit_1 ? (*up_bnk_1 == bnk_var_1) : *disp_hit && (*disp_bnk == bnk_var_1)) {

            atom[bnk_var_1][qup_row_1[bnk_var_1]] = kiwibitset(*qup_dat_1,*qup_key_1,!*qup_del_1);

          }

        }

}
if( clk)
{

        if(update_1 && !*full) {

          fifo[*tail] = kiwibitset(up_key_1,up_din_1,up_del_1);

          *tail = (*tail+1)%FIFOCNT;

          *count = *count+1;

          if(*disp_hit && (*count+1 <= FIFOCNT)) {

            fifo[*tail] = kiwibitset(*disp_key,*disp_dat,0);

            *tail = (*tail+1)%FIFOCNT;

            *count = *count + 1;

          }

        }

      }
}
