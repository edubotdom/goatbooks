<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bookFromAShelfResult.css">
<link rel="stylesheet" href="css/cabecera.css">
<title>GoatBooks</title>
</head>
<body>
	<header>
		<div class="imagen_cabecera">
			<a href="/index.html"><img src="images/Goat Books logo.png"></a>

			<h1 id="titulo">GOATBooks</h1>
		</div>
	</header>
	<div class="busqueda">
		Libros del usuario en la librería
		<c:out value="${param.idLibreria}" />
	</div>
	<c:forEach items="${requestScope.books}" var="result">
		<div class="resultados">
			<div id="datos">
				<span id="titulo">Título del libro: <c:out
						value="${result.volumeInfo.title}" /></span> <br />
			</div>


			<form id="busquedaForm" action="GoogleBooksLibDeleteController"
				method="post">
				<input type="hidden" name="idLibro" id="idLibro"
					value="${result.id}" /><br /> <input type="hidden"
					name="idLibreria" id="idLibreria" value="${param.idLibreria}" /> <input
					id="boton" type="submit" name="botonBusqueda" title="buscar"
					value="Remove book from this library">
			</form>

			<form id="busquedaForm" action="GoogleBooksInfoController"
				method="post">
				<input type="hidden" id="idLibro" name="idLibro"
					value="${result.id}" /><br /> <input id="boton2" type="submit"
					name="botonBusqueda" title="informacion" value="Mas informacion">
			</form>
		</div>

	</c:forEach>
</body>
</html>