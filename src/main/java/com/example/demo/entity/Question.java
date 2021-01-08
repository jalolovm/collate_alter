package com.example.demo.entity;


import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {

    @Id
    private String id;
    private String question;


    public Question() {
    }

    public Question(String id, String question) {
        this.id = id;
        this.question = question;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

}
