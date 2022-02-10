package com.quiz.qq.domain.user.controller

import com.quiz.qq.domain.user.dto.UserCreateRequestDto
import com.quiz.qq.domain.user.service.AuthService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthController(private val authService: AuthService) {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("users")
    fun join(@RequestBody dto: UserCreateRequestDto){
        authService.join(dto);
    }

}