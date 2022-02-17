<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<h3>이 파일은 include_first.jsp입니다.</h3>
	<jsp:include page = "include_second.jsp" flush = "false"/>
	<p> Java Server Page</p>
</body>
</html>