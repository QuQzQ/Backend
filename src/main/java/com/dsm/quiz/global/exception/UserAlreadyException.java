package com.dsm.quiz.global.exception;

public class UserAlreadyException extends BasicException{
    public UserAlreadyException() {
        super(ExceptionMessage.USER_ALREADY);
    }
}
