
#define word_size (sizeof(unsigned long)*8)
#include<iostream>
#include <stdexcept>
#include <sstream>
#include <math.h>
using namespace std;

#ifndef KIWIBITSET_H_
#define KIWIBITSET_H_


class kiwibitset{

	typedef unsigned long word;
protected:
	word val;
	word& ref;
	word len;
	size_t ref_pos;
public:
	friend unsigned long kiwi_log2(unsigned long);
	friend kiwibitset* initialize_array(size_t len,size_t bits);
	friend kiwibitset concat(kiwibitset kb,word value);
	friend kiwibitset** initialize_array(size_t count, size_t len,size_t bits);
	//************************
	//METHODS FOR CONSTRUCTORS
	//************************

	static size_t bitsToStore(word n){
		if (n == 0) return 1;
		size_t r = 0;
		while (n)
		{
			++r;
			n >>= 1;
		}
		return r;
	}

	word getmask(size_t size) const{
		word ret =0;
		for(int i=0;i<size;i++){
			ret |= (word)1 << i;
		}
		return ret;
	}

	const unsigned long& length() const{
		if(ref_pos != -1){
			throw std::exception();
		}
		return len;
	}

	word to_ul() const{
		if(ref_pos == -1){
			return (ref & getmask(len));
		} else {
			return ((ref & getmask(len)) & maskbit(ref_pos)) >> ref_pos;
		}
	}

	//************
	//CONSTRUCTORS
	//************

	kiwibitset():ref(val){
		word mysize = 0;
		val = mysize;
		len = word_size;
		ref_pos = -1;
	}

	kiwibitset(word value):val(value),ref(val),len(bitsToStore(value)),ref_pos(-1){
		if(bitsToStore(value) > word_size){
			throw std::out_of_range("not supported from size constructor");
		}
	}

	kiwibitset(const string& input):ref(val),len(input.size()),ref_pos(-1){
		if(input.size() > word_size){
			throw std::out_of_range("not supported from string constructor");
		}
		char* temp;
		val = strtoul(input.c_str(),&temp,2);
	}

	kiwibitset(const size_t& size,word value):val(value),ref(val),len(size),ref_pos(-1){
		if(size > word_size){
			throw std::out_of_range("not supported from size and value constructor");
		}
	}

	kiwibitset(kiwibitset& kb,size_t pos):val(kb.val),ref(kb.ref),len(kb.len),ref_pos(pos){
		if(kb.len > word_size){
			throw std::out_of_range("not supported from size and value constructor");
		}
	}

	kiwibitset(const size_t& size,const string& input):ref(val),len(size),ref_pos(-1){
		if(size > word_size){
			throw std::out_of_range("not supported from size and string constructor");
		}
		char* temp;
		val = strtoul(input.c_str(),&temp,2);
	}

	kiwibitset(const kiwibitset& kb):val(kb.to_ul()),ref(val),len(kb.len),ref_pos(-1){	}

	kiwibitset(kiwibitset& __1,kiwibitset& __2,kiwibitset& __3,kiwibitset& __4):ref(val){
		size_t temp = __1.length() + __2.length() +__3.length()+__4.length();
		if(temp > word_size){
			throw std::out_of_range("not supported from fuse 3 constructor");
		}
		len = temp;
		word to_set = __1.to_ul();
		to_set <<= __2.length();
		to_set |= __2.to_ul();
		to_set <<= __3.length();
		to_set |= __3.to_ul();
		to_set <<= __4.length();
		to_set |= __4.to_ul();
		val = to_set;ref_pos = -1;
	}

    kiwibitset(kiwibitset& __1,kiwibitset& __2,kiwibitset& __3,kiwibitset& __4,kiwibitset& __5,kiwibitset& __6):ref(val){
        size_t temp = __1.length() + __2.length() +__3.length()+__4.length()+__5.length()+__6.length();
        if(temp > word_size){
            throw std::out_of_range("not supported from fuse 3 constructor");
        }
        len = temp;
        word to_set = __1.to_ul();
        to_set <<= __2.length();
        to_set |= __2.to_ul();
        to_set <<= __3.length();
        to_set |= __3.to_ul();
        to_set <<= __4.length();
        to_set |= __4.to_ul();
        to_set <<= __5.length();
        to_set |= __5.to_ul();
        to_set <<= __6.length();
        to_set |= __6.to_ul();
        val = to_set;ref_pos = -1;
    }

	//should make it generic wrt the number of arguments
	kiwibitset(kiwibitset& __1,kiwibitset& __2,kiwibitset& __3):ref(val){
		size_t temp = __1.length() + __2.length() +__3.length();
		if(temp > word_size){
			throw std::out_of_range("not supported from fuse 3 constructor");
		}
		len = temp;
		word to_set = __1.to_ul();
		to_set <<= __2.length();
		to_set |= __2.to_ul();
		to_set <<= __3.length();
		to_set |= __3.to_ul();
		val = to_set;ref_pos = -1;
	}

	kiwibitset(kiwibitset& __1,kiwibitset& __2,word __3):ref(val){
		size_t temp = __1.length() + __2.length() +bitsToStore(__3);
		if(temp > word_size){
			throw std::out_of_range("not supported from fuse 3 constructor");
		}
		len = temp;
		word to_set = __1.to_ul();
		to_set <<= __2.length();
		to_set |= __2.to_ul();
		to_set <<= bitsToStore(__3);
		to_set |= __3;
		val = to_set;ref_pos = -1;
	}

	kiwibitset(kiwibitset& __1,kiwibitset& __2):ref(val){
		size_t temp = __1.length() + __2.length() ;
		if(temp > word_size){
			throw std::out_of_range("not supported from fuse 2 constructor");
		}
		len = temp;
		word to_set = __1.to_ul();
		to_set <<= __2.length();
		to_set |= __2.to_ul();
		val = to_set;ref_pos = -1;
	}

	static word maskbit(size_t position){
		word ret;
		ret = 1;
		ret = ret << position%word_size;
		return ret;
	}

	//*********
	//ASSIGN OPERATOR
	//*********

	kiwibitset& operator=(word in){
		if(ref_pos == -1){
			ref = in;
		} else {
			if(in&1){
				ref |= maskbit(ref_pos);
			} else {
				ref &= kiwibitset(len,~maskbit(ref_pos)).to_ul();
			}
		}
		return *this;
	}


	kiwibitset& operator=(int in){
		if(ref_pos == -1){
			ref = in;
		} else {
			if(in&1){
				ref |= maskbit(ref_pos);
			} else {
				ref &= kiwibitset(len,~maskbit(ref_pos)).to_ul();
			}
		}
		return *this;
	}

	kiwibitset& operator=(const kiwibitset &_in){
		if(ref_pos == -1){
			ref = _in.to_ul();
		} else {
			if(_in.to_ul()&1){
				ref |= maskbit(ref_pos);
			} else {
				ref &= kiwibitset(len,~maskbit(ref_pos)).to_ul();
			}
		}
		return *this;
	}

	kiwibitset& operator=(bool in){
		if(in){
			if(ref_pos == -1){
				ref = 1;
			} else {
				ref |= maskbit(ref_pos);
			}
		} else {
			if(ref_pos == -1){
				ref = 0;
			} else {
				ref &= kiwibitset(len,~maskbit(ref_pos)).to_ul();
			}
		}
		return *this;
	}


	//*********
	//OPERATORS
	//*********
	operator unsigned long() const{
		return to_ul();
	}

	kiwibitset operator++(int){
		if(ref_pos == -1){
			ref = ref +1;
			return *this;
		} else {
			std::exception();
			return *this;
		}
	}

	kiwibitset operator--(int){
		if(ref_pos == -1){
			ref = ref -1;
			return kiwibitset(len,to_ul());
		} else {
			std::exception();
			return *this;
		}
	}

	//***************
	//UTILITY METHODS
	//***************

	void decatenate(kiwibitset* _1,kiwibitset* _2){
		*_2 = get(0,_2->length()-1);
		*_1 = get(_2->length(),_2->length()+_1->length()-1);
	}

	void decatenate(kiwibitset* _1,kiwibitset* _2,kiwibitset* _3){
		*_3 = get(0,_3->length()-1);
		*_2 = get(_3->length(),_3->length()+_2->length()-1);
		*_1 =  get(_3->length()+_2->length(),_3->length()+_2->length()+_1->length()-1);
	}

	void decatenate(kiwibitset* _1,kiwibitset* _2,kiwibitset* _3,kiwibitset* _4){
		*_4 = get(0,_4->length()-1);
		*_3 = get(_4->length(),_4->length()+_3->length()-1);
		*_2 =  get(_4->length()+_3->length(),_4->length()+_3->length()+_2->length()-1);
		*_1 = get(_4->length()+_3->length()+_2->length(),_4->length()+_3->length()+_2->length()+_1->length()-1);
	}

    void decatenate(kiwibitset* _1,kiwibitset* _2,kiwibitset* _3,kiwibitset* _4,kiwibitset* _5,kiwibitset* _6){
        *_6 = get(0,_6->length()-1);
        *_5 = get(_6->length(),_6->length()+_5->length()-1);
        *_4 = get(_6->length()+_5->length(),_6->length()+_5->length()+_4->length()-1);
        *_3 = get(_6->length()+_5->length()+_4->length(),_6->length()+_5->length()+_4->length()+_3->length()-1);
        *_2 =  get(_6->length()+_5->length()+_4->length()+_3->length(),_6->length()+_5->length()+_4->length()+_3->length()+_2->length()-1);
        *_1 = get(_6->length()+_5->length()+_4->length()+_3->length()+_2->length(),_6->length()+_5->length()+_4->length()+_3->length()+_2->length()+_1->length()-1);
    }

	//***************
	//OTHER OPERATORS
	//***************
	kiwibitset operator[](size_t pos){
		if(pos+1 > length()){
			throw std::out_of_range("not supported from [] op");
		}
		if(ref_pos != -1){
			throw std::exception();
		}
		return kiwibitset(*this,pos);
	}

	kiwibitset operator[](kiwibitset& kb){
		if(ref_pos != -1){
			throw std::exception();
		}
		return kiwibitset(*this,kb.to_ul());
	}

	kiwibitset unaryAnd(){
		if(to_ul() == (pow((double)2,(double)len)-1)){
			return kiwibitset(1,1);
		} else {
			return kiwibitset(1,0);
		}
	}

    kiwibitset unaryOr(){
        if(to_ul() > 0){
            return kiwibitset(1,1);
        } else {
            return kiwibitset(1,0); 
        }
    }

	kiwibitset get(int begin,int end){
		if(ref_pos != -1){
			throw std::exception();
		}
		string ret;
		for(int i=end;i>=begin;i--){
			word temp = this->operator [](i).to_ul();
			stringstream stream;
			stream << temp;
			ret.append(stream.str());
		}
		return kiwibitset(ret.length(),ret);
	}

	void set(int begin,int end,kiwibitset kb){
		if(ref_pos != -1){
			throw std::exception();
		}
		for(int i=begin,j=0;i<=end;i++,j++){
			this->operator [](i) = kb.operator [](j);
		}
	}

};
unsigned long kiwi_log2(unsigned long);
kiwibitset* initialize_array(size_t len,size_t bits);
kiwibitset concat(kiwibitset kb,unsigned long value);
kiwibitset** initialize_array(size_t count, size_t len,size_t bits);
#endif
