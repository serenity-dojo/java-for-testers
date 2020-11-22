package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class FileLoader {
    public String readHelloWorld() throws IOException {
        return Files.readString(Paths.get("src/main/resources/hello.txt"));
    }

    public boolean fileContainsText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (IOException e) {
            return false;
        }
    }

    public boolean fileHasText(String filename, String expectedText) {
        String path = "src/main/resources/" + filename;
        try {
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (IOException e) {
            throw new MissingWelcomeFileException("Missing welcome file: " + filename, e);
        }
    }
}
