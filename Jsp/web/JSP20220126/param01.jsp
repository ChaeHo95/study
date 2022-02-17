<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<h3>param 액션 태그</h3>
	<jsp:forward page ="param01_date.jsp">
	<jsp:param value="admin" name="id"/>
	<jsp:param name = "name" value = "<%=java.net.URLEncoder.encode("관리자") %>"/>
	</jsp:forward>
	<p>Java Server Page
</body>
</html>