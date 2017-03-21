package com.proteus.cgen.structures;

import lombok.Data;

@Data
public class SortVariable {

	private String parentName;
	private String completeVar;
	private TYPE type;
	private boolean isDeclaration;
	private Range indexRange;

	public enum TYPE {
		simple,
		complex
	}

	@Override
	public boolean equals(Object object) {
		if(object instanceof SortVariable){
			SortVariable rhs = (SortVariable)object;
			return parentName.equals(rhs.parentName);
		}  else {
			return false;
		}
	}

	@Override
	public int hashCode(){
		int hash = 9;
		hash = hash * parentName.hashCode();
		return hash;
	}

}
