<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados de la b�squeda de informaci�n seg�n ISBN</title>
</head>
<body>
	<fieldset id="resultadosLibro">
	<legend>
		Resultados de la b�squeda de informaci�n seg�n el ISBN  
		<c:out value="${param.isbn}" />
	</legend>
		<span>T�tulo del libro: <c:out value="${requestScope.bookinfo.additionalProperties}" /></span>
		<br />
	</fieldset>
</body>
</html>