package com.example.project_java_professional.Servlets;

import com.example.project_java_professional.main.Answer;
import com.example.project_java_professional.main.Question;
import com.example.project_java_professional.main.QuestionAndAnswerMap;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
@WebServlet(name = "GameServlet", value = "/GameServlet")
public class GameServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String badText = req.getParameter("badText");
        session.setAttribute("badText", badText);

        Integer counter = (Integer) session.getAttribute("counter");

        if (counter == null){
            session.setAttribute("counter",1);
        } else {
            session.setAttribute("counter", counter + 1);
        }

        String name = req.getParameter("name");
        if (name != null) {
            session.setAttribute("name", name);
        }

        QuestionAndAnswerMap questionList = new QuestionAndAnswerMap();

        if (counter == null) {
            getCurrentText(req, (Integer) session.getAttribute("counter"), questionList);
        } else if (counter == 1) {
            getCurrentText(req, (Integer) session.getAttribute("counter"), questionList);
        } else if (counter == 2) {
            getCurrentText(req, (Integer) session.getAttribute("counter"), questionList);
        } else if (counter == 3) {
            getCurrentText(req, (Integer) session.getAttribute("counter"), questionList);
        }

        RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("/start.jsp");
            requestDispatcher.forward(req, resp);

    }

    private void getCurrentText(HttpServletRequest req, Integer counter, QuestionAndAnswerMap questionList) {
        Question currentQuestion = questionList.getQuestion(counter);
        Answer answer = questionList.getAnswer(counter);
        Answer badAnswer = questionList.getBadAnswer(counter);
        Answer badAnswerResult = questionList.getBadAnswerResult(counter-1);

        req.setAttribute("currentQuestion", currentQuestion);
        req.setAttribute("answer", answer);
        req.setAttribute("badAnswer", badAnswer);
        req.setAttribute("badAnswerResult", badAnswerResult);
    }
}






