<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-24
  Time: 오전 9:25
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

    ArrayList<Product> goodsList = dao.getAllProducts();
    Product goods = new Product();
    for(int i=0; i<goodsList.size(); i++){
        goods = goodsList.get(i);
        if (goods.getProductId().equals(id)){
            break;
        }
    }

    ArrayList<Product> list = (ArrayList<Product>) session.getAttribute("cartlist");
    if (list == null){
        list = new ArrayList<Product>();
        session.setAttribute("cartlist",list);
    }

    int cnt = 0;
    Product goodsQnt = new Product();
    for (int i=0; i<list.size(); i++){
        goodsQnt = list.get(i);
        if(goodsQnt.getProductId().equals(id)){
            cnt++;
            int orderQuantity = goodsQnt.getQuantity() +1;
            goodsQnt.setQuantity(orderQuantity);
        }
    }

    if (cnt == 0){
        goods.setQuantity(1);
        list.add(goods);
    }

    response.sendRedirect("product.jsp?id=" + id);
%>