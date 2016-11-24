<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListaDeJugadores</title>
</head>
<body>
	Lista de Jugadores
	<br>
	
	<table>
		
			<c:forEach var="list" items="${listaDeJugadores}">
	
				<tr>
					<td>${list.getNombreJugador()}</td>
					<td><a href="/proyecto-base-spring/${idEquipo}/${list.getIdjugador()}/eliminarJugador">Eliminar Jugador</a></td>
					<td><a href="/proyecto-base-spring/${idEquipo}/${list.getIdjugador()}/modificarJugador1">Modificar Jugador</a></td>
				</tr>
	
			</c:forEach>
	
	</table>
	
		<a href="/proyecto-base-spring/${idEquipo}/agregarJugador1">Agregar Jugador</a>
<input type="button" onclick="history.back()" value="volver atras">
	
</body>
</html>