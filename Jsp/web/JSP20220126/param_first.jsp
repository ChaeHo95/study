<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
<h3>�� ������ jsp:param_first.jsp�Դϴ�</h3>
<jsp:include page = "param_second.jsp">
<jsp:param name="date" value="<%= new java.util.Date() %>"/>
</jsp:include>
<p>Java Server Page</p>
</body>
</html>