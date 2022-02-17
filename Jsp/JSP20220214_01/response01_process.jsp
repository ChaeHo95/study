<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 2:37
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
        String userid = request.getParameter("id");
        String password = request.getParameter("password");

        if(userid.equals("관리자") && password.equals("1234")){
            response.sendRedirect("response01_success.jsp");
        }
        else {
            response.sendRedirect("response01_failed.jsp");
        }
    %>
</body>
</html>
