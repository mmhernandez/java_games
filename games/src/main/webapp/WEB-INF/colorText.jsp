<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>ColorText</title>
	<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
</head>
<body class="m-5">

	<section>
		<h1 class="pt-3">ColorText</h1>
		<p><c:out value="${instructions}"/></p>
		<c:if test="${gameSet == null}">
			<a href="/play" class="btn btn-outline-primary">Play!</a>
		</c:if>
		<c:if test="${gameSet != null}">
			<a href="/cancel" class="btn btn-secondary">Cancel</a>
		</c:if>
	</section>
	
	<main class="mt-5">

		<p style="color: ${gameSet[0].altColorCode};" class="display-3 fw-bold"><c:out value="${gameSet[0].text}" /></p>
		<c:if test="${order == 'right'}">
			<div class="d-flex gap-1">
				<a href="#" class="btn" style="height: 50px; width: 50px; background-color: ${gameSet[0].altColorCode}"></a>
				<a href="#" class="btn" style="height: 50px; width: 50px; background-color: ${gameSet[0].textColorCode}"></a>
			</div>	
		</c:if>
		<c:if test="${order == 'left'}">
			<div class="d-flex gap-1">
				<a href="#" class="btn" style="height: 50px; width: 50px; background-color: ${gameSet[0].textColorCode}"></a>
				<a href="#" class="btn" style="height: 50px; width: 50px; background-color: ${gameSet[0].altColorCode}"></a>
			</div>	
		</c:if>
		
	</main>
	
</body>
</html>