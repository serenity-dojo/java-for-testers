package com.serenitydojo.exceptions;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import com.google.common.base.Splitter;

public class WordCounterUtils {

	public int numberOfWordsIn(String value) {
		if (value == null) {
			return 0;
		}
		return Splitter.onPattern("\\W").omitEmptyStrings().trimResults().splitToList(value).size();
	}

	public int numberOfWordsInFile(String filename) throws IOException {
		try {
			String fileContents = Files.readString(Paths.get(filename));
			int wordCount = numberOfWordsIn(fileContents);
			System.out.println(wordCount);
			if (wordCount == 0) {
				throw new FileHasNoWordException("No words found in the file " + filename);
			}
			return wordCount;
		} catch (NoSuchFileException noSuchFile) {
			throw new FileHasNoWordException("No words found in the non-existant file " + filename);
		}
	}

}