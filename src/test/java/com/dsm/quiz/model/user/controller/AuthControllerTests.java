package com.dsm.quiz.model.user.controller;
import com.dsm.quiz.model.user.dto.UserCreateRequestDto;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.*;


public class AuthControllerTests {

    @Test
    @DisplayName("[POST] /auth - 회원가입 성공")
    void successfullyCreateUser(){
            given()
                    .body(UserCreateRequestDto.builder().build())
            .when().post("/auth")
            .then()
                    .statusCode(201);
    }
}
