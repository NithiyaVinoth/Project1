package com.helper_file;

import java.io.IOException;

public class FileReadManager {

	// singleton design pattern

	// private

	public FileReadManager() {

	}

	// static method

	public static FileReadManager getInstance_FRM() {
		FileReadManager helper = new FileReadManager();
		return helper;

	}

	// non-static method

	public Configuration_Reader getInstance_CR() throws IOException {
		Configuration_Reader reader = new Configuration_Reader();
		return reader;

	}
}
