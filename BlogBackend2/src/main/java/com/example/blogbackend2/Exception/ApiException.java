package com.example.blogbackend2.Exception;

public class ApiException extends RuntimeException{
    public ApiException(String message) {
        super(message);
    }
}
