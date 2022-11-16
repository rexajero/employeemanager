package com.ajero.demo.employeemanager.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String messae) {
        super(messae);
    }
}
