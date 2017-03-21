package com.proteus.cgen.structures;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;

public class Function {
	
	@Getter private List<String> parameters;
	@Getter private String name;
	@Getter private String returnType;
	
	public Function(String name,List<String> parameters){
		this(name,parameters,"void");
	}
	
	public Function(String name,List<String> parameters,String returnType){
		this.parameters = parameters;
		this.name = name;
		this.returnType = returnType;
	}
	
	public Function(String name){
		this(name,"void");
	}
	
	public Function(String name, String returnType){
		this.name = name;
		this.parameters = new ArrayList<String>();
		this.returnType = returnType;
	}
	
	public void addParameter(String parameter){
		parameters.add(parameter);
	}
	
	public String getString(){
		StringBuilder sb = new StringBuilder();
		//check if parametrs exist
		sb.append(name+"("+parameters.get(0));
		for(int i=1;i<parameters.size();i++){
			sb.append(",");sb.append(parameters.get(i));
		}
		sb.append(");");
		return sb.toString();
	}

}
