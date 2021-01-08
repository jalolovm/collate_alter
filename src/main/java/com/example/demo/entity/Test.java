package com.example.demo.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Test {

    @Autowired
    private CoupleRepo coupleRepo;
    @Autowired
    private QuestionRepo questionRepo;


    public void savaQuestion(Question question){
        questionRepo.save(question);
    }

    public void savaCouple(Couple couple){
        coupleRepo.save(couple);
    }



    public void oper(){

        Question question1 = new Question("1", "Составьте правильные пары");

        Couple couple11 = new Couple("one", "Aur", "Золото", question1);
        Couple couple12 = new Couple("two", "H", "Водород", question1);
        Couple couple13 = new Couple("three", "O", "Кислород", question1);
        Couple couple14 = new Couple("four", "He", "Гелий", question1);

        savaQuestion(question1);

        savaCouple(couple11);
        savaCouple(couple12);
        savaCouple(couple13);
        savaCouple(couple14);
    }

}
