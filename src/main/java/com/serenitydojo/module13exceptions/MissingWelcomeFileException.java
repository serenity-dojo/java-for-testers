package com.serenitydojo.module13exceptions;

/**
 * An unchecked exception, which is thrown when the welcome file cannot be found.
 * This class is complete - you do not need to change it.
 */
public class MissingWelcomeFileException extends RuntimeException {

    public MissingWelcomeFileException(String message, Throwable cause) {
        super(message, cause);
    }
}
