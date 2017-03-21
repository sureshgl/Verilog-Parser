/*
 * fifo_main.cpp
 *
 *  Created on: 25-Jan-2016
 *      Author: kmalempa
 */

#include <iostream>
#include <dlfcn.h>
#include <execinfo.h>
#include <typeinfo>
#include <string>
#include <memory>
#include <cxxabi.h>
#include <list>
#include <cstdlib>
#include "/Users/kmalempa/gerrit/dev/memoverse/proteus_cgen/../../zt/des/cref/common/Genvar.h"
#include "/Users/kmalempa/gerrit/dev/memoverse/proteus_cgen/../../zt/des/cref/common/Wire.h"
#include "/Users/kmalempa/gerrit/dev/memoverse/proteus_cgen/../../zt/des/cref/common/Reg.h"
#include "/Users/kmalempa/gerrit/dev/memoverse/proteus_cgen/../../zt/des/cref/common/Int.h"

#include "fifo_basic_class.h"

using namespace std;

int main(){
	Int DEPTH(4);
	Int LG_DEPTH(2);
	Int WIDTH(2);
	fifo_basic_class fifo_basic_obj(DEPTH,LG_DEPTH,WIDTH);
	Wire rst(1,1);
	Wire pu_en(1,1) ;
	Wire pu_data1(2,1);
	Wire pu_data2(2,2);
	Wire pu_data3(2,3);
	Wire pu_data4(2,2);
	Wire pu_data5(2,2);
	Wire po_en(1,1);
	Wire po_data(2) ;

	cout << "Reseting Fifo ... "<<endl;

	fifo_basic_obj.fn_rst(rst);

	fifo_basic_obj.fn_push(pu_en,pu_data1);
	fifo_basic_obj.fn_push(pu_en,pu_data2);
	fifo_basic_obj.fn_push(pu_en,pu_data3);
	fifo_basic_obj.fn_push(pu_en,pu_data4);
	fifo_basic_obj.fn_push(pu_en,pu_data5);

	fifo_basic_obj.fn_pop(po_en,&po_data);
	cout << "po_data: " << po_data << endl;
	fifo_basic_obj.fn_pop(po_en,&po_data);
	cout << "po_data: " << po_data << endl;
	fifo_basic_obj.fn_pop(po_en,&po_data);
	cout << "po_data: " << po_data << endl;
	fifo_basic_obj.fn_pop(po_en,&po_data);
	cout << "po_data: " << po_data << endl;
	fifo_basic_obj.fn_pop(po_en,&po_data);
	cout << "po_data: " << po_data << endl;

}


