<%@ page import="java.text.SimpleDateFormat" %><%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 28.02.2017
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>Список Клієнтів</title>
    <!-- jQuery -->
    <script type="text/javascript" src="resources/js/jquery-3.1.1.js"></script>
    <!-- Bootstrap Core JavaScript -->
    <script type="text/javascript" src="resources/js/bootstrap-3.3.7/js/bootstrap.js"></script>

    <link rel="stylesheet" href="resources/js/bootstrap-3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/dashboard.css">
    <link rel="stylesheet" href="resources/css/abbkindlist.css">
    <link rel="shortcut icon" href="resources/css/img/danataIcon.ico" type="image/x-icon">
    <link rel="stylesheet" href="resources/css/all.css">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>список видів обонементів</title>
</head>
<body>
<script type="text/javascript">
    $(document).ready(function(){
        $('[data-toggle="tooltip"]').tooltip({trigger:"hover"});
    });
</script>

<jsp:include page="../dashboard.jsp"/>

<div class="positionDash" class="wraper">
    <h1 class="text-center positionH" >Перелік Клієнтів  </h1>

    <div>
        <table class=" table table-hover table-bordered table-striped text-center">
            <thead>
            <tr>
                <td>Ім'я</td>
                <td>По батькові</td>
                <td>Прізвище</td>
                <td>Професія</td>
                <td>Дата Народження</td>
                <td>Стать</td>
                <td>Додаткові данні</td>
                <td>Дата Створення</td>
            </tr>

            </thead>
            <tbody  data-toggle="tooltip" title="Змінити / Видалити">
            <c:forEach items="${clientList}" var="client"  >
                <tr>
                    <td><a href="/changeClient/${client.id}">${client.fn}</a></td>
                    <td><a href="/changeClient/${client.id}">${client.mn}</a></td>
                    <td><a href="/changeClient/${client.id}">${client.ln}</a></td>
                    <td><a href="/changeClient/${client.id}">${client.profesion}</a></td>
                    <td><a href="/changeClient/${client.id}"><fmt:formatDate value="${client.datebirth}" pattern="dd/MM/yyyy"/></a></td>
                    <td><a href="/changeClient/${client.id}"><c:if test="${client.sex eq true}">чоловік </c:if><c:if test="${client.sex ne true}">жінка</c:if></a></td>
                    <td><a href="/changeClient/${client.id}">${client.comment}</a></td>
                    <td><a href="/changeClient/${client.id}"><fmt:formatDate value="${client.dateCreation}" pattern="dd/MM/yyyy"/> </a> </td>
                </tr>
            </c:forEach>
            </tbody>
        </table>
    </div>

</div>
</body>
</html>
