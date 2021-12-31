package com.dsm.quiz.model.user.controller;

import com.dsm.quiz.model.user.dto.UserCreateRequestDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @PostMapping("/auth")
    @ResponseStatus(HttpStatus.CREATED)
    public void join(UserCreateRequestDto user){

    }

    @PostMapping("/user")
    public void login(){

    }

}
