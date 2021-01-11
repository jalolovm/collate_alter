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

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private CoupleRepo coupleRepo;
	@Autowired
	private QuestionRepo questionRepo;

	@Test
	void contextLoads() {


		Couple couple11 = new Couple("one", "Aur", "Золото");
		Couple couple12 = new Couple("two", "H", "Водород");
		Couple couple13 = new Couple("three", "O", "Кислород");
		Couple couple14 = new Couple("four", "He", "Гелий");

		List<Couple> couples = new ArrayList<>();

		couples.add(couple11);
		couples.add(couple12);
		couples.add(couple13);
		couples.add(couple14);

		Question question1 = new Question("1a", "Составьте правильные пары", couples);


		questionRepo.save(question1);


	}

}
