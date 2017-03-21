package com.proteus.cgen.runner;

import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.util.List;

public interface ICommandLineParser {

	List<Path> getIncludedFiles();

	List<Path> getFOptionFiles();

	void processArgs() throws FileNotFoundException;

}
