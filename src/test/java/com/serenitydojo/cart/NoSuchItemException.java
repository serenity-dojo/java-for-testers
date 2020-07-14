package com.serenitydojo.cart;

public class NoSuchItemException extends Exception {
    public NoSuchItemException(String message) {
        super(message);
    }
}
