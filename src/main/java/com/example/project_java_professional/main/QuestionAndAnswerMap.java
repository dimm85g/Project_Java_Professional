package com.example.project_java_professional.main;

import java.util.HashMap;
import java.util.Map;

public class QuestionAndAnswerMap {
    public final static Map<Integer, Question> questionMap = new HashMap<>();
    public final static Map<Integer, Answer> answerMap = new HashMap<>();
    public final static Map<Integer, Answer> badAnswerMap = new HashMap<>();
    public final static Map<Integer, Answer> badAnswerResultMap = new HashMap<>();

    static {
        setQuestionAndAnswer();
    }

    private static void setQuestionAndAnswer(){

        questionMap.put(1,new Question("Ты потерял память. Принять вызов НЛО?"));;
        questionMap.put(2,new Question("Ты принял вызов. Подняться на мостик к капитану?"));
        questionMap.put(3,new Question("Ты поднялся на мостик. Ты кто?"));

        answerMap.put(1,new Answer("Принять вызов"));
        answerMap.put(2,new Answer("Подняться на мостик"));
        answerMap.put(3,new Answer("Рассказать правду о себе"));

        badAnswerMap.put(1,new Answer("Отклонить вызов"));
        badAnswerMap.put(2,new Answer("Отказаться подниматься на мостик"));
        badAnswerMap.put(3,new Answer("Солгать о себе"));

        badAnswerResultMap.put(1, new Answer("Ты отклонил вызов. Поражение."));
        badAnswerResultMap.put(2, new Answer("Ты не пошел на переговоры. Поражение."));
        badAnswerResultMap.put(3, new Answer("Твою ложь разоблачили. Поражение"));
    }

    public Question getQuestion(int questionNumber){
        return questionMap.get(questionNumber);
    }

    public Answer getAnswer(int answerNumber){
        return answerMap.get(answerNumber);
    }

    public Answer getBadAnswer(int badAnswerNumber){
        return badAnswerMap.get(badAnswerNumber);
    }
    public Answer getBadAnswerResult(int badAnswerNumberResult){ return badAnswerResultMap.get(badAnswerNumberResult);
    }
}
