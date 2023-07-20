<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.time.LocalDateTime" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
          rel="stylesheet"
          integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC"
          crossorigin="anonymous">
    <style>
        .st {
            float: none;
            width: 50%;
            height: 200px;
        }
    </style>
    <link href="css/table.css" rel="stylesheet">
    <title>Start</title>
</head>
<body>
<br>
<br>
<br>
<br>
<c:if test="${badText == null}">
    <div class="container text-center">
        <h3>${currentQuestion}</h3>
    </div>
</c:if>
<div class="st container text-center">
    <br>
    <br>
    <br>
    <br>
    <table class="blueTable">
        <tbody>
            <tr>
                <c:if test="${badText == null}">
                    <button onclick="window.location = '/Project_Java_Professional_war_exploded/GameServlet?answerText=1'">
                            ${answer}
                    </button>

                    <button onclick="window.location = '/Project_Java_Professional_war_exploded/GameServlet?badText=1'">
                            ${badAnswer}
                    </button>
                </c:if>
            </tr>
        </tbody>
            </tr>
    </table>
</div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
<div class="container text-center">
    <c:if test="${badText != null}">
        <h3>${badAnswerResult}</h3>
        <button onclick="window.location='/Project_Java_Professional_war_exploded/RestartGameServlet'" class="button button1">Начать заново</button>
    </c:if>
</div>
<div class="container text-center">
    <c:if test="${badText == null && counter == 4}">
        <h1>Тебя вернули домой</h1>
        <button onclick="window.location='/Project_Java_Professional_war_exploded/RestartGameServlet'" class="button button1">Начать заново</button>
    </c:if>
</div>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <br>
    <table>
        <tr>
            <td>Session:</td>
        <tr>
            <td>Name: ${name}</td>
        <tr>
            <td><%= "Date: " + LocalDateTime.now().toLocalDate()%>
            </td>
        <tr>
            <td><%= "Ip: " + request.getLocalName() %>
            </td>
        </tr>
        </tr>
    </table>
</body>
</html>
