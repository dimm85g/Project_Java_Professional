package com.example.project_java_professional.Servlets;


import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
@WebServlet(name = "RestartGameServlet", value = "/RestartGameServlet")
public class RestartGameServlet extends HttpServlet {
    private static final Logger logger = LoggerFactory.getLogger(GameServlet.class);

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        req.getSession().invalidate();
        resp.sendRedirect("/Project_Java_Professional_war_exploded/index.jsp");
        logger.info("Игра перезапущена");
    }

}
