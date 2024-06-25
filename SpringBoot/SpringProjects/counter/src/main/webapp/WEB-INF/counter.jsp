<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>counter</title>
	<link rel="stylesheet" type="text/css" href="/css/style.css">
	<script type="text/javascript" src="/js/app.js"></script>
</head>
<body>
<p> you have visited localhost8080  <c:out value="${count}"/> times.</p>


<p><a href="/">Test another visit???</a></p>
<p><a href="/two">Add "2" to your counter???</a></p>

<a href="/reset"><button>reset</button></a>

</body>
</html>