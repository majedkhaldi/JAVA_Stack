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
	<h2>Edit a Burger</h2>


	<form:form action="/edit/${burger.id}/editing" method="post" modelAttribute="burger">
	 <input type="hidden" name="_method" value="put">
		<p>
			<form:label path="bname">Name</form:label>

			<form:input path="bname" />
			<form:errors path="bname" class="errors" />
		</p>
		<p>
			<form:label path="rname">Restaurant Name</form:label>

			<form:input path="rname" />
			<form:errors path="rname" class="errors" />
		</p>
		<p>
			<form:label path="rating">Rating</form:label>
			<form:input type="number" path="rating" />
			<form:errors path="rating" class="errors" />

		</p>
		<p>
			<form:label path="notes">Notes</form:label>

			<form:textarea path="notes" />
			<form:errors path="notes" class="errors" />

		</p>
		<input type="submit" value="Submit" />
	</form:form>

</body>
</html>