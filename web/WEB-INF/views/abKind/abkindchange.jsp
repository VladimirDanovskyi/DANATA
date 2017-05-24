
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <!-- jQuery -->
    <script type="text/javascript" src="/resources/js/jquery-3.1.1.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script type="text/javascript" src="/resources/js/bootstrap-3.3.7/js/bootstrap.js"></script>

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
    <h1 class="text-center">Змінити абонемент</h1>
<c:url var = "addAction" value="/change"/>
    <form:form   action="${addAction}" modelAttribute="abonementKind">
        <table class="table tabBorderRound table-hover table-bordered table-striped text-center">
            <tr>
                <td></td>
                <td><form:hidden path="id"/></td>
            </tr>

            <tr>
                <td><form:label path="nameAb"> назва абонементу</form:label></td>
                <td><form:input cssStyle="width: 90%" path="nameAb"/></td>
            </tr>

            <tr>
                <td><form:label path="daysValid">кількість відвідувань</form:label></td>
                <td><form:input path="daysValid"/></td>
            </tr>
            <tr>
                <td><form:label path="dateCreate">дата створення</form:label></td>
        <fmt:formatDate value="${abonementKind.dateCreate}" var="dateString" pattern="dd/MM/yyyy" />
        <td><form:input path="dateCreate"  value="${dateString}" /></td>
            </tr>

            <tr>
                <td> <form:label path="traindirections">напрямок клубу</form:label></td>
                <td><form:select path="traindirections">
                <form:option value="${abonementKind.traindirections.id}">${abonementKind.traindirections.name}</form:option>
                <c:forEach items="${trainDirectionList}" var="traindirectionElem">
                    <c:if test="${abonementKind.traindirections ne traindirectionElem}">
                   <form:option value="${traindirectionElem.id}">${traindirectionElem.name}</form:option>
                    </c:if>
                </c:forEach>
            </form:select>
            </td>
            </tr>
        </table>
        <input class="c" type="submit" value="Зберегти"/>
    <a href="/delete/${abonementKind.id}" CLASS="c">Видалити</a>
    </form:form>
</div>
</body>
</html>