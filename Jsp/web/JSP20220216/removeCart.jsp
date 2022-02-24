<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-24
  Time: 오전 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="dao_20220216.Product" %>
<%@ page import="dao_20220216.ProductRepository" %>

<%
        String id = request.getParameter("id");
        if(id == null || id.trim().equals("")){
            response.sendRedirect("products.jsp");
            return;
        }

        ProductRepository dao = ProductRepository.getInstance();

        Product product = dao.getProductById(id);
        if (product == null){
            response.sendRedirect("exceptionNoProductId.jsp");
        }

        ArrayList<Product> cartList = (ArrayList<Product>) session.getAttribute("cartlist");
        Product goodsQnt = new Product();
        for (int i=0; i<cartList.size(); i++){
            goodsQnt = cartList.get(i);
            if(goodsQnt.getProductId().equals(id)){
                cartList.remove(goodsQnt);
            }
        }
        response.sendRedirect("cart.jsp");
%>
