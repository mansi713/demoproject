package com.example.demoproject.Exception;

public class ApiException extends RuntimeException{
    public ApiException(String message) { super(message);}
    public ApiException() { super("An error occurred");}
}
