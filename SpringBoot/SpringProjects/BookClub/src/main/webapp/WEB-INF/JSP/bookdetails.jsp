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
<title>Insert title here</title>
</head>
<body>
<h1>${thisbook.title}</h1>
<c:if test="${flag}">
    <p>You read ${thisbook.title} by ${thisbook.author}</p>
    <p>Here are your thoughts:</p>
</c:if>
<c:if test="${flag == false}">
    <p>${thisbook.user.userName} read ${thisbook.title} by ${thisbook.author}</p>
    <p>Here are ${thisbook.user.userName}'s thoughts:</p>
</c:if>

<p>${thisbook.thoughts}</p>


<c:if test="${flag}">
<button><a href="/bookpage/${thisbook.id}/edit">Edit</a></button>
<button><a href="/bookpage/${thisbook.id}/delete">Delete</a></button>
</c:if>

</body>
</html>