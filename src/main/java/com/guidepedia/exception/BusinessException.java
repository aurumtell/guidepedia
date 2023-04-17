package com.guidepedia.exception;

public class BusinessException extends RuntimeException{
    public BusinessException(String message) {
        super("Object is already deleted or exist");
    }
}