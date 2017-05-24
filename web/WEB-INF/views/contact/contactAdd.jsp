<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <link rel="stylesheet" href="resources/css/abbkindlist.css">
    <link rel="shortcut icon" href="resources/css/img/danataIcon.ico" type="image/x-icon">
    <link rel="stylesheet" href="resources/css/all.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Створення нового контакту</title>
</head>
<body>




<div class="positionDash">
    <h1 class="text-center">Створити новий контакт</h1>

    <form:form  method="POST" action="addContact" commandName="contact">
        <table class="table tabBorderRound table-hover table-bordered table-striped text-center">
            <tr>
                <td><form:label path="phone">телефон</form:label></td>
                <td><form:input path="phone"/></td>
            </tr>

            <tr>
                <td><form:label path="email">електрона пошта</form:label></td>
                <td><form:input path="email"/></td>
            </tr>
            <tr>

                <td><form:label path="adress">адреса</form:label></td>

                <td><form:select path="adress">

                </td>
            </tr>
        </table>
        <input input class="c" type="submit" value="Зберегти" />
    </form:form>
</div>
</body>
</html>