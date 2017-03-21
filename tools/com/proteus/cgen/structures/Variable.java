package com.proteus.cgen.structures;

import lombok.Getter;

public class Variable {
	
	
	@Getter private String name;
	@Getter private String declaration;
	@Getter private String initialization;
	@Getter private String destruction;
	@Getter private Boolean initializationInConstructor;
	
	public Variable(String name,String declaration,String initialization,Boolean initializationInConstructor){
		this(name,declaration,initialization,null,initializationInConstructor);
	}
	
	public Variable(String name,String declaration,String initialization, String destruction,Boolean initializationInConstructor){
		this.name = name;
		this.declaration = declaration;
		this.initialization = initialization;
		this.destruction = destruction;
		this.initializationInConstructor = initializationInConstructor;
	}

}
