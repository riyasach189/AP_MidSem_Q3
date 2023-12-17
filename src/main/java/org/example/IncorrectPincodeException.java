package org.example;

public class IncorrectPincodeException extends Exception{

    private final String message;

    public IncorrectPincodeException(String s) {
        message = s;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
