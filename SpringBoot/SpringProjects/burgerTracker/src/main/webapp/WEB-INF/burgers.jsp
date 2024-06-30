<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!-- c:out ; c:forEach etc. --> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- form:form -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!-- for rendering errors on PUT routes -->
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>burgers</title>
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Burger Tracker</h1>
   
   <table>
    <th>
        <td>Burger Name</td>
        <td>Restaurant Name</td>
        <td>Rating (out of 5)</td>
        <td>Action</td>
        
    </th>
    <c:forEach var="burger" items="${burgers}">
	    <tr>
	        <td><c:out value="${burger.bname}"></c:out></td>
	        <td><c:out value="${burger.rname}"></c:out></td>
	        <td><c:out value="${burger.rating}"></c:out></td>
	        <td><a href="/edit/${burger.id}">Edit</a></td>
	    </tr>
	</c:forEach>

</table>
   
   <h1>Add a Burger</h1>
<form:form action="/addburger" method="post" modelAttribute="burger">
    <p>
        <form:label path="bname">Burger Name</form:label>
        <form:errors path="bname"/>
        <form:input path="bname"/>
    </p>
    <p>
        <form:label path="rname">Restaurant Name</form:label>
        <form:errors path="rname"/>
        <form:input path="rname"/>
    </p>
    <p>
        <form:label path="rating">Rating</form:label>
        <form:errors path="rating"/>
        <form:input type="number" path="rating"/>
    </p>
    <p>
        <form:label path="notes">Notes</form:label>
        <form:errors path="notes"/>     
        <form:textarea path="notes"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>

