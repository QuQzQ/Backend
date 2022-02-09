package com.quiz.qq.domain.user.dto

import lombok.Builder

@Builder
data class UserCreateRequestDto(var nickname:String,
                                var id:String,
                                var password:String)