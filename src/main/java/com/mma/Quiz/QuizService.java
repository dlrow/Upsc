package com.mma.Quiz;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.mma.domain.Question;

@Service
public class QuizService {

	//@Cacheable("asd")
	@Cacheable(cacheNames = "redisCacheManager", key = "#q.toString()")
	public Question Helloqs(Question q) throws InterruptedException {
		Thread.sleep(5000);
		return new Question(1,"qu1");
	}
}
