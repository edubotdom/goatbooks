<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="css/bookInfo.css">
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
		Resultados de la búsqueda de información según el ID de Google Books
		<c:out value="${param.idLibro}" />
	</div>
	<div class="resultados">

		<div id="datos" class="titulo">
			Título del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.title}" />
		</div>

		<div id="portada">
			<img src="${requestScope.bookInfo.volumeInfo.imageLinks.thumbnail}"
				alt="Imagen de portada" height="244" width="168">
		</div>
		<br />
		<div id="datos">
			Autores del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.authors}" />
		</div>
		<br />
		<div id="datos">
			Publicadores del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.publisher}" />
		</div>
		<br />
		<div id="datos">
			Fecha de publicación del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.publishedDate}" />
		</div>
		<br />
		<div id="datos">
			Descripción del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.description}" />
		</div>
		<br />
		<div id="datos">
			Páginas del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.pageCount}" />
		</div>
		<br />
		<div id="datos">
			Páginas del libro impresas:
			<c:out value="${requestScope.bookInfo.volumeInfo.printedPageCount}" />
		</div>
		<br />
		<div id="datos">
			Categorías del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.printType}" />
		</div>
		<br />
		<div id="datos">
			Valoración del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.averageRating}" />
		</div>
		<br />
		<div id="datos">
			Número de valoraciones del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.ratingsCount}" />
		</div>
		<br />
		<div id="datos">
			Edad recomendada para leer el libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.maturityRating}" />
		</div>

		<br />
		<div id="datos">
			Idioma del libro:
			<c:out value="${requestScope.bookInfo.volumeInfo.language}" />
		</div>
		<br />
		<div id="busquedaDiv">
			<form id="busquedaForm" accept-charset=utf-8
				action="WikipediaAuthorInformationController" method="post">
				<input type="hidden" id="author" name="author"
					value="${requestScope.bookInfo.volumeInfo.authors[0]}" /><br /> <input
					id="boton" type="submit" name="botonBusqueda" title="informacion"
					value="Mas informacion sobre el autor principal">
			</form>
		</div>
		<br />
		<div id="busquedaFoto">
			<form id="busquedaFoto" action="PixabayPhotoController" method="post">
				<input type="hidden" name="query" id="query"
					value="${requestScope.bookInfo.volumeInfo.authors[0]}" /><br /> <input
					id="boton" type="submit" name="botonBusqueda" title="buscar"
					value="Imagen del autor principal">
			</form>
		</div>

		<br />

		<div id="addBook">
			<form id="busquedaForm" action="GoogleBooksLibAddController"
				method="post">
				<input type="hidden" name="idLibro" id="idLibro"
					value="${requestScope.bookInfo.id}" /><br /> ID de la librería
				donde se desea añadir: <input type="text" name="idLibreria" required />
				<input id="boton" type="submit" name="botonBusqueda" title="buscar"
					value="Add Book">
			</form>
		</div>
	</div>
</body>
</html>