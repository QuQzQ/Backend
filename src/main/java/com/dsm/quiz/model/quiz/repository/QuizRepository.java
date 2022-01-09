package com.dsm.quiz.model.quiz.repository;

import com.dsm.quiz.model.quiz.Quiz;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface QuizRepository extends CrudRepository<Quiz, Integer> {

    @Query(value = "select * from quiz order by rand() limit :num",nativeQuery = true)
    List<Quiz> randomQuiz(int num);
}
