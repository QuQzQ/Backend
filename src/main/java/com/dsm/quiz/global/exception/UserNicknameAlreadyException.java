package com.dsm.quiz.global.exception;

public class UserNicknameAlreadyException extends BasicException{
    public UserNicknameAlreadyException() {
        super(ExceptionMessage.USER_NICKNAME_ALREADY);
    }
}
