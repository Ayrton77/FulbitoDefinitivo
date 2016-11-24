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
<h3>lista de paridos de la fecha ${idFecha}</h3>

<br>
<c:forEach var="list" items="${listaDePartidos}">
	<br>
	Partido n: 
	${list.getIdPartido()}
	<a href="/proyecto-base-spring/Torneo/${idTorneo }/fecha/${idFecha}/partido/${list.getIdPartido()}/listaDeEquipo">agregar equipo al partido</a>
	
	
	
</c:forEach>
	<br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/fecha/${idFecha}/agregarPartido">agregar PARTIDO</a>
<input type="button" onclick="history.back()" value="volver atras">
</body>
</html>