package com.dsm.quiz.model.user.service;

import com.dsm.quiz.exception.UserAlreadyException;
import com.dsm.quiz.exception.UserNicknameAlreadyException;
import com.dsm.quiz.model.user.User;
import com.dsm.quiz.model.user.dto.UserCreateRequestDto;
import com.dsm.quiz.model.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.AbstractPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {
    private final UserRepository userRepository;
    private final AbstractPasswordEncoder passwordEncoder;
    public void join(UserCreateRequestDto user){
        if (userRepository.existsById(user.getEmail())){
            throw new UserAlreadyException();
        }
        if (userRepository.existsByNickname(user.getNickname())){
            throw new UserNicknameAlreadyException();
        }

        userRepository.save(
                User.builder()
                .email(user.getEmail())
                .password(passwordEncoder.encode(user.getPassword()))
                .nickname(user.getNickname()).build()
        );

    }
}
