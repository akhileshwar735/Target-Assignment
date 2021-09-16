package com.akhil.training.oops.Assignment17;



public class InvalidDateException extends Exception {


    public InvalidDateException() {
    }


    public InvalidDateException(String message) {
        super(message);
    }

    public InvalidDateException(Throwable cause) {
        super(cause);
    }
}