package com.proteus.cgen.runner.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileSplitter {
	public static String lines(File file, int startIndex, int endIndex) throws IOException{
		StringBuilder sb = new StringBuilder();
		if(endIndex<startIndex){
			throw new IllegalArgumentException("endInex :"+endIndex+", startIndex: "+startIndex);
		}
		BufferedReader br = new BufferedReader(new FileReader(file));
		String line;
		int count=0;
		while ((line = br.readLine()) != null) {
			if(count>=startIndex && count<=endIndex){
				sb.append(line);
				sb.append("\n");
			}
			count++;
		}
		br.close();
		return sb.toString();
	}
}
