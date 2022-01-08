package com.dsm.quiz.model.user.controller;

import com.dsm.quiz.model.user.dto.UserCreateRequestDto;
import com.dsm.quiz.model.user.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class AuthController {

    private final AuthService authService;

    @PostMapping("/auth")
    @ResponseStatus(HttpStatus.CREATED)
    public void join(UserCreateRequestDto user){
        authService.join(user);
    }

    @PostMapping("/user")
    public void login(){

    }

}
