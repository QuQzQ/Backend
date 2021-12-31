package com.dsm.quiz.model.user;

import com.dsm.quiz.model.quiz.Quiz;
import com.dsm.quiz.model.user.value.QuizCount;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Table(name = "user")
@Getter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String email;
    private String password;
    private String nickname;
    private String introduction;
    private String title;
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Quiz> quizzes;
    private int point;
    @Embedded
    @AttributeOverride(name = "tryQuizCount",
            column = @Column(name = "try_quiz_count"))
    @AttributeOverride(name = "solveQuizCount",
            column =  @Column(name = "solve_quiz_count"))
    private QuizCount quizCount;
}
