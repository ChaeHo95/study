<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 2:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <%
        Enumeration en = request.getHeaderNames();
        while (en.hasMoreElements()) {
            String headerName = (String) en.nextElement();
            String headerValue = request.getHeader(headerName);
    %>
    <%=headerName%> : <%=headerValue%>
    <br>
    <%
        }
    %>
</body>
</html>
