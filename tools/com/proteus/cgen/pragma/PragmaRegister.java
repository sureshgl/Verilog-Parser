package com.proteus.cgen.pragma;

import java.util.HashMap;
import java.util.Map;

public class PragmaRegister {

	private static volatile Map<String,IPragmaImplement> pragmaRegistry = new HashMap<String,IPragmaImplement>();

	public static synchronized void register(String type,IPragmaImplement object){
		if(pragmaRegistry.containsKey(type)){
			try {
				throw new Exception(type +" handler already registered.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		} else {
			pragmaRegistry.put(type, object);
		}
	}

	public static synchronized void unregister(String type){
		pragmaRegistry.remove(type);
	}

	public static IPragmaImplement get(String pragmaType){
		return pragmaRegistry.get(pragmaType);
	}

	private PragmaRegister(){ }
}
