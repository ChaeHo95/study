<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-24
  Time: 오전 9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao_20220216.Product" %>
<%@ page import="dao_20220216.ProductRepository" %>

<%
        String id = request.getParameter("cartId");
        if(id == null || id.trim().equals("")){
            response.sendRedirect("cart.jsp");
            return;
        }

        session.invalidate();

        response.sendRedirect("cart.jsp");
%>
