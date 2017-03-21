
#ifndef INT_H_
#define INT_H_

#include "kiwibitset.h"

class Int:public kiwibitset{
public:
	Int():kiwibitset(32){}
	Int(unsigned long value):kiwibitset(32,value){}
	Int(string str):kiwibitset(32,str){}
	~Int(){}

	Int operator=(const kiwibitset& __rhs){
		kiwibitset::operator =(__rhs);
		return *this;
	}
	Int operator=(unsigned long value){
		kiwibitset::operator =(value);
		return *this;
	}

	Int& operator=(bool value){
		kiwibitset::operator =(value);
		return *this;
	}

	Int& operator=(int value){
		kiwibitset::operator =(value);
		return *this;
	}
};

#endif
