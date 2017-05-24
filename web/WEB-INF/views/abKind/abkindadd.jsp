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
    <title>Створення нового виду обонементу</title>
</head>
<body>


    <jsp:include page="../dashboard.jsp"/>

<div class="positionDash">
<h1 class="text-center">Створити новий вид абонементу</h1>

<form:form  method="POST" action="add" commandName="abonementKind">
    <table class="table tabBorderRound table-hover table-bordered table-striped text-center">
        <tr>
            <td><form:label path="nameAb"> назва абонементу</form:label></td>
             <td><form:input path="nameAb"/></td>
        </tr>

        <tr>
            <td><form:label path="daysValid">кількість відвідувань</form:label></td>
            <td><form:input path="daysValid"/></td>
        </tr>
        <tr>

            <td><form:label path="traindirections">напрямок клубу</form:label></td>
           <%-- <td><form:input path="traindirections" />
--%><%--
                <form:select path="traindirections">
                <form:options items="${trainDirectionList}"  itemvalue="name" itemLabel="name"/>
                 </form:select>--%>
            <td><form:select path="traindirections">
            <c:forEach items="${trainDirectionList}" var="traindirectionElem">
                    <form:option value="${traindirectionElem.id}">${traindirectionElem.name}</form:option>
            </c:forEach>
            </form:select>
            </td>
        </tr>
    </table>
    <input input class="c" type="submit" value="Зберегти" />
</form:form>
</div>
</body>
</html>