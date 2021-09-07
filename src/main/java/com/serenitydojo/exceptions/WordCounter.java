package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class WordCounter {

    public int numbersOfWordsIn(String value) {
        if(value==null){
            return 0;
        }
        return value.split("\\W").length;


    }

    public int numbersOfWordsInAFile(String fileName){
        try {
            String fileContents = Files.readString(Paths.get(fileName));
            return numbersOfWordsIn(fileName);
        }
        catch (NoSuchFileException noSuchFile){
            return 0;
        }
        catch(IOException otherException){
            return -1;
        }
        finally {
            System.out.println("file processed for " + fileName);
        }
    }
}
