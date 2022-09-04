package com.jingsong.assignment1.order;

public class OrderNotFoundException extends Throwable {
    public OrderNotFoundException(String message) {
        super(message);
    }
}
