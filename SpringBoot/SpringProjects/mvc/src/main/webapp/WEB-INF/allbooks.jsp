<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
    <th>
        <td>ID</td>
        <td>Title</td>
        <td>language</td>
        <td>pages</td>
    </th>
    <c:forEach var="book" items="${books}">
    <tr>
    <td><c:out value="${book.id}"/></td>
    <td><c:out value="${book.title}"/></td>
    <td><c:out value="${book.language}"/></td>
    <td><c:out value="${book.numberOfPages}"/></td>
    </tr>
    </c:forEach>
</table>
</body>
</html>