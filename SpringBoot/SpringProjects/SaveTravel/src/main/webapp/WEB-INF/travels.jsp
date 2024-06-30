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
    <title>expenses</title>
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
</head>
<body>
   <h1>Expense Tracker</h1>
   
   <table>
    <th>
        <td>Expense</td>
        <td>Vendor</td>
        <td>Amount</td>
        <td>Action</td>
        <td></td>
        
        
    </th>
    <c:forEach var="expense" items="${travels}">
	    <tr>
	        <td><c:out value="${expense.name}"></c:out></td>
	        <td><c:out value="${expense.vendor}"></c:out></td>
	        <td><c:out value="${expense.amount}"></c:out></td>
	        <td><a href="/edit/${expense.id}">Edit</a></td>
	        <td><form action="/delete/${expense.id}" method="post">
			    <input type="hidden" name="_method" value="delete">
			    <input type="submit" value="Delete">
				</form>
	        </td>
	    </tr>
	</c:forEach>

</table>
   
   <h1>Add an Expense</h1>
<form:form action="/addtravel" method="post" modelAttribute="travel">
    <p>
        <form:label path="name">Expense Name</form:label>
        <form:errors path="name"/>
        <form:input path="name"/>
    </p>
    <p>
        <form:label path="vendor">Vendor</form:label>
        <form:errors path="vendor"/>
        <form:input path="vendor"/>
    </p>
    <p>
        <form:label path="amount">Amount</form:label>
        <form:errors path="amount"/>
        <form:input type="number" path="amount"/>
    </p>
    <p>
        <form:label path="descriptionn">Description</form:label>
        <form:errors path="descriptionn"/>     
        <form:textarea path="descriptionn"/>
    </p>    
    <input type="submit" value="Submit"/>
</form:form>    
</body>
</html>

