package com.dsm.quiz.model.user.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class JwtResponse {
    private String token;
}
