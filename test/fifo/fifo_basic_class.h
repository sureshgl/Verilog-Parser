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
#include "/Users/kmalempa/gerrit/dev/memoverse/proteus_cgen/../../zt/des/cref/common/Utils.cpp"

using namespace std;

#ifndef FIFO_BASIC_CLASS_H_
#define FIFO_BASIC_CLASS_H_

class fifo_basic_class{
private :
	Int DEPTH;
	Int LG_DEPTH;
	Int WIDTH;
	Wire rst;
	Wire clk;
	Wire pu_en;
	Wire pu_data;
	Wire po_en;
	Reg* mem;
	Reg head;
	Reg tail;
	Reg count;
	Wire push;
	Wire pop;
	Wire* ready;
	Wire* full;
	Wire* empty;
	Wire* po_data;
public :
	fifo_basic_class(Int DEPTH,Int LG_DEPTH,Int WIDTH){
		this->DEPTH = DEPTH;
		this->LG_DEPTH = LG_DEPTH;
		this->WIDTH = WIDTH;
		rst = Wire(1);
		clk = Wire(1);
		pu_en = Wire(1);
		pu_data = Wire(WIDTH-1-0+1);
		po_en = Wire(1);
		mem = (Reg*)initialize_array(DEPTH-1-0+1,WIDTH-1-0+1);
		head = Reg(LG_DEPTH-1-0+1);
		tail = Reg(LG_DEPTH-1-0+1);
		count = Reg(LG_DEPTH-0+1);
		push = Wire(1);
		pop = Wire(1);
		ready = new Wire(1);
		full = new Wire(1);
		empty = new Wire(1);
		po_data = new Wire(WIDTH-1-0+1);
	}
	void fn_rst(Wire rst);
	void fn_pop(Wire po_en,Wire* po_data);
	void fn_push(Wire pu_en,Wire pu_data);
	~fifo_basic_class(){
		delete ready;
		delete full;
		delete empty;
		delete po_data;
	}
};
#endif

void fifo_basic_class::fn_rst(Wire rst){
	*empty = (count == 0);
	*full  = (count == DEPTH);
	if(rst) {
		head = 0;
		tail = 0;
		count = 0;
		*ready = 1;
	}
	//	else
	//		count = count;
	*empty = (count == 0);
	*full  = (count == DEPTH);
}

void fifo_basic_class::fn_pop(Wire po_en,Wire* po_data){
	*empty = (count == 0);
	*full  = (count == DEPTH);
	pop  = !*empty && po_en;
	*po_data = mem[head];
	if(pop) {
		if(head == DEPTH-1) {
			head = 0;
		}
		else {
			head = head +1;
		}
	}
	if(pop) {
		count = count - 1;
	}
	//else
	//	count = count;
	*empty = (count == 0);
	*full  = (count == DEPTH);
}
void fifo_basic_class::fn_push(Wire pu_en,Wire pu_data){
	*empty = (count == 0);
	*full  = (count == DEPTH);
	push = !*full  && pu_en;
	if(push) {
		mem[tail] = pu_data;
	}
	if(tail == DEPTH-1) {
		tail = 0;
	}
	else {
		tail = tail+1;
	}
	if(push) {
		count = count + 1;
	}
	//else
	//count = count;
	*empty = (count == 0);
	*full  = (count == DEPTH);
}
