package com.proteus.cgen.utils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;

import com.proteus.common.util.FileUtils;

public class CgenUtils {
	
	private static int var = 0;
	private static int indent = 0;

	public static Map<String,String> readModuleMap(){
		Map<String,String> moduleMap = new HashMap<String,String>();
		String path = PropertyReader.getLibDir()+"/moduleMap";
		File moduleMapFile = new File(path);
		ObjectMapper mapper  = new ObjectMapper();
		TypeReference<HashMap<String,String>> typeRef = new TypeReference<HashMap<String,String>>() {};
		try {
			moduleMap = mapper.readValue(FileUtils.readFileIntoString(moduleMapFile),typeRef) ;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return moduleMap;
	}
	
	public synchronized static String getVarName(){
		return  "var"+var++;
	}
	
	public synchronized static int getindent(){
		return indent++;
	}
}
