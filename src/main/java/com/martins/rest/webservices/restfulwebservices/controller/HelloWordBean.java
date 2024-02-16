package com.martins.rest.webservices.restfulwebservices.controller;

public class HelloWordBean {

    private String message;

    public HelloWordBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    @Override
    public String toString() {
        return "HelloWordBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
