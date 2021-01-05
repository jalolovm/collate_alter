package com.example.demo.entity;

import javax.persistence.*;


@Entity

@Table(name = "couples")
public class Couple {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String coupleLeft;

    private String coupleRight;

    @ManyToOne
    @JoinColumn(name = "question_ID")
    private Question question;

    public Couple() {
    }

    public Couple(String coupleLeft, String coupleRight, Question question) {
        this.coupleLeft = coupleLeft;
        this.coupleRight = coupleRight;
        this.question = question;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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
