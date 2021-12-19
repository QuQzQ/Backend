package com.dsm.quiz.repository;


import com.dsm.quiz.service.*;
import com.dsm.quiz.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, String> {
}
