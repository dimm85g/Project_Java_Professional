package com.example.project_java_professional.main;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

public class QuestionAndAnswerMap {
    private static final Logger logger = LoggerFactory.getLogger(QuestionAndAnswerMap.class);
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

        logger.info("Количество вопросов: {}", questionMap.size());
        logger.debug("Количество ответов: {}+{}+{}",answerMap.size(),badAnswerMap.size(),badAnswerResultMap.size());

    }

    public Question getQuestion(int questionNumber, Map<Integer, Question> questionMap){
        return questionMap.get(questionNumber);
    }

    public Answer getAnswer(int answerNumber, Map<Integer, Answer> answerMap){
        return answerMap.get(answerNumber);
    }

    public Answer getBadAnswer(int badAnswerNumber, Map<Integer, Answer> badAnswerMap){
        return badAnswerMap.get(badAnswerNumber);
    }
    public Answer getBadAnswerResult(int badAnswerNumberResult, Map<Integer, Answer> badAnswerResultMap){
        return badAnswerResultMap.get(badAnswerNumberResult);
    }
}
