package com.serenitydojo.exceptions;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StringProcessor {

    public String showLengthOf(String input) {
        int length = (input == null) ? 0 : input.length();
        return input + " has a length of " + length;
    }


    public int getPortOf(String urlAsAString) {
        try {
            URL url = new URL(urlAsAString);
            return url.getDefaultPort();
        } catch(MalformedURLException badlyWrittenException) {
            throw new TestEnvironmentUnavailableException();
        }
    }
}
