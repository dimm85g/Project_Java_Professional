package com.example.project_java_professional.main;

import lombok.Getter;

public class Answer {
    private final String text;

    private String badAnswerText;

    public Answer(String text) {
        this.text = text;

    }

    public String toString() {
        return this.text;
    }
}
