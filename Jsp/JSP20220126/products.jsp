<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao_20220126.Product"%>
<jsp:useBean id="productDAO" class="dao_20220126.ProductRepository"
	scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>상품 목록</title>
</head>
<body>
	<%@include file="menu.jsp"%>
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">상품 목록</h1>
		</div>
	</div>
	<%
		ArrayList<Product> listOfProducts = productDAO.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
			<% for(int i= 0; i<listOfProducts.size(); i++){
		Product product = listOfProducts.get(i);
	%>
			<div class="col-md-4">
				<h3><%= product.getPname() %></h3>
				<p><%= product.getDescription() %>
				<p><%= product.getUnitPrice() %>원
			</div>
			<% } %>
		</div>
		<hr>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>