package com.example.sbb1;

import com.example.sbb1.answer.Answer;
import com.example.sbb1.answer.AnswerRepository;
import com.example.sbb1.question.Question;
import com.example.sbb1.question.QuestionRepository;
import com.example.sbb1.question.QuestionService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Sbb1ApplicationTests {

    @Autowired
    private QuestionService questionService;

    @Autowired
    private AnswerRepository answerRepository;

	@Test
	void testJpa() {
        for (int i = 1; i <= 300; i++) {
            String subject = String.format("테스트 데이터입니다:[%03d]", i);
            String content = "내용무";
            this.questionService.createQuestion(subject, content);
        }
	}
}