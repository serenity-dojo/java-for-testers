package com.serenitydojo.cart;

public class ItemNotReadyException extends Throwable {
    public ItemNotReadyException(String message) {
        super(message);
    }
}
