package com.serenitydojo.exceptions;

public class MissingWelcomeFileException extends RuntimeException {
    public MissingWelcomeFileException(String message, Throwable e) {
        super(message, e);
    }
}
