<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListaDeFechas</title>
</head>
<body>
<h3>ListaDeFechas</h3>

<br>
<c:forEach var="list" items="${listaDeFechas}">
	<br>
	fecha n: ${list.getIdFecha()}
	
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/fecha/${list.getIdFecha()}/ver">ver fecha</a>
	
	
</c:forEach>
	<br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/agregarFecha">AgregarFecha</a>
<input type="button" onclick="history.back()" value="volver atras">

</body>
</html>