package com.dsm.quiz.exception;

public class UserNicknameAlreadyException extends BasicException{
    public UserNicknameAlreadyException() {
        super(ExceptionMessage.USER_NICKNAME_ALREADY);
    }
}
