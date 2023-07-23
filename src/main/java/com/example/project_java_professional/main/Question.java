package com.example.project_java_professional.main;


import lombok.AllArgsConstructor;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


@Getter
public class Question {

    private static final Logger logger = LoggerFactory.getLogger(Question.class);
    public Question(String text) {
        if (text == null){
            throw new IllegalArgumentException();
        }
        this.text = text;
        logger.debug("Создание вопроса {}",text);
    }

    private String text;

    public String toString() {
        return this.text;
    }
}
