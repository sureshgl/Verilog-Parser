package com.proteus.common.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.zip.GZIPInputStream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.google.common.base.Throwables;
import com.google.common.io.Files;
import com.proteus.common.util.Utils.fn1;

public class FileUtils {

	protected static final Logger L = LoggerFactory.getLogger(FileUtils.class);

	public static List<File> allFilesInDir(String dirName){
		File dir = new File(dirName);
		List<File> ret = new ArrayList<File>();
		for(File file:dir.listFiles()){
			if(file.isFile()){
				ret.add(file);
			}
		}
		return ret;
	}
	
	public static List<File> allFilesInDirRecusively(String dirName, String pattern) {
		List<File> files = new LinkedList<File>();
		File dir = new File(dirName);
		if(dir.isDirectory()) {
			File[] filesInCurrDir = dir.listFiles();
			for(File fileInCurrDir : filesInCurrDir) {
				if(fileInCurrDir.isDirectory()) {
					List<File> filesInside = allFilesInDirRecusively(fileInCurrDir.getAbsolutePath(), pattern);
					for(File fileInside : filesInside) {
						if(pattern == null || pattern.isEmpty() || fileInside.getName().matches("^.*"+pattern+".*$")) files.add(fileInside);
					}
				}
				if(pattern == null || pattern.isEmpty() || fileInCurrDir.getName().matches("^.*"+pattern+".*$")) files.add(fileInCurrDir);
			}
		}
		return files;
	}

	public static List<File> allFilesInDir(String dirName,final String extension){
		List<File> files = allFilesInDir(dirName);
		return Utils.filter(new fn1<Boolean, File>() {
			@Override
			public Boolean invoke(File file) {
				return extension == null ? true : file.getName().endsWith(extension);
			}
		}, files);
	}

	public static List<File> alldirsInDir(String dirName){
		File dir = new File(dirName);
		List<File> ret = new ArrayList<File>();
		for(File file:dir.listFiles()){
			if(file.isDirectory() && !file.isHidden()){
				ret.add(file);
			}
		}
		return ret;
	}

	public static void Copy(InputStream in, File dest){
		try{
			OutputStream out = new FileOutputStream(dest);

			byte[] buf = new byte[1024];
			int len;
			while ((len = in.read(buf)) > 0){
				out.write(buf, 0, len);
			}
			in.close();
			out.close();
		}
		catch(FileNotFoundException e){
			throw new RuntimeException("Copy Failed :", e);
		} catch (IOException e) {
			throw new RuntimeException("Copy Failed :", e);
		}
	}

	public static void WriteFile(File file, String string) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			out.write(string);
			out.flush();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}	
	}

	public static void writeToFile(File file, boolean append, String content){
		try{
			Files.createParentDirs(file);
			BufferedWriter bw = new BufferedWriter(new FileWriter(file, append));
			try{
				bw.write(content);
			} finally {
				bw.close();
			}
		} catch (IOException e){
			throw Throwables.propagate(e);
		}
	}

	public static String readFileIntoString(File fileName){
		return readFileIntoString(fileName, null);
	}


	public static String readFileIntoString(File fileName, String linesep){
		try{
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			try{
				StringBuilder sb = new StringBuilder();
				String str;
				while ((str = br.readLine()) != null){
					sb.append(str);
					if(linesep != null) {
						sb.append(linesep);
					}
				}
				return sb.toString();
			} finally {
				br.close();
			}
		} catch (IOException e){
			throw Throwables.propagate(e);
		}
	}

	public static void AppendToFile(File file, String string) {
		try {
			BufferedWriter out = new BufferedWriter(new FileWriter(file, true));
			out.write(string);
			out.flush();
			out.close();
		} catch (IOException e) {
			throw new RuntimeException(e);
		}			
	}

	public static void WriteFile(File file, StringBuilder sb) {
		try {
			L.info("Write to file: " + file.getAbsolutePath());
			BufferedWriter out = new BufferedWriter(new FileWriter(file));
			final int    sbLen   = sb.length();
			final int    chunk   = 20240;
			final char [] chars = new char[chunk];

			for(int aPosStart = 0; aPosStart < sbLen; aPosStart += chunk) {
				final int aPosEnd = Math.min(aPosStart + chunk, sbLen);
				sb.getChars(aPosStart, aPosEnd, chars, 0);
				out.write(chars, 0, aPosEnd - aPosStart);
				out.flush();
			}
			out.close();
		} catch (IOException e) {
			L.info(e.toString());
			throw new RuntimeException(e);
		}		
	}

	public static String ReadFromFile(InputStream input) 
	{
		try
		{
			StringBuilder builder = new StringBuilder();
			BufferedReader reader = new BufferedReader(new InputStreamReader(input));

			char[] buf = new char[1024];
			int numRead=0;
			while((numRead=reader.read(buf)) != -1){
				builder.append(buf, 0, numRead);
			}
			reader.close();
			input.close();
			return builder.toString();
		}
		catch (IOException e) {
			throw new RuntimeException(e);
		}
	}

	public static String ReadFromFile(File file) {
		try {
			return ReadFromFile(new FileInputStream(file));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}		
	}


	public static List<String> ReadLines(File file) {
		List<String> ret = new LinkedList<String>();
		try{
			InputStream fis = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
			String line = null;
			while ((line = br.readLine()) != null) {
				ret.add(line);
			}
			br.close();
		} catch(Exception e){
			throw new RuntimeException(e);
		}
		return ret;
	}

	public static Set<String> GetUniqueLines(File file) {
		Set<String> ret = new HashSet<String>();
		try{
			InputStream fis = new FileInputStream(file);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis, Charset.forName("UTF-8")));
			String line = null;
			while ((line = br.readLine()) != null) {
				ret.add(line);
			}
			br.close();
		} catch(Exception e){
			throw new RuntimeException(e);
		}
		return ret;
	}

	public static void copyPermissions(File src, File dest) {
		dest.setExecutable(src.canExecute());
		dest.setWritable(src.canWrite());
		dest.setReadable(src.canRead()); // Not needed really :)
	}

	public static void Copy(File src, File dest) {
		if(src.isDirectory() || dest.isDirectory()) throw new RuntimeException("Cannot copy dir.");
		try {
			Copy(new FileInputStream(src), dest);
			copyPermissions(src, dest);
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}

	}

	public static void CopyDirToDir(String srcPath, String destPath, boolean copyHidden) {
		File src = new File(srcPath);
		File dest = new File(destPath);
		String finalDest = dest.getAbsolutePath() + File.separator + src.getName();
		CopyDir(srcPath, finalDest, copyHidden);
	}
	
	public static void CopyDir(String srcPath, String destPath, boolean copyHidden) {
		CopyDir(srcPath, destPath, null, copyHidden);
	}

	public static void CopyDir(String srcPath, String destPath, List<String> exclusions, boolean copyHidden) {
		File src = new File(srcPath);
		File dest = new File(destPath);
		if(!src.exists()) throw new RuntimeException("Src file does not exists.");
		if(!src.isDirectory()) throw new RuntimeException("Src file is not a directory.");
		if(!dest.exists()) dest.mkdirs();
		CopyFileorDir(src, dest, exclusions, copyHidden);
	}
	
	// TODO: Verify if recursive directory copy works fine for links 
	// and does not go into infinite loops in recursive cases. -- Janak

	private static void CopyFileorDir(File src, File dest, List<String> exclusions, boolean copyHidden) {
		if(src.isDirectory()){
			for(String fileName : src.list()){
				File f = new File(src, fileName);
				if(f.isHidden() && !copyHidden)	continue;
				dest.mkdirs();
				File d = new File(dest, fileName);
				CopyFileorDir(f, d, exclusions, copyHidden);
			}
		}
		else{
			if(isCopyable(src.getAbsolutePath(), exclusions)) Copy(src, dest);
		}		
	}
	
	public static boolean isCopyable(String file, List<String> exclusions) {
		if(exclusions != null) {
			for(String exc : exclusions) {
				if(file.matches(".*"+exc+".*")) {
					return false;
				}
			}
		}
		return true;
	}

	public static void setExecutable(File file) {
		file.setExecutable(true, false);
	}

	public static InputStream getInputStream(File file) throws FileNotFoundException, IOException {
		if (file.getName().endsWith(".gz")) {
			return new GZIPInputStream(new FileInputStream(file));
		} else {
			return new FileInputStream(file);
		}
	}

	// Deletes all files and subdirectories under dir.
	// Returns true if all deletions were successful.
	// If a deletion fails, the method stops attempting to delete and returns false.
	public static void Delete(File f, boolean errorOut) {
		try
		{
			if (f.isDirectory()) {
				String[] children = f.list();
				for (int i=0; i<children.length; i++) {
					File ftd = new File(f, children[i]);
					Delete(ftd, errorOut);
				}
			}

			boolean ret = f.delete();
			if(!ret && errorOut) throw new RuntimeException("Could not delete " + f.getAbsolutePath());
		}
		catch(Throwable t){
			if(errorOut) Throwables.propagate(t);
		}
	}
	
	public static void deleteAllEmptyDirs(File dir) {
		if(dir != null && dir.exists() && dir.isDirectory()) {
			for(File f : dir.listFiles()) {
				if(f.isDirectory()) {
					deleteAllEmptyDirs(f);
					if(f.list().length == 0) f.delete();
				}
			}
		}
	}

	public static void CreateNewFile(File f) {
		try{
			f.createNewFile();
		}
		catch(Throwable t){
			Throwables.propagate(t);
		}
	}

	public static void copyFileToDir(String src, String dest) {
		try {
			File f_src=new File(src);
			File f_dest=new File(dest);		
			f_dest.mkdirs();
			Copy(f_src,  new File(dest + File.separator + f_src.getName()));
		} catch (Exception ee) {
			System.err.println("Error copying " +  src + " to " + dest);
			ee.printStackTrace();
		}
	}

	public static boolean NotExists(File file, boolean warn) {
		boolean ret = file == null || !file.exists();
		if(ret && warn) L.warn("File does not exists. -- " + (file == null ? "null" : file.getAbsolutePath()));
		return ret;
	}

	public static String getExtension(String fname) {
		if(fname != null) {
			int li = fname.lastIndexOf('.');
			if(li > 0) {
				return fname.substring(li+1);
			}
		}
		return "";
	}
}
