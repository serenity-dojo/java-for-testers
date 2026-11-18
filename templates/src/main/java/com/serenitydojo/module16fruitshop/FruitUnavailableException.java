package com.serenitydojo.module16fruitshop;

/**
 * Thrown when someone asks for a fruit that is not currently in the catalog.
 * This class is complete - you do not need to change it.
 */
public class FruitUnavailableException extends RuntimeException {

    public FruitUnavailableException(String message) {
        super(message);
    }
}
