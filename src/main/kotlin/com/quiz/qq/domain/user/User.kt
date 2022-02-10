package com.quiz.qq.domain.user

import com.quiz.qq.domain.user.value.QuizCount
import lombok.Builder
import lombok.Getter
import javax.persistence.Entity
import javax.persistence.Id

@Entity
@Getter
@Builder
class User(@Id val id: String, val password: String, val nickname: String){
    val introduce:String = "나는 열심히 퀴즈를 풀 것이다"
    val quizCount: QuizCount = TODO()
}