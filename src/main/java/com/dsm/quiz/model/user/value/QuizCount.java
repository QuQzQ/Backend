package com.dsm.quiz.model.user.value;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class QuizCount {
    @Column(columnDefinition = "try_quiz_count")
    private int tryQuizCount;
    @Column(columnDefinition = "solve_quiz_count")
    private int solveQuizCount;
}
