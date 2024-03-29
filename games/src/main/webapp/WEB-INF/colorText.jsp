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
<body class="mx-auto w-50 bg-dark text-light">

	<section class="text-center">
		<div class="d-flex justify-content-end mt-4">
			<c:if test="${gameSet != null}">
				<a href="/cancel" class="btn btn-secondary">Cancel</a>
			</c:if>
		</div>
		<h1 class="mt-5 mb-3 pt-3 display-2">ColorText</h1>
			
		<div>
			<p>A game that challenges your brain. Match each color correctly before the time runs out!</p>
			<p class="fw-bold">Pick the color block that matches the word spelled below.</p>
			<c:if test="${gameSet == null}">
				<a href="/play" class="btn btn-light text-success">Play!</a>
			</c:if>
		</div>
	</section>
	
	<main class="mt-5">
		<div class="d-flex justify-content-center gap-5">
			<div>
				<p style="color: ${gameSet[0].altColorCode};" class="display-3 fw-bold"><c:out value="${gameSet[0].text}" /></p>
				<c:if test="${order == 'right'}">
					<div class="d-flex gap-4">
						<a href="#" class="btn" style="height: 50px; width: 100px; background-color: ${gameSet[0].altColorCode}"></a>
						<a href="#" class="btn" style="height: 50px; width: 100px; background-color: ${gameSet[0].textColorCode}"></a>
					</div>	
				</c:if>
				<c:if test="${order == 'left'}">
					<div class="d-flex gap-4">
						<a href="#" class="btn" style="height: 50px; width: 100px; background-color: ${gameSet[0].textColorCode}"></a>
						<a href="#" class="btn" style="height: 50px; width: 100px; background-color: ${gameSet[0].altColorCode}"></a>
					</div>	
				</c:if>
			</div>
			<div class="p-3">
				<p class="display-3 text-danger">00:10</p>
			</div>
		</div>
	</main>
	
</body>
</html>