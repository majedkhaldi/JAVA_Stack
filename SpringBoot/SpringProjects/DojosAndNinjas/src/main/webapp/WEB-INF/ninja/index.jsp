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
    <title>ninja</title>
    <link rel="stylesheet" href="/css/main.css"> <!-- change to match your file/naming structure -->
    <script type="text/javascript" src="/js/app.js"></script><!-- change to match your file/naming structure -->
</head>
<body>
	<form:form action="/ninja/new" method="post" modelAttribute="ninja">
	<form:label path="dojo">Dojo: </form:label>
    <form:select path="dojo">
        <c:forEach var="one" items="${dojos}">
            <!--- Each option VALUE is the id of the person --->
            <form:option value="${one.id}" path="person">
            <!--- This is what shows to the user as the option --->
                <c:out value="${one.name}"/>
            </form:option>
        </c:forEach>
    </form:select>
    
    <form:label path="fname">First Name: </form:label>
    <form:input path="fname"/>
    
    <form:label path="lname">Last Name: </form:label>
    <form:input path="lname"/>
    
    <form:label path="age">Age: </form:label>
    <form:input type="number" path="age"/>
    
    <form:button>Submit</form:button>
    </form:form>
<!--- ... --->
   
</body>
</html>

