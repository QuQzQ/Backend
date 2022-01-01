package com.dsm.quiz.model.quiz.dto;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
public class QuizRequestDto {
    private String title;
    private String content;
    private int answer;

    public QuizRequestDto(final String title, final String content, final int answer){
        this.title = title;
        this.content = content;
        this.answer = answer;
    }
}
