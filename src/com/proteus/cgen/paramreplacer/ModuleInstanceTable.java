package com.proteus.cgen.paramreplacer;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.common.util.Summarizable;
import com.proteus.common.util.Utils;
import com.proteus.common.util.Utils.Tuple3;
import com.proteus.cgen.verilogprime.SymbolTable;

public class ModuleInstanceTable implements Summarizable{

	private static final Logger L = LoggerFactory.getLogger(ModuleInstanceTable.class);
	List<Tuple3<String, String,SymbolTable>> table = new ArrayList<>();

	public Tuple3<String, String,SymbolTable> createNewEntry(String moduleName,String instanceName){
		return new Tuple3<String,String,SymbolTable>(moduleName,instanceName,new SymbolTable());
	}

	public Tuple3<String, String,SymbolTable> addEntry(Tuple3<String, String,SymbolTable> newEntry){
		for(Tuple3<String, String,SymbolTable> entry:table){
			if(entry.first().equals(newEntry.first()) && 
					entry.third().equals(newEntry.third())){
				L.debug("Instantiated the same " + entry + " with the same parameters before");
				return entry;
			}
		}	
		L.debug("Adding " + newEntry + " entry into ModuleInstanceTable");
		table.add(newEntry);
		return newEntry;
	}

	public void updateEntry(Tuple3<String,String,SymbolTable> entry, String paramName, String value){
		entry.third().put(paramName, value);
	}

	@Override
	public String summary() {
		return Utils.summary(table);
	}

	public int size(){
		return table.size();
	}

	public boolean containsModule(String moduleName){
		for(Tuple3<String,String,SymbolTable> entry : table){
			if(entry.first().equals(moduleName)){
				return true;
			}
		}
		return false;
	}

	public String getModInstanceName(Tuple3<String,String,SymbolTable> entry, String cutName){
		SymbolTable st = entry.third();
		if(st!=null){
			return entry.first()+"_"+cutName+"_"+Utils.simpleDigest(st.suffix());
		}
		throw new IllegalStateException("No such module Exists "+entry.summary());
	}
}
