<%@ page import="java.util.Enumeration" %><%--
  Created by IntelliJ IDEA.
  User: Chae Ho Choe
  Date: 2022-02-14
  Time: 오후 11:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Processing</title>
</head>
<body>
    <table border="1">
        <tr>
            <th>요청 파라미터 이름</th>
            <th>요청 파라미터 값</th>
        </tr>
        <%
            request.setCharacterEncoding("utf-8");

            Enumeration paramNames = request.getParameterNames();
            while (paramNames.hasMoreElements()){
                String name = (String) paramNames.nextElement();
                out.println("<tr><td>" + name + "</td>\n");
                String paramValue = request.getParameter(name);
                out.println("<td> " + paramValue + "</td></tr>\n");
            }
        %>
    </table>
</body>
</html>
