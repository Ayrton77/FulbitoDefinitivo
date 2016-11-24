<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>	jugar lista de jugadores</title>
</head>
<body>
	jugar lista de jugadores
	<br>
	Jugadores e1:
	<table>
		
			<c:forEach var="list" items="${listaJugadoresEquipo1}">
	
				<tr>
					<td>${list.getNombreJugador()}</td>
				</tr>
	
			</c:forEach>
	
	</table>
	Jugadores e2:
	<table>
		
			<c:forEach var="list2" items="${listaJugadoresEquipo2}">
	
				<tr>
					<td>${list2.getNombreJugador()}</td>
				</tr>
	
			</c:forEach>
	
	</table>
		<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/jugar2">Jugar</a>
<input type="button" onclick="history.back()" value="volver atras">
	
</body>
</html>