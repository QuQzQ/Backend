package com.dsm.quiz.service;

import com.dsm.quiz.entity.User;
import com.dsm.quiz.payload.request.UserRequest;
import com.dsm.quiz.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    public void join(UserRequest user){
        userRepository.save(User.builder()
                                        .email(user.getEmail())
                                        .name(user.getName()).nickname(user.getNickName()).password(user.getPassword()).build());
    }
}
