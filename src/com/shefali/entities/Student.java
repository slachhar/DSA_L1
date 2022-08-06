package com.shefali.entities;

import java.util.List;

public class Student {
    public String getName() {
        return name;
    }

    public Student(String name, List<Integer> scores) {
        this.name = name;
        this.scores = scores;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public List<Integer> getScores() {
        return scores;
    }

    public void setScores(List<Integer> scores) {
        this.scores = scores;
    }

    private List<Integer> scores;
    private String grade;
}
