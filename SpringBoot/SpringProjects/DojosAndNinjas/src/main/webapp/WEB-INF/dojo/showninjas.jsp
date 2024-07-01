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
    <title>dojo's ninjas</title>
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
		<h1><c:out value="${thisdojo.name}"></c:out>Ninjas</h1>
<table>
    <th>
        <td>First Name</td>
        <td>Last Name</td>
        <td>Age</td>
    </th>
    <c:forEach var="item" items="${thisdojo.ninja}">
    <tr>
        <td><c:out value="${item.fname}"></c:out></td>
        <td><c:out value="${item.lname}"></c:out></td>
        <td><c:out value="${item.age}"></c:out></td>
    </tr>
</c:forEach>
</body>
</html>