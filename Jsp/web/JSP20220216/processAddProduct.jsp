<%--
  Created by IntelliJ IDEA.
  User: YJ
  Date: 2022-02-15
  Time: 오후 2:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.oreilly.servlet.*" %>
<%@ page import="com.oreilly.servlet.multipart.*" %>
<%@ page import="java.util.*" %>
<%@ page import="dao_20220216.Product" %>
<%@ page import="dao_20220216.ProductRepository" %>

<%
    request.setCharacterEncoding("utf-8");

    String filename = "";
    String realFolder = pageContext.getServletContext().getRealPath("/")+"resources/images";
    int maxSize = 5 * 1024 * 1024;
    String encType = "utf-8";

    MultipartRequest multi = new MultipartRequest(request, realFolder, maxSize, encType, new DefaultFileRenamePolicy());
    String productId = multi.getParameter("productId");
    String name = multi.getParameter("name");
    String unitPrice = multi.getParameter("unitPrice");
    String description = multi.getParameter("description");
    String manufacturer = multi.getParameter("manufacturer");
    String category = multi.getParameter("category");
    String unitsInStock = multi.getParameter("unitsInStock");
    String condition = multi.getParameter("condition");

    Integer price;

    if(unitPrice.isEmpty()){
        price = 0;
    }else {
        price = Integer.valueOf(unitPrice);
    }

    long stock;

    if(unitsInStock.isEmpty()){
        stock =0;
    }else {
        stock = Long.valueOf(unitsInStock);
    }

    Enumeration files = multi.getFileNames();
    String fname = (String) files.nextElement();
    String fileName = multi.getFilesystemName(fname);

    ProductRepository dao = ProductRepository.getInstance();

    Product newProduct = new Product();
    newProduct.setProductId(productId);
    newProduct.setPname(name);
    newProduct.setUnitPrice(price);
    newProduct.setDescription(description);
    newProduct.setManufacturer(manufacturer);
    newProduct.setCategory(category);
    newProduct.setUnitsInStock(stock);
    newProduct.setCondition(condition);
    newProduct.setFilename(fileName);

    dao.addProduct(newProduct);

    response.sendRedirect("products.jsp");
%>
<%=pageContext.getServletContext().getRealPath("/")%>
