<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 1:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <%
        request.setCharacterEncoding("utf-8");
        String  userid = request.getParameter("id");
        String  password = request.getParameter("password");
    %>
    <p> 아이디 : <%=userid%>
    <p> 비밀번호 : <%=password%>
</body>
</html>
