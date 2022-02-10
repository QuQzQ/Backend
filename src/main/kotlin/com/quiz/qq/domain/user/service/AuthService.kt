package com.quiz.qq.domain.user.service

import com.quiz.qq.domain.user.User
import com.quiz.qq.domain.user.UserRepository
import com.quiz.qq.domain.user.dto.UserCreateRequestDto
import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.stereotype.Service

@Service
class AuthService(private val repository: UserRepository, private val passwordEncoder: PasswordEncoder) {
    fun join(dto: UserCreateRequestDto){
        repository.save(
            User(dto.id,
                passwordEncoder.encode(dto.password),
                dto.nickname)
        )
    }
}