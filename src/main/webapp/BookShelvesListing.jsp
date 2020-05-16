<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bookShelvesListing.css">
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

	<div class="busqueda">Librerías del usuario</div>

	<c:forEach items="${requestScope.bookshelves}" var="result">
		<div class="resultados">
			<div id="datos">
				<span id="titulo">Título de la librería: <c:out
						value="${result.title}" /></span> <span>; ID de la librería: <c:out
						value="${result.id}" /></span> <br />
			</div>
			<div id="busquedaDiv">
				<form id="busquedaForm" action="GoogleBooksLibListController"
					method="post">
					<input type="hidden" name="idLibreria" id="idLibreria"
						value="${result.id}" /> <input id="boton" type="submit"
						name="botonBusqueda" title="Consulte los libros de esta libreria."
						value="Consulte los libros de esta libreria.">
				</form>
			</div>
		</div>
	</c:forEach>

</body>
</html>