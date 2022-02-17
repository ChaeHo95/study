<%--
  Created by IntelliJ IDEA.
  User: Chae Ho Choe
  Date: 2022-02-14
  Time: 오후 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form Processing</title>
</head>
<body>
<%
    request.setCharacterEncoding("utf-8");

    String id = request.getParameter("id");
    String password = request.getParameter("password");
    String name = request.getParameter("name");
    String phone1 = request.getParameter("phone1");
    String phone2 = request.getParameter("phone2");
    String phone3 = request.getParameter("phone3");
    String sex = request.getParameter("sex");
    String[] hobby = request.getParameterValues("hobby");
    String comment = request.getParameter("comment");
%>
<p> 아이디 : <%=id%></p>
<p> 비밀번호 : <%=password%></p>
<p> 이름 : <%=name%></p>
<p> 연락처 : <%=phone1%>-<%=phone2%>-<%=phone3%></p>
<p> 성별 : <%=sex%></p>
<p> 취미 : <%
    if (hobby != null){
        for(int i=0; i<hobby.length; i++){
            out.println(" " + hobby[i]);
        }
    }
%></p>
<p> 가입 인사 : <%=comment%></p>
</body>
</html>
