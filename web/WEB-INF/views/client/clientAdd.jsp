<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <%--<script type="text/javascript" src="resources/timepicer/js/jquery-1.11.1.min.js"></script>
    <script type="text/javascript" src="resources/timepicer/js/moment-with-locales.min.js"></script>
    <script type="text/javascript" src="resources/timepicer/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="resources/timepicer/js/bootstrap-datetimepicker.min.js"></script>
    <link rel="stylesheet" href="resources/timepicer/css/bootstrap.min.css" />
    <link rel="stylesheet" href="resources/timepicer/css/bootstrap-datetimepicker.min.css" />--%>

        <!-- jQuery -->
        <script type="text/javascript" src="/resources/js/jquery-3.1.1.js"></script>
        <!-- Bootstrap Core JavaScript -->
        <script type="text/javascript" src="/resources/js/bootstrap-3.3.7/js/bootstrap.js"></script>


        <script type="text/javascript" src="/resources/datepicer1/js/bootstrap-datepicker.js"></script>
        <script type="text/javascript" src="/resources/datepicer1/locales/bootstrap-datepicker.ru.min.js"></script>
        <link rel="stylesheet" href="/resources/datepicer1/css/bootstrap-datepicker.css" />


        <link rel="stylesheet" href="/resources/js/bootstrap-3.3.7/css/bootstrap.css">
        <link rel="stylesheet" href="/resources/css/dashboard.css">
    <link rel="stylesheet" href="/resources/css/abbkindlist.css">
    <link rel="shortcut icon" href="/resources/css/img/danataIcon.ico" type="image/x-icon">
    <link rel="stylesheet" href="/resources/css/all.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Створення нового виду обонементу</title>
</head>
<body>


<jsp:include page="../dashboard.jsp"/>


<div class="positionDash">
    <h1 class="text-center">Створити нового клієнта</h1>
<script type="text/javascript">
    $(document).ready(function() {

        $('.datepicker').datepicker( {language: "ru",
            format: "dd/mm/yyyy"});

    });

</script>


    <form:form  method="POST" action="addClient" commandName="client">
        <table class="table tabBorderRound table-hover table-bordered table-striped text-center">
            <tr>
                <td><form:label path="fn"> ім'я</form:label></td>
                <td><form:input path="fn"/></td>
            </tr>

            <tr>
                <td><form:label path="mn">по батькові</form:label></td>
                <td><form:input path="mn"/></td>
            </tr>
            <tr>
                <td><form:label path="ln">фамілія</form:label></td>
                <td><form:input path="ln"/></td>
            </tr>
            <tr>
                <td><form:label path="profesion">професія</form:label></td>
                <td><form:input path="profesion"/></td>
            </tr>

            <tr>
                <td><form:label path="datebirth">дата народження</form:label></td>
                <td><form:input cssClass="datepicker" path="datebirth" readonly="true" />

                </td>
            </tr>
            <tr>
                <td><form:label path="comment">коментарій</form:label></td>
                <td ><form:input path="comment"/></td>
            </tr>
            <tr>
                <td><form:label path="sex">стать</form:label></td>
                <td> <form:select path="sex">

                <form:option value="${true}">чоловік</form:option>
                <form:option value="${false}">жінка</form:option>
            </form:select>
                </td>
            </tr>
        </table>
        <input id="#getDate" class="c" type="submit" value="Зберегти"  onclick="getMyTime()"/>
        <a href="/clientListinit" CLASS="c">Список клієнтів</a>
        <a href="/changeClient/${client.id}" CLASS="c">Видалити клієнта</a>
    </form:form>

</div>
</body>
</html>