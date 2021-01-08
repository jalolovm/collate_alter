package com.example.demo.entity;

import javax.persistence.*;


@Entity

@Table(name = "couples")
public class Couple {

    @Id
    private String id;

    private String coupleLeft;

    private String coupleRight;

    @ManyToOne
    @JoinColumn(name = "question_ID")
    private Question question;

    public Couple() {
    }

    public Couple(String id, String coupleLeft, String coupleRight, Question question) {
        this.id = id;
        this.coupleLeft = coupleLeft;
        this.coupleRight = coupleRight;
        this.question = question;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCoupleLeft() {
        return coupleLeft;
    }

    public void setCoupleLeft(String coupleLeft) {
        this.coupleLeft = coupleLeft;
    }

    public String getCoupleRight() {
        return coupleRight;
    }

    public void setCoupleRight(String coupleRight) {
        this.coupleRight = coupleRight;
    }

    public Question getCollate() {
        return question;
    }

    public void setCollate(Question question) {
        this.question = question;
    }
}
