package com.dsm.quiz.model.user.value;
import javax.persistence.Embeddable;

@Embeddable
public class QuizCount {
    private int tryQuizCount;
    private int solveQuizCount;
}
