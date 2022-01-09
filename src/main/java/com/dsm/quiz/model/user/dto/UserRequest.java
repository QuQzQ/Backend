package com.dsm.quiz.model.user.dto;

import lombok.Getter;

@Getter
public class UserRequest {
    private String nickName;
    private String email;
    private String password;

    public String getPassword(){
        return "";
    }
}
