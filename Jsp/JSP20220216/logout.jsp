<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-16
  Time: 오후 1:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    session.invalidate();
    response.sendRedirect("addProduct.jsp");
%>