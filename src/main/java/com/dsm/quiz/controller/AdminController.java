package com.dsm.quiz.controller;

import com.dsm.quiz.entity.Quiz;
import com.dsm.quiz.payload.request.QuizRequest;
import com.dsm.quiz.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RequiredArgsConstructor
@RestController
public class AdminController {

    private final AdminService adminService;

    @PostMapping("/admin")
    public boolean login(HttpServletRequest request){
        return adminService.login(request.getParameter("id"), request.getParameter("pw"));
    }

    @PostMapping("/quiz")
    public void quizInsert(QuizRequest quizReq){
        Quiz quiz = Quiz.builder()
                .content(quizReq.getContent())
                .title(quizReq.getTitle())
                .answer(quizReq.getAnswer())
                .build();
        adminService.insertQuiz(quiz);
    }

}
