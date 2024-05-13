package com.serenitydojo.exceptions;

public class FileNoHasWordException extends RuntimeException{
    public FileNoHasWordException(String message) {
        super(message);
    }

    public FileNoHasWordException(String message, Throwable cause) {
        super(message, cause);
    }
}