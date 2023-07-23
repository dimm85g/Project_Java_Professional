package Servlets;

import com.example.project_java_professional.Servlets.GameServlet;
import com.example.project_java_professional.main.Answer;
import com.example.project_java_professional.main.Question;
import com.example.project_java_professional.main.QuestionAndAnswerMap;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.IOException;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class TestGameServlet {
    @Test
    public void testDoGet() {
        HttpServletRequest req = Mockito.mock(HttpServletRequest.class);
        HttpServletResponse resp = Mockito.mock(HttpServletResponse.class);
        HttpSession session = Mockito.mock(HttpSession.class);
        QuestionAndAnswerMap questionAngAnswerMap = Mockito.mock(QuestionAndAnswerMap.class);
        GameServlet gameServlet = Mockito.mock(GameServlet.class);

        Question question1 = new Question("Ты потерял память. Принять вызов НЛО?");
        Answer answer1 = new Answer("Принять вызов");
        Answer badAnswer1 = new Answer("Отклонить вызов");
        Answer badAnswerResult1 = new Answer("Ты отклонил вызов. Поражение.");

        Mockito.when(req.getSession()).thenReturn(session);

        when(questionAngAnswerMap.getQuestion(1,QuestionAndAnswerMap.questionMap)).thenReturn(question1);
        when(questionAngAnswerMap.getAnswer(1,QuestionAndAnswerMap.answerMap)).thenReturn(answer1);
        when(questionAngAnswerMap.getBadAnswer(1,QuestionAndAnswerMap.badAnswerMap)).thenReturn(answer1);
        when(questionAngAnswerMap.getBadAnswerResult(1,QuestionAndAnswerMap.badAnswerResultMap)).thenReturn(badAnswerResult1);

    }
}
