package com.sebastian.model;

public class BookNotAvailableException extends RuntimeException{
    public BookNotAvailableException(String message){
        super(message);
    }
}
