<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Action Tag</title>
</head>
<body>
	<jsp:useBean id="person" class="dao_20220126.Person" scope="request" />
	<p>
		아이디 :
		<%=person.getId()%>
	<p>
		이 름 :
		<%=person.getName()%>

		<%
			person.setId(20182005);
			person.setName("홍길동");
		%>
	<jsp:include page="useBean03.jsp"></jsp:include>
</body>
</html>