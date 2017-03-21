#ifndef GENVAR_H_
#define GENVAR_H_

#include "kiwibitset.h"

class Genvar:public kiwibitset{
public:
	Genvar():kiwibitset(32){}
	Genvar(unsigned long value):kiwibitset(32,value){}
	Genvar(string str):kiwibitset(32,str){}
	~Genvar(){}

	Genvar& operator=(const kiwibitset& __rhs){
		kiwibitset::operator =(__rhs);
		return *this;
	}

	Genvar& operator=(unsigned long value){
		kiwibitset::operator =(value);
		return *this;
	}

	Genvar& operator=(bool value){
		kiwibitset::operator =(value);
		return *this;
	}

	Genvar& operator=(int value){
		kiwibitset::operator =(value);
		return *this;
	}
};


#endif
