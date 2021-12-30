package com.dsm.quiz.model.quiz;

import com.dsm.quiz.model.user.User;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@Table(name = "quiz")
@Entity
@NoArgsConstructor
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private int answer;
    @ManyToOne
    private User user;
    // 정답률

    @Builder
    Quiz(String title, String content, int answer, User user){
        this.title = title;
        this.content = content;
        this.answer = answer;
        this.user = user;
    }
}
