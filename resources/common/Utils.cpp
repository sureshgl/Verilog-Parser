
#include "kiwibitset.h"

kiwibitset* initialize_array(size_t len,size_t bits){
	kiwibitset* temp = new kiwibitset[len];
	for(int i=0;i<len;i++){
		temp[i].len = bits;
	}
	return temp;
}

kiwibitset** initialize_array(size_t count, size_t len,size_t bits){
	kiwibitset** temp = new kiwibitset*[count];
	for(int i=0;i<count;i++){
		temp[i] = new kiwibitset[len];
		for(int j=0;j<len;j++){
			temp[i][j].len = bits;
		}
	}

	return temp;
}

kiwibitset concat(kiwibitset kb,unsigned long value){
	string temp;
	for(int i=0;i<kb;i++){
		temp += value?"1":"0";
	}
	return kiwibitset(kb.to_ul(),temp);
}

unsigned long kiwi_log2(unsigned long value){
    return ceil(log2((float)value));
}
