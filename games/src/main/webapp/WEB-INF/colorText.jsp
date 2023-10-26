<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Color Text</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body>

	<h1>Instructions</h1>
	<p><c:out value="${instructions}"/></p>
	<a href="/play" class="btn btn-primary">Play!</a>
	
	<c:forEach var="colorText" items="${gameSet}">
		<c:out value="${colorText.text}"/>
	</c:forEach>
	
</body>
</html>