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
<h1>Add a Book</h1>
<a href="/books">back to the shelves</a>

	<form:form action="/thisbook/edit/${book.id}" methpd="post" modelAttribute="book">
	<input type="hidden" name="_method" value="put">
	
		<form:label path="title">Title:</form:label>
		<form:errors path="title"/>
		<form:input path="title"/>
		
		<form:label path="author">Author:</form:label>
		<form:errors path="author"/>
		<form:input path="author"/>
		
		<form:label path="thoughts">My Thoughts:</form:label>
		<form:errors path="thoughts"/>
		<form:input path="thoughts"/>
		
		<input type="submit" value="Add a Book">
	</form:form>
</body>
</html>