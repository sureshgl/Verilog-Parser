package com.proteus.cgen.verilogprime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.proteus.common.util.Summarizable;
import com.proteus.common.util.Utils;

public class SymbolTable implements Map<String,String>, Summarizable{

	private static final Logger L = LoggerFactory.getLogger(SymbolTable.class);
	public Map<String,String> symbolTable = new LinkedHashMap<>();

	@Override
	public int size() {
		return symbolTable.size();
	}

	@Override
	public boolean isEmpty() {
		return symbolTable.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return symbolTable.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return symbolTable.containsValue(value);
	}

	@Override
	public String get(Object key) {
		return symbolTable.get(key);
	}

	@Override
	public String put(String key, String value) {
		return symbolTable.put(key, value);
	}

	@Override
	public String remove(Object key) {
		return symbolTable.remove(key);
	}

	@Override
	public void putAll(Map<? extends String, ? extends String> m) {
		symbolTable.putAll(m);
	}

	@Override
	public void clear() {
		symbolTable.clear();
	}

	@Override
	public Set<String> keySet() {
		return symbolTable.keySet();
	}

	@Override
	public Collection<String> values() {
		return symbolTable.values();
	}

	@Override
	public Set<java.util.Map.Entry<String, String>> entrySet() {
		return symbolTable.entrySet();
	}

	@Override
	public String summary() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		List<Entry<String,String>> list = new ArrayList<>();
		list.addAll(symbolTable.entrySet());
		for(int i=0; i<list.size();i++){
			if(i!=0)
				sb.append(",");
			sb.append("{"+list.get(i).getKey()+":"+list.get(i).getValue()+"}");
		}
		sb.append("]");
		return sb.toString();
	}

	public String suffix(){
		StringBuilder sb = new StringBuilder();
		List<Entry<String,String>> list = new ArrayList<>();
		list.addAll(symbolTable.entrySet());
		for(int i=0; i<list.size();i++){
			sb.append("_"+list.get(i).getKey()+"_"+list.get(i).getValue());
		}

		return Utils.simpleDigest(sb.toString());
	}

	@Override
	public boolean equals(Object that){
		if(that instanceof SymbolTable){
			SymbolTable symbolTable = (SymbolTable)that;
			if(this.size() == symbolTable.size()){
				for(String key :this.keySet()){
					if(symbolTable.containsKey(key)){
						if(!(this.get(key).equals(symbolTable.get(key)))){
							return false;
						}
					} else {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	
	@Override
    public int hashCode() {
		Object[] keys = this.keySet().toArray();
		Arrays.sort(keys);
		int ret = 31;
		for(int i=0;i<keys.length;i++){
			int local = keys[i].hashCode() + this.get(keys[i]).hashCode();
			ret = ret + local;
		}
		return ret;
	}
	
	public SymbolTable getCopy(){
		SymbolTable ret = new SymbolTable();
		for(java.util.Map.Entry<String, String> entry:entrySet()){
			ret.put(entry.getKey(), entry.getValue());
		}
		return ret;
	}
//	public Map<String,Integer> getIntTable(){
//		ExtendedContextVisitor extendedContextVisitor = new ExtendedContextVisitor();
//		Map<String,Integer> ret = new LinkedHashMap<>();
//		for(Entry<String,String> e:symbolTable.entrySet()){
//			AbstractBaseExt extendedContext =  extendedContextVisitor.visit(e.getValue());
//			try{
//				if(extendedContext.getEvaluatedStatus() == Evaluatable.COMPLETELY_EVALUATED){
//					ret.put(e.getKey(), Integer.parseInt(extendedContext.getFormattedText().trim()));
//				}
//			}catch(NumberFormatException n){
//				L.error("Error Parsing ["+ extendedContext.getFormattedText().trim()+ "] as an integer");
//				throw n;
//			}
//		}
//		return ret;
//	}

}
