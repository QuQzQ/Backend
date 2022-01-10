package com.dsm.quiz.global.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ExceptionMessage {
    INVALID_ADMIN_ID(404, "Admin that do not exist"),
    USER_NOT_FOUND(404, "User email not found"),
    USER_ALREADY(409, "User already"),
    USER_NICKNAME_ALREADY(409, "User Nickname already");

    private final int status;
    private final String message;
}
