<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page isErrorPage="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="/css/style.css">

<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Edit an expense</h2>


	<form:form action="/edit/${travel.id}/editing" method="post" modelAttribute="travel">
	 <input type="hidden" name="_method" value="put">
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
        <form:input type="number" path="amount" />
    </p>
    <p>
        <form:label path="descriptionn">Description</form:label>
        <form:errors path="descriptionn"/>     
        <form:textarea path="descriptionn"/>
    </p> 
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>