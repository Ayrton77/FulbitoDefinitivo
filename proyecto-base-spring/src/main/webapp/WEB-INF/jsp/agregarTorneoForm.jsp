<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Agregar Torneo Formulario</title>
</head>
<body>
	<h3>Agregar Torneo formulario</h3>
	<br>
	<form:form action="/proyecto-base-spring/usuario/${idUsuario}/agregarTorneo2" modelAttribute="torneo" method="post">
		
		nombre
		<form:input path="nombreTorneo"/>
		
		<input type="submit" value="agregar torneo">
	</form:form>
</body>
</html>