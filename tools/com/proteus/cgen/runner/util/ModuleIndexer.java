package com.proteus.cgen.runner.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import java.util.Set;
import lombok.Data;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
public class ModuleIndexer {
	@Data
	public static class ModuleEntry{
		private final File file;
		private final String moduleName;
		private final int startLine;
		private int endLine;
		private boolean finished;
		private List<String> moduleInstantiations;
		@Override
		public String toString() {
			return  file + ", moduleName=" + moduleName
					+ ", startLine=" + startLine + ", endLine=" + endLine ;
		}

	}

	private static final Logger L = LoggerFactory.getLogger(ModuleIndexer.class);
	private final List<File> files;
	private final Map<String,ModuleEntry> index = new LinkedHashMap<String, ModuleEntry>();

	public ModuleIndexer(List<File> files){
		this.files = files;
		try {
			index(files);
		} catch (IOException e) {
			L.error("Error indexing files");
			throw new RuntimeException();
		}
	}

	public void index(List<File> files) throws IOException{
		Pattern patternStart = Pattern.compile("\\s*(\\bmodule\\b|\\bmacromodule\\b)\\s+(\\w+).*");
		Pattern patternend = Pattern.compile("\\s*endmodule\\s*.*");
		Pattern pragmaBegin = Pattern.compile("\\s*//pragma\\s*.*");
		Pattern pragmaEnd = Pattern.compile("\\s*//pragma\\s*.*\\.");
		for (File file:files){
			Integer prePragmaLineNo = null;
			Integer postPragmaLineNo = null;
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			int count=0;
			Stack<ModuleEntry> stack = new Stack<ModuleEntry>();
			while ((line = br.readLine()) != null) {
				Matcher mPragmaBegin = pragmaBegin.matcher(line);
				if(mPragmaBegin.matches() && prePragmaLineNo == null){
					prePragmaLineNo = count;
				}
				Matcher m = patternStart.matcher(line);
				if(!(m.matches() || mPragmaBegin.matches()) && prePragmaLineNo != null){
					prePragmaLineNo = null;
				}
				if(m.matches()){
					String modName = m.group(2);
					L.debug("Dectected Module :"+modName+" at "+count);
					if(index.containsKey(modName)){
						br.close();
						throw new RuntimeException("Duplicate Module "+modName+" Description exists in files:"+
								file.getAbsolutePath()+" and "+index.get(modName).getFile().getAbsolutePath());

					}else{
						if(prePragmaLineNo != null){
							stack.push(new ModuleEntry(file, modName, prePragmaLineNo));
						} else {
							stack.push(new ModuleEntry(file, modName, count));
						}
					}
				}
				Matcher m2 = patternend.matcher(line);
				if(m2.matches()){
					postPragmaLineNo = count;
				}
				Matcher mPragmaEnd = pragmaEnd.matcher(line);
				if(mPragmaEnd.matches() && postPragmaLineNo != null){
					postPragmaLineNo = count;
				}
				if(!(m2.matches() || mPragmaEnd.matches()) && postPragmaLineNo != null){
					ModuleEntry me = stack.pop();
					me.setEndLine(postPragmaLineNo);
					postPragmaLineNo = null;
					me.setFinished(false);
					index.put(me.getModuleName(), me);
				}
				count++;
			}
			if(stack.size() != 0 && postPragmaLineNo != null){
				ModuleEntry me = stack.pop();
				me.setEndLine(postPragmaLineNo);
				postPragmaLineNo = null;
				me.setFinished(false);
				index.put(me.getModuleName(), me);
			}
			br.close();
			if(stack.size()!=0){
				throw new RuntimeException("Error Occured During Indexing. Weak Kung-Fu");
			}
		}
	}


	public Set<String> getModuleNames(){
		return index.keySet();
	}

	public ModuleEntry getEntryForModule(String moduleName){
		return index.get(moduleName);
	}

	public boolean containsModule(String moduleName){
		return index.containsKey(moduleName);
	}

	/*	public void setFinished(String name){
		for(String module : index.keySet()){
			if(index.get(module).moduleName.equals(name)){
				index.get(module).setFinished(true);
			}
		}
	}
	 */
}
