<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-21
  Time: 오전 10:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/CSS20220216/bootstrap.min.css">
    <title>페이지 오류</title>
</head>
<body>
    <jsp:include page="menu.jsp"/>
    <div class="jumbotron">
        <div class="container">
            <h2 class="alert alert-danger">요청하신 페이지를 찾을 수 없습니다.</h2>
        </div>
    </div>
    <div class="container">
        <p><%=request.getRequestURL()%></p>
        <p> <a href="product.jsp" class="btn btn-secondary">상품 목록 &raquo;</a> </p>
    </div>
</body>
</html>
