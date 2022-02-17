<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 2:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Objects</title>
</head>
<body>
    <p>클라이언트 IP : <%= request.getRemoteAddr()%></p>
    <p>요청 정보 길이 : <%= request.getContentLength()%></p>
    <p>요청 정보 인코딩 : <%= request.getCharacterEncoding()%></p>
    <p>요청 정보 콘텐츠 유형 : <%= request.getContentType()%></p>
    <p>요청 정보 프로트콜 : <%= request.getProtocol()%></p>
    <p>요청 정보 전송 방식 : <%= request.getMethod()%></p>
    <p>요청 URI : <%= request.getRequestURI()%></p>
    <p>콘텍스트 경로 : <%= request.getContextPath()%></p>
    <p>서버 이름 : <%= request.getServerName()%></p>
    <p>서버 포트 : <%= request.getServerPort()%></p>
    <p>쿼리문 : <%= request.getQueryString()%></p>
</body>
</html>
