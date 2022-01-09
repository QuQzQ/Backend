package com.dsm.quiz.model.user.repository;


import com.dsm.quiz.model.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
