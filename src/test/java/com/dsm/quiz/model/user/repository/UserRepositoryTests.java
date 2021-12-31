package com.dsm.quiz.model.user.repository;

import com.dsm.quiz.model.user.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserRepositoryTests {
    @Autowired
    private UserRepository userRepository;

    @Test
    @DisplayName("유저 DB 저장 확인")
    void saveUserTest(){
        User user = User.builder()
                .email("abcd@naver.com")
                .password("test")
                .nickname("name")
                .build();

        User savedUser = userRepository.save(user);

        Assertions.assertThat(user.getEmail()).isEqualTo(savedUser.getEmail());
        Assertions.assertThat(userRepository.count()).isEqualTo(1);
    }
}
