package com.quiz.qq.domain.user.value

import lombok.Builder
import lombok.Getter
import javax.persistence.Embeddable

@Builder
@Getter
@Embeddable
class QuizCount (val tryQuizCount: Int, val solveQuizCount: Int)