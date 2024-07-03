<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!-- Formatting (dates) --> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"  %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Home Page</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Home Page</h1>
   <a href="/addproduct">Add a Product</a>
   <a href="/addcategory">Add a Category</a>
   <table>
    <th>
        <td>Products</td>
        <td>Categories</td>
    </th>
    <tr>
        <td><c:forEach var="item" items="${allproducts}">
            <li><a href="/product/${item.id}">${item.name}</a></li>
        </c:forEach>
        </td>
        <td>
            <c:forEach var="item" items="${allcategories}">
            <li><a href="/category/${item.id}">${item.name}</a></li>
        </c:forEach>
        </td>
    </tr>
</table>
   
</body>
</html>

