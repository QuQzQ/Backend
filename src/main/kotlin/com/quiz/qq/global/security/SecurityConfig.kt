package com.quiz.qq.global.security

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder

import org.springframework.security.crypto.password.PasswordEncoder
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import java.lang.Exception


@Configuration
@EnableWebSecurity
class SecurityConfig : WebSecurityConfigurerAdapter() {
    @Bean
    fun getPasswordEncoder(): PasswordEncoder? {
        return BCryptPasswordEncoder()
    }

    @Throws(Exception::class)
    override fun configure(http: HttpSecurity) {
        http
            .cors().disable()
            .csrf().disable()
            .formLogin().disable()
            .headers().frameOptions().disable()
    }
}