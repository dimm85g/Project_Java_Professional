package com.example.project_java_professional.main;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Answer {
    private static final Logger logger = LoggerFactory.getLogger(Answer.class);

    private final String text;
    public Answer(String text) {
        if (text == null){
            throw new IllegalArgumentException();
        }
        this.text = text;
        logger.debug("Создание ответа {}", text);

    }

    public String toString() {
        return this.text;
    }
}
