<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/AuthorInformation.css">
<link rel="stylesheet" href="css/cabecera.css">
<title>GOATBooks</title>
</head>
<body>
	<header>
		<div class="imagen_cabecera">
			<a href="/index.html"><img src="images/Goat Books logo.png"></a>

			<h1 id="titulo">GOATBooks</h1>
		</div>
	</header>
	<div class="busqueda">
		Resultados de la búsqueda de información sobre el autor <span
			id="nombre"> <c:out value="${param.author}" /></span>
	</div>
	<!--<span>Información del autor: <c:out value="${requestScope.information[0].snippet}" /></span>-->
	<div class="resultados">Información del autor:
		${requestScope.information[0].snippet}</div>
</body>
</html>