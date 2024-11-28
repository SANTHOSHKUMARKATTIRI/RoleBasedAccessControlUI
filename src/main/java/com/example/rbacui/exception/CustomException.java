package com.example.rbacui.exception;

import lombok.Getter;

@Getter
public class CustomException extends RuntimeException {

    // Getter methods
    // Optional fields for additional information
    private String message;
    private int errorCode;

    // Default constructor
    public CustomException() {
        super();
    }

    // Constructor with a custom message
    public CustomException(String message) {
        super(message);
        this.message = message;
    }

    // Constructor with custom message and error code
    public CustomException(String message, int errorCode) {
        super(message);
        this.message = message;
        this.errorCode = errorCode;
    }

    // Constructor to wrap another exception
    public CustomException(String message, Throwable cause) {
        super(message, cause);
        this.message = message;
    }

    // Constructor to wrap another exception with error code
    public CustomException(String message, Throwable cause, int errorCode) {
        super(message, cause);
        this.message = message;
        this.errorCode = errorCode;
    }

}


