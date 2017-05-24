<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 23.02.2017
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>

<html>
<head>

    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>dushboard</title>
    <meta charset="utf-8">
    <link rel="stylesheet" href="resources/js/bootstrap-3.3.7/css/bootstrap.css">
    <link rel="stylesheet" href="resources/css/dashboard.css">

</head>
<body class="image wraper">
<script type="text/javascript">
    $(document).ready(function(){
        $('[data-toggle="popover"]').popover({ trigger: "hover" });
    });
</script>
<div class="position">
      <div>
            <ul class="list-unstyled">
              <li  class="dashList"><a href="/abKindList" data-toggle="popover" title="список видів абонементів" data-content="новий або змінити">ВИДИ АБОНЕМЕНТІВ</a></li>
              <li class="dashList"><a>АБОНЕМЕНТИ</a></li>
                <li class="dashList"><a href="/newClient" data-toggle="popover" title="список клієнтів" data-content="новий або змінити">КЛІЄНТИ</a></li>
              <li class="dashList"><a>ІНСТРУКТОРИ</a></li>
                <li class="dashList"><a href="/train_direction_list" data-toggle="popover" title="список напрямків клубу" data-content="новий або змінити">НАПРЯМКИ ФІТНЕС КЛУБУ</a></li>
              <li class="dashList"><a>ВИДИ ТРЕНУВАНЬ</a></li>
                <li class="dashList"><a>ІНШІ ПОСЛУГИ</a></li>
              <li class="dashList"><a>ЦІНИ</a></li>
            </ul>
      </div>
    </div>

</div>
</body>
</html>
