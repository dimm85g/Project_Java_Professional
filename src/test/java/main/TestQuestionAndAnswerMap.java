package main;


import com.example.project_java_professional.main.Answer;
import com.example.project_java_professional.main.Question;
import com.example.project_java_professional.main.QuestionAndAnswerMap;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestQuestionAndAnswerMap {
    @Test
    public void TestGetQuestion(){

        Map<Integer, Question> questionMap = new HashMap<>();

        Question question1 = new Question("Ты потерял память. Принять вызов НЛО?");
        Question question2 = new Question("Ты принял вызов. Подняться на мостик к капитану?");
        Question question3 = new Question("Ты поднялся на мостик. Ты кто?");

        questionMap.put(1,question1);
        questionMap.put(2,question2);
        questionMap.put(3,question3);

        QuestionAndAnswerMap map = new QuestionAndAnswerMap();
        assertEquals(question1,map.getQuestion(1,questionMap));

    }
    @Test
    public void TestGetAnswer(){

        Map<Integer, Answer> answerMap = new HashMap<>();

        Answer answer1 = new Answer("Принять вызов");
        Answer answer2 =new Answer("Подняться на мостик");
        Answer answer3 =new Answer("Рассказать правду о себе");

        answerMap.put(1,answer1);
        answerMap.put(2,answer2);
        answerMap.put(3,answer3);

        QuestionAndAnswerMap map = new QuestionAndAnswerMap();
        assertEquals(answer2,map.getAnswer(2,answerMap));

    }
    @Test
    public void TestGetBadAnswer(){

        Map<Integer, Answer> badAnswerMap = new HashMap<>();

        Answer badAnswer1 = new Answer("Отклонить вызов");
        Answer badAnswer2 =new Answer("Отказаться подниматься на мостик");
        Answer badAnswer3 =new Answer("Солгать о себе");

        badAnswerMap.put(1,badAnswer1);
        badAnswerMap.put(2,badAnswer2);
        badAnswerMap.put(3,badAnswer3);

        QuestionAndAnswerMap map = new QuestionAndAnswerMap();
        assertEquals(badAnswer2,map.getAnswer(2,badAnswerMap));

    }
    @Test
    public void getBadAnswerResult(){

        Map<Integer, Answer> badAnswerResultMap = new HashMap<>();

        Answer badAnswerResult1 = new Answer("Ты отклонил вызов. Поражение.");
        Answer badAnswerResult2 =new Answer("Ты не пошел на переговоры. Поражение.");
        Answer badAnswerResult3 =new Answer("Твою ложь разоблачили. Поражение");

        badAnswerResultMap.put(1,badAnswerResult1);
        badAnswerResultMap.put(2,badAnswerResult2);
        badAnswerResultMap.put(3,badAnswerResult3);

        QuestionAndAnswerMap map = new QuestionAndAnswerMap();
        assertEquals(badAnswerResult2,map.getBadAnswerResult(2,badAnswerResultMap));

    }
}
