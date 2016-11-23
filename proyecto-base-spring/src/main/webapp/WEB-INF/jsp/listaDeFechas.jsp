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
	
	<h3>lista de llaves</h3>
	<c:forEach var="list2" items="${listaDeLlaves}">
	<br>
	llave ${list2.getIdLlave()}
	
	
	</c:forEach>
	
	<br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/fecha/${list.getIdFecha()}/agregarLlave1">AgregarLlave</a>

</c:forEach>


</body>
</html>