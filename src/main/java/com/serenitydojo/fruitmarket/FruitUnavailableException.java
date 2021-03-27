package com.serenitydojo.fruitmarket;

public class FruitUnavailableException extends RuntimeException {
    public FruitUnavailableException(String message, Throwable e) {
        super(message, e);
    }
}
