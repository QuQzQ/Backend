package com.dsm.quiz.controller;

import com.dsm.quiz.payload.request.UserRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {

    @RequestMapping("/auth")
    public void join(UserRequest user){


    }

}
