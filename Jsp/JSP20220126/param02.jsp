<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<h3>Param �׼� �±�</h3>
	<jsp:include page="param02_date.jsp">
	<jsp:param value="<%= java.net.URLEncoder.encode("������ ��¥�� �ð�") %>" name="title"/>
	<jsp:param name = "date" value = "<%= java.util.Calendar.getInstance().getTime() %>"/>
	</jsp:include>
</body>
</html>