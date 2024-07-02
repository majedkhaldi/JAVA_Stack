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
    <title>Welcome</title>
    <link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script src="/webjars/bootstrap/js/bootstrap.min.js"></script>
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Welcome ${loggedUser.userName}</h1>
   <a href="/logout">Log Out</a>
   <p>Books from everyone's shelves</p>
   <a href="/addbookpage">Add to my shelf</a>
   
   
   <table>
    <th>
        <td>id</td>
        <td>Title</td>
        <td>Author Name</td>
        <td>Posted by</td>
    </th>
    <c:forEach var="item" items="${books}">
    <tr>
        <td><c:out value="${item.id}"></c:out></td>
        <td><a href="/bookpage/${item.id}"><c:out value="${item.title}"></a></c:out></td>
        <td><c:out value="${item.author}"></c:out></td>
        <td><c:out value="${item.user.userName}"></c:out></td>
    </tr>
</c:forEach>

</table>
</body>
</html>

