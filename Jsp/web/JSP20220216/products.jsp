<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dao_20220216.Product"%>
<%@ page import="dao_20220216.ProductRepository"%>
<jsp:useBean id="productDAO" class="dao_20220216.ProductRepository"
	scope="session" />
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet"
	href="../resources/css/CSS20220216/bootstrap.min.css"/>
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
		ProductRepository dao = ProductRepository.getInstance();
		ArrayList<Product> listOfProducts = dao.getAllProducts();
	%>
	<div class="container">
		<div class="row" align="center">
			<% for(int i= 0; i<listOfProducts.size(); i++){
		Product product = listOfProducts.get(i);
	%>
			<div class="col-md-4">
				<img src="../resources/images/<%=product.getFilename()%>" style="width: 100%">
				<h3><%= product.getPname() %></h3>
				<p><%= product.getDescription() %>
				<p><%= product.getUnitPrice() %>원
				<p><a href="./product.jsp?id=<%=product.getProductId()%>"
				class="btn btn-secondary" role="button">상세 정보 &raquo;</a></p>
			</div>
			<% } %>
		</div>
		<hr>
	</div>
	<%@include file="footer.jsp"%>
</body>
</html>