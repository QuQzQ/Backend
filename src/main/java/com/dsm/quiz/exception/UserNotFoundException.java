package com.dsm.quiz.exception;

public class UserNotFoundException extends BasicException{
    public UserNotFoundException() {
        super(ExceptionMessage.USER_NOT_FOUND);
    }
}
