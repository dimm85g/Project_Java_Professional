package com.example.project_java_professional.main;

import com.example.project_java_professional.main.Answer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;
@AllArgsConstructor
@Getter
public class Question {
    //private int number;
    private String text;

    public String toString() {
        return this.text;
    }
}
