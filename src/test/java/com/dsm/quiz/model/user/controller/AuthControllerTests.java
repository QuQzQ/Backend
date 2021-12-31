package com.dsm.quiz.model.user.controller;
import com.dsm.quiz.model.user.dto.UserCreateRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static io.restassured.RestAssured.*;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class AuthControllerTests {

    @Test
    @DisplayName("[POST] /auth - 회원가입 성공")
    void successfullyCreateUser(){
            given()
                    .body(UserCreateRequestDto.builder()
                            .email("test@naver.com")
                            .password("testPassword")
                            .nickname("nick")
                            .build())
            .when().post("/auth")
            .then()
                    .statusCode(201);
    }

    @DisplayName("[POST] /auth - 회원가입 실패: 이메일 중복")
    @Test
    void failedCreateUserDuplicatedEmail(){
        given()
                .body(UserCreateRequestDto.builder()
                        .email("test@naver.com")
                        .password("testPassword")
                        .nickname("nick")
                        .build())
        .when().post("/auth")
        .then()
                .statusCode(409);
    }

    @DisplayName("[POST] /auth - 회원가입 실패: 닉네임 중복복")
    @Test
    void failedCreateUserDuplicatedNickname(){
        given()
                .body(UserCreateRequestDto.builder()
                        .email("test@naver.com")
                        .password("testPassword")
                        .nickname("nick")
                        .build())
                .when().post("/auth")
                .then()
                .statusCode(409);
    }
}
