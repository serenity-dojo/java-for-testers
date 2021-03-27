package com.serenitydojo.exceptions;

import org.apache.commons.io.filefilter.IOFileFilter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {
       return Files.readString(Paths.get("src/main/resources/hello.txt"));
    }

    public Boolean fileContainsText(String filename, String expectedText) {
        try
        {
            String path = "src/main/resources/" + filename;
            return Files.readString(Paths.get(path)).contains(expectedText);
        }
        catch(NoSuchFileException fileDoesNotExist)
        {
            return false;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }

    }

    public Boolean fileHasText(String filename, String expectedText) throws IOException,MissingWelcomeFileException  {
        try
        {
            String path = "src/main/resources/" + filename;
            return Files.readString(Paths.get(path)).contains(expectedText);
        }
        catch (NoSuchFileException missingFile)
        {
            throw new MissingWelcomeFileException("Unable to find the file " + filename,missingFile);
        }

    }
}
