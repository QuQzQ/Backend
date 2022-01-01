package com.dsm.quiz.model.quiz.service;

import com.dsm.quiz.model.quiz.Quiz;
import com.dsm.quiz.model.quiz.dto.QuizResponse;
import com.dsm.quiz.model.quiz.repository.QuizRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor
@Service
public class QuizService {
    private final QuizRepository quizRepository;

    public List<QuizResponse> randomQuiz(int num){
        List<Quiz> quiz = quizRepository.randomQuiz(num);
        List<QuizResponse> quizResponses = new ArrayList<>();
        for(Quiz q : quiz){
            quizResponses.add(
                    QuizResponse.builder()
                            .content(q.getContent())
                            .title(q.getTitle())
                            .answer(q.getAnswer())
                            .build()
            );
        }
        return quizResponses;
    }
}