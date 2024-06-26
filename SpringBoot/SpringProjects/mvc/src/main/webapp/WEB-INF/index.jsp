<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Books</title>
</head>
<body>
<h1><c:out value="${title}"></c:out> </h1>
<h2>Description: <c:out value="${desc}"></c:out> </h2>
<h2>Language: <c:out value="${lang}"></c:out> </h2>
<h2>Number of Pages: <c:out value="${pages}"></c:out>  </h2>
</body>
</html>