<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados de la búsqueda</title>
</head>
<body>
	<fieldset id="resultadosLibro">
	<legend>
		Resultados de la búsqueda del libro con ISBN
		<c:out value="${param.isbn}" />
	</legend>
	<c:forEach items="${requestScope.bookinfo}" var="result">
		<span>Título del libro: <c:out value="${result.title}" /></span>
		<br />
	</c:forEach>
	</fieldset>
</body>
</html>