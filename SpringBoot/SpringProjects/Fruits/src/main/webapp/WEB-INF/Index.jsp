<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<table>
    <th>
        <td>name</td>
        <td>price</td>
    </th>
    <c:forEach var="fruit" items="${allfruits}">
<%--     <c:choose>
    	<c:when test="${fruit.name.charAt(0) >= 'G'}">
		 <tr>
        <td style = "color = orange;"><c:out value="${fruit.name}"></c:out></td>
        <td><c:out value="${fruit.price}"></c:out></td>
    </tr>
	</c:when>
	<c:otherwise> --%>
		 <tr>
        <td><c:out value="${fruit.name}"></c:out></td>
        <td><c:out value="${fruit.price}"></c:out></td>
    </tr>
<%-- 	</c:otherwise>
    </c:choose> --%>
   
</c:forEach>

</table>
</body>
</html>


