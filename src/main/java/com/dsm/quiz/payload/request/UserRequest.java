package com.dsm.quiz.payload.request;

import lombok.Getter;

@Getter
public class UserRequest {
    private String name;
    private String nickName;
    private String email;
    private String password;

    public String getPassword(){
        return "";
    }
}
