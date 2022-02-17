<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 3:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <%
        out.println("오늘의 날짜 및 시각" + "<br>");
        out.println(java.util.Calendar.getInstance().getTime());
    %>
</body>
</html>
