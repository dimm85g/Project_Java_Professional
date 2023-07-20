<%--
  Created by IntelliJ IDEA.
  User: Dima
  Date: 15.07.2023
  Time: 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <title>Start_page</title>
</head>
    <body>
    <br>

    <br>
        <div class="container text-center">
            <h1><%= "Начало игры" %></h1>
            <h4>Ты стоишь в космическом порту и готов подняться на борт своего корабля.
            Разве ты не об этом мечтал? Стать капитаном галактического судна с экипажем,
            который будет совершать подвиги под твоим командованием.
            Так что вперед!</h4>
        </div>
        <br>

        <br>
        <div class="container text-center">
            <h4>Когда ты поднялся на борт своего корабля, тебя поприветствовала девушка с черной палкой в руках:
            - Здравствуйте, командир! Я Зинаида - ваша помощница. Видите? Там в углу пьет кофе наш штурман - сержант Перегарный Шлейф,
            под штурвалом спит наш бортмеханик - Черный Богдан, а фотографирует его Сергей Стальная Пятка - наш навигатор.
            А как обращаться к вам?</h4>
        </div>
    <br/>

    <br>
        <div class="container text-center">
        <form action="GameServlet">
            <input name="name">
            <br/>
            <button type="submit" class="btn btn-primary btn-lg"> Подписаться </button>
        </form>
        </div>
    </body>
</html>
