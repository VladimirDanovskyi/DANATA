<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <link rel="stylesheet" href="resources/css/abbkindlist.css">
        <link rel="shortcut icon" href="resources/css/img/danataIcon.ico" type="image/x-icon">
        <link rel="stylesheet" href="resources/css/all.css">
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Створення нового напрямку</title>
    </head>
    <body>


    <jsp:include page="../dashboard.jsp"/>

        <div class="positionDash">
            <h1 class="text-center">Створити новий напрямок клубу</h1>

            <form:form method="POST" action="addTraindirection" commandName="trainDirection">
                <table class="table table-hover table-bordered table-striped text-center rounded">
                    <thead>
                        <tr class="warning">
                            <th class="text-center">назва напрямку</th>
                            <th class="text-center">актуальність</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td><form:input path="name"/></td>
                            <td><form:select path="valid">
                                <form:option value="${true}">актуальний</form:option>
                                <form:option value="${false}">не актуальний</form:option>
                            </form:select>
                            </td>
                        </tr>
                </table>
                <input input class="c" type="submit" value="Зберегти"/>

            </form:form>
        </div>
    </body>
</html>