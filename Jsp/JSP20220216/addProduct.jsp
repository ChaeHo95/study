<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-15
  Time: 오후 2:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/CSS20220216/bootstrap.min.css">
    <script type="text/javascript" src="../resources/js/JS20220216/valdation.js"></script>
    <title>상품 등록</title>
</head>
<body>
    <fmt:setLocale value='<%= request.getParameter("language")%>'/>
    <%request.setCharacterEncoding("UTF-8");%>
    <fmt:bundle basename="bundle.message">
    <jsp:include page="menu.jsp"/>
    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3"> <fmt:message key = "title" /></h1>
            </form>
        </div>
    </div>
    <div class="container">
        <div class="text-right">
            <a href="?language=ko">Korean</a>|<a href="?language=en">English</a>
            <a href="logout.jsp" class="btn btn-sm btn-success pull-right">logout</a>
        </div>
        <form name="newProduct" action="./processAddProduct.jsp" class="form-horizontal" method="post" enctype="multipart/form-data">
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "productId"/></label>
                <div class="col-sm-3">
                    <input type="text" id="productId" name="productId" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "pname"/></label>
                <div class="col-sm-3">
                    <input type="text" id="name" name="name" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "unitPrice"/></label>
                <div class="col-sm-3">
                    <input type="text" id="unitPrice" name="unitPrice" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "description"/></label>
                <div class="col-sm-5">
                    <textarea name="description" cols="50" rows="2" class="form-control"></textarea>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "manufacturer"/></label>
                <div class="col-sm-3">
                    <input type="text" name="manufacturer" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "category"/></label>
                <div class="col-sm-3">
                    <input type="text" name="category" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "unitsInStock"/></label>
                <div class="col-sm-3">
                    <input type="text" id="unitsInStock" name="unitsInStock" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "condition"/></label>
                <div class="col-sm-5">
                    <input type="radio" name="condition" value="New">
                    <fmt:message key = "condition_New"/>
                    <input type="radio" name="condition" value="Old">
                    <fmt:message key = "condition_Old"/>
                    <input type="radio" name="condition" value="Refurbished">
                    <fmt:message key = "condition_Refurbished"/>
                </div>
            </div>
            <div class="form-group row">
                <label class="col-sm-2"><fmt:message key = "productImage"/></label>
                <div class="col-sm-5">
                    <input type="file" name="productImage" class="form-control">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-offset-2 col-sm-10">
                    <input type="button" name="btn btn-primary" value="<fmt:message key = "button"/>" onclick="CheckAddProduct()">
                </div>
            </div>
        </form>
    </div>
</fmt:bundle>
</body>
</html>