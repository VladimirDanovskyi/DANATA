
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
    <h1 class="text-center">Змінити напрямок</h1>
    <c:url var = "addAction" value="/changeTrainDirection"/>
    <form:form   action="${addAction}"  commandName="trainDirection">
        <table class="table tabBorderRound table-hover table-bordered table-striped text-center">
            <tr>
                <td></td>
                <td><form:hidden path="id"/></td>
            </tr>

            <tr>
                <td><form:label path="name"> назва напрямку</form:label></td>
                <td><form:input path="name"/></td>
            </tr>

            <tr>
                <td><form:label path="dateCreate">дата створення</form:label></td>
                <fmt:formatDate value="${trainDirection.dateCreate}" var="dateString" pattern="dd/MM/yyyy" />
                <td><form:input path="dateCreate"  value="${dateString}" /></td>
            </tr>
               <td> <form:label path="valid">актуальність напрямку</form:label></td>
            <td><form:select path="valid">
                <c:if test="${trainDirection.valid eq true }">
                    <form:option value="${trainDirection.valid}">актуальний</form:option>
                    <form:option value="${false}">не актуальний </form:option>
                        </c:if>
                <c:if test="${trainDirection.valid ne true }">
                    <form:option value="${trainDirection.valid}">не актуальний</form:option>
                    <form:option value="${true}">актуальний</form:option>
                </c:if>
            </form:select>
            </td>

            </tr>
        </table>
        <input class="c" type="submit" value="Зберегти"/>
        <a href="/deleteTrainDirect/${trainDirection.id}" CLASS="c">Видалити</a>
        <a href="/abonementKindsOfTrainDirection/${trainDirection.id}" CLASS="c">Види абонементів напрямку</a>
    </form:form>
    </form>
</div>
</body>
</html>