package com.example.demo;

import java.time.LocalDateTime;

import com.example.demo.question.Question;
import com.example.demo.question.QuestionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private QuestionRepository questionRepository;

	@Test
	void testJpa(){
		Question q1 = new Question();
		q1.setSubject("Question 1");
		q1.setContent("Content 1");
		q1.setCreateDate(LocalDateTime.now());
		questionRepository.save(q1);

		Question q2 = new Question();
		q2.setSubject("Question 2");
		q2.setContent("Content 2");
		q2.setCreateDate(LocalDateTime.now());
		questionRepository.save(q2);
	}

}
