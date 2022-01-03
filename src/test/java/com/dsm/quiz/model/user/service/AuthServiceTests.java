package com.dsm.quiz.model.user.service;

import com.dsm.quiz.model.user.User;
import com.dsm.quiz.model.user.dto.UserCreateRequestDto;
import com.dsm.quiz.model.user.repository.UserRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.security.crypto.password.AbstractPasswordEncoder;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;

@ExtendWith(MockitoExtension.class)
public class AuthServiceTests {
    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private AuthService authService;

    @Mock
    private AbstractPasswordEncoder passwordEncoder;



    @Test
    @DisplayName("join 기능 확인")
    void join(){
        UserCreateRequestDto userDto = UserCreateRequestDto.builder().email("abcd@naver.com").password("test").nickname("name").build();
        given(userRepository.existsById(any())).willReturn(false);
        given(userRepository.existsByNickname(any())).willReturn(false);
        given(userRepository.save(any())).willReturn(User.builder().build());
        given(passwordEncoder.encode(any())).willReturn("encoded password");

        authService.join(userDto);
    }
}
