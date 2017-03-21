

#ifndef WIRE_H_
#define WIRE_H_

#include "kiwibitset.h"

class Wire:public kiwibitset{
public:
	//	friend Wire* initialize_array(size_t len,size_t bits);
	Wire():kiwibitset(){}
	Wire(unsigned long value):kiwibitset(bitsToStore(value),value){}
	Wire(size_t size,unsigned long value):kiwibitset(size,value){}
	Wire(string str):kiwibitset(str){}
	Wire(size_t size,string str):kiwibitset(size,str){}
	Wire(kiwibitset& kb):kiwibitset(kb){}
	Wire(kiwibitset __1,kiwibitset __2):kiwibitset(__1,__2){}
	Wire(kiwibitset __1,kiwibitset __2,kiwibitset __3):kiwibitset(__1,__2,__3){}
	Wire(kiwibitset __1,kiwibitset __2,kiwibitset __3,kiwibitset __4):kiwibitset(__1,__2,__3,__4){}
	~Wire(){}

	Wire& operator=(const kiwibitset& __rhs){
		kiwibitset::operator =(__rhs);
		return *this;
	}
	Wire& operator=(unsigned long value){
		kiwibitset::operator =(value);
		return *this;
	}

	Wire& operator=(int value){
		kiwibitset::operator =(value);
		return *this;
	}

	Wire& operator=(bool value){
		kiwibitset::operator =(value);
		return *this;
	}
};

#endif
