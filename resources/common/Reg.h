

#ifndef REG_H_
#define REG_H_

using namespace std;
#include "kiwibitset.h"

class Reg:public kiwibitset{
public:
	Reg():kiwibitset(){}
	Reg(unsigned long value):kiwibitset(bitsToStore(value),value){}
	Reg(size_t size,unsigned long value):kiwibitset(size,value){}
	Reg(string str):kiwibitset(str){}
	Reg(size_t size,string str):kiwibitset(size,str){}
	Reg(kiwibitset& kb):kiwibitset(kb){}
	Reg(kiwibitset __1,kiwibitset __2):kiwibitset(__1,__2){}
	Reg(kiwibitset __1,kiwibitset __2,kiwibitset __3):kiwibitset(__1,__2,__3){}
	~Reg(){}

	Reg& operator=(const kiwibitset& __rhs){
		kiwibitset::operator =(__rhs);
		return *this;
	}

	Reg& operator=(Wire __rhs){
		kiwibitset::operator =(__rhs);
		return *this;
	}

	Reg& operator=(unsigned long value){
		kiwibitset::operator =(value);
		return *this;
	}

	Reg& operator=(int value){
		kiwibitset::operator =(value);
		return *this;
	}

	Reg& operator=(bool value){
		kiwibitset::operator =(value);
		return *this;
	}
};

#endif
