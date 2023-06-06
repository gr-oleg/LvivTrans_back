package com.lvivtrans.login.exception;

public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String email){
        super("Could not found the user with email "+ email);
    }
}
