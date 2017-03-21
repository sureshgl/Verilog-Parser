package com.proteus.cgen.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	private static Properties properties;
	
	static{
		File file = new File("./cfg/proteus_cgen.properties");
		FileInputStream inStream = null;
		try {
			inStream = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		properties = new Properties();
		try {
			properties.load(inStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
		try {
			inStream.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String getLibDir(){
		return properties.getProperty("proteus.common.stl.dir");
	}
	
	public static String getCommonDir(){
		return properties.getProperty("proteus.common.dir");
	}
	
	public static String getConvertedMakefile(){
		return properties.getProperty("proteus.makefile.converted");
	}
	
	public static String getConvertedSubdir(){
		return properties.getProperty("proteus.subdir.converted");
	}
	
	public static String getMainMakefile(){
		return properties.getProperty("proteus.makefile.main");
	}
	
	public static String getMain(){
		return properties.getProperty("proteus.main.main");
	}
	
}
