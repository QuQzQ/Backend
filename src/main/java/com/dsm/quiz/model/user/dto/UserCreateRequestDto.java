package com.dsm.quiz.model.user.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserCreateRequestDto {
    private final String email;
    private final String password;
    private final String nickname;
}
