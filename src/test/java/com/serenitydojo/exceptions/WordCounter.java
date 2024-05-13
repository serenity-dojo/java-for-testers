package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numberOfWordsIn(String value){
        if(value == null){
            return 0;
        }
        int numberOfWords = value.split("\\W").length;
        return numberOfWords;
    }

    public int numberOfWordsInFile(String fileName) throws IOException, RuntimeException {
        try {
            String fileContents = Files.readString(Paths.get(fileName));
            //System.out.println("file contents "+fileContents);
            int numberOfWords = numberOfWordsIn(fileContents);
            //System.out.println("number of words "+numberOfWords);
            if (numberOfWords == 1){
                throw new FileNoHasWordException("Not words found in the file "+fileName);
            }
            return numberOfWords;
        } catch(NoSuchFileException noSuchFile){
            throw new FileNoHasWordException("Not word in not existing file "+fileName);
        }
    }

}
