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
<body class="m-5">

	<section>
		<h1 class="pt-3">Instructions</h1>
		<p><c:out value="${instructions}"/></p>
		<a href="/play" class="btn btn-primary">Play!</a>
		<a href="/cancel" class="btn btn-secondary">Cancel</a>
	</section>
	
	<main class="mt-5">
		<c:forEach var="colorText" items="${gameSet}">
			<p><c:out value="${colorText.text} & ${colorText.colorCode}" /></p>
			<p style="color: ${colorText.colorCode};" class="display-3 fw-bold"><c:out value="${colorText.text}" /></p>
			</br>
		</c:forEach>
	</main>
	
</body>
</html>