<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<meta http-equiv="Content-Type" content="text/html">
<link rel="stylesheet" href="css/searchResults.css">
<link rel="stylesheet" href="css/cabecera.css">
<title>Resultados de la búsqueda</title>
</head>
<body>
	<header>
		<div class="imagen_cabecera">
			<a href="/index.html"><img src="images/Goat Books logo.png"></a>

			<h1 id="titulo">GOATBooks</h1>
		</div>
	</header>
	<div class="resultadosLibro">
		Resultados de la búsqueda del libro
		<c:out value="${param.title}" />
	</div>

	<c:forEach items="${requestScope.search}" var="result">
		<div class="resultados">
			<div class="titulo">
				Título del libro:
				<c:out value="${result.volumeInfo.title}" />
			</div>
			<br />
			<div class="id">
				ID del libro:
				<c:out value="${result.id}" />
			</div>

			<div id="busquedaDiv">
				<form id="busquedaForm" action="GoogleBooksInfoController"
					method="post">
					<input type="hidden" id="idLibro" name="idLibro"
						value="${result.id}" /><br /> <input id="boton" type="submit"
						name="botonBusqueda" title="informacion" value="Mas informacion">
				</form>
			</div>
		</div>
		<br />
	</c:forEach>
</body>
</html>