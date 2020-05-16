<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/photoResult.css">
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
		Resultados de la búsqueda de una imagen sobre el autor<span
			id="nombre"> <c:out value="${param.query}" /></span>
	</div>
	<!--<span>Información del autor: <c:out value="${requestScope.information[0].snippet}" /></span>-->
	<c:forEach items="${requestScope.photo}" var="result">
		<div class="resultados">
			<div class="url">Foto: ${result.largeImageURL}</div>
			<div class="foto">
				<img src="${result.largeImageURL}" alt="Imagen del autor"
					height="700" width="500">
			</div>
		</div>
	</c:forEach>

</body>
</html>