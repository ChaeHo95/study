 <%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-14
  Time: 오후 3:33
  To change this template use File | Settings | File Templates.
--%>
 <%@ page import="dao_20220216.Product" %>
 <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="dao_20220216.ProductRepository" %>
 <%@ page errorPage="exceptionNoProductId.jsp" %>
<jsp:useBean id="productDAO" class="dao_20220216.ProductRepository" scope="session"/>
<html>
<head>
    <link rel="stylesheet" href="../resources/css/CSS20220216/bootstrap.min.css"/>
    <title>상품 상세 정보</title>
    <script type="text/javascript">
        function addToCart(){
            if(confirm("상품을 장바구니에 추가하시겠습니까?")){
                document.addForm.submit();
            }else {
                document.addForm.reset();
            }
        }

    </script>
</head>
<body>
    <jsp:include page="menu.jsp"/>
    <div class="jumbotron">
        <div class="container">
            <h1 class="display-3">상품 정보</h1>
        </div>
    </div>
    <%
        String id = request.getParameter("id");
        ProductRepository dao = ProductRepository.getInstance();
        Product product = dao.getProductById(id);
    %>
    <div class="container">
        <div class="row">
            <div class="col-md-5">
                <img src="../resources/images/<%=product.getFilename()%>" style="width: 100%">
            </div>
            <div class="col-md-6">
                <h3><%=product.getPname()%></h3>
                <p><%=product.getDescription()%></p>
                <p> <b> 상품 코드 : </b><span class="badge badge-danger">
                    <%=product.getProductId()%></span> </p>
                <p><b>제조사</b> : <%=product.getManufacturer()%></p>
                <p><b>분류</b> : <%=product.getCategory()%></p>
                <p><b>재고 수</b> : <%=product.getUnitsInStock()%></p>
                <h4><%=product.getUnitPrice()%>원</h4>
                <p><form name="addForm" action="./addCart.jsp?id=<%=product.getProductId()%>"method="post"></p>
                <p><a href="#" class="btn btn-info" onclick="addToCart()">상품 주문 &raquo;</a>
                    <a href="./cart.jsp" class="btn btn-warning"> 장바구니 &raquo;</a>
                    <a href="./products.jsp" class="btn btn-secondart"> 상품 목록 &raquo;</a></p>
                </form>
            </div>
        </div>
        <hr>
    </div>
    <jsp:include page="footer.jsp" />
</body>
</html>
