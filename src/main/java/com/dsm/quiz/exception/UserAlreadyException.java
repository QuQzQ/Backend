package com.dsm.quiz.exception;

public class UserAlreadyException extends BasicException{
    public UserAlreadyException() {
        super(ExceptionMessage.USER_ALREADY);
    }
}
