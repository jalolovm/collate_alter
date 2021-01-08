package com.example.demo;

import com.example.demo.entity.Couple;
import com.example.demo.entity.CoupleRepo;
import com.example.demo.entity.Question;
import com.example.demo.entity.QuestionRepo;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CoupleRepo coupleRepo;
	@Autowired
	private QuestionRepo questionRepo;

	@Test
	void contextLoads() {
		Question question1 = new Question("1", "Составьте правильные пары");

		Couple couple11 = new Couple("one", "Aur", "Золото", question1);
		Couple couple12 = new Couple("two", "H", "Водород", question1);
		Couple couple13 = new Couple("three", "O", "Кислород", question1);
		Couple couple14 = new Couple("four", "He", "Гелий", question1);

		questionRepo.save(question1);

		coupleRepo.save(couple11);
		coupleRepo.save(couple12);
		coupleRepo.save(couple13);
		coupleRepo.save(couple14);
	}

}
