<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Resultados de la b�squeda</title>
</head>
<body>
	<fieldset id="resultadosLibro">
	<legend>
		Resultados de la b�squeda del libro 
		<c:out value="${param.title}" />
	</legend>
	<c:forEach items="${requestScope.resultados2}" var="result">
		<span>T�tulo del libro: <c:out value="${result.title}" /></span>
		<br />
	</c:forEach>
	</fieldset>
</body>
</html>