<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 2:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <p>이 페이지는 5초마다 새로고침 됩니다.</p>
    <%
        response.setIntHeader("Refresh",5);
    %>
    <p><%=(new java.util.Date())%></p>
</body>
</html>
