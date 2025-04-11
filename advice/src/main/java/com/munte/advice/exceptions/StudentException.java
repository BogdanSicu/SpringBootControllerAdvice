package com.munte.advice.exceptions;

public class StudentException extends RuntimeException {
    public static final long serialVersionUID=1;

    public StudentException(String message) {
        super(message);
    }
}
