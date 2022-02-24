<%--
  Created by IntelliJ IDEA.
  User: Chae Ho Choe
  Date: 2022-02-24
  Time: 오후 9:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.net.URLEncoder" %>
<%
    request.setCharacterEncoding("UTF-8");

    Cookie cartId = new Cookie("Shipping_cartId",URLEncoder.encode(request.getParameter("cartId"),"utf-8"));
    Cookie name = new Cookie("Shipping_name",URLEncoder.encode(request.getParameter("name"),"utf-8"));
    Cookie shippingDate = new Cookie("Shipping_shippingDate",URLEncoder.encode(request.getParameter("shippingDate"),"utf-8"));
    Cookie country = new Cookie("Shipping_country",URLEncoder.encode(request.getParameter("country"),"utf-8"));
    Cookie zipCode = new Cookie("Shipping_zipCode",URLEncoder.encode(request.getParameter("zipCode"),"utf-8"));
    Cookie adressName = new Cookie("Shipping_adressName",URLEncoder.encode(request.getParameter("adressName"),"utf-8"));

    cartId.setMaxAge(24*60*60);
    name.setMaxAge(24*60*60);
    shippingDate.setMaxAge(24*60*60);
    country.setMaxAge(24*60*60);
    zipCode.setMaxAge(24*60*60);
    adressName.setMaxAge(24*60*60);

    response.addCookie(cartId);
    response.addCookie(name);
    response.addCookie(shippingDate);
    response.addCookie(country);
    response.addCookie(zipCode);
    response.addCookie(adressName);

    response.sendRedirect("orderConfirmation.jsp");
%>