<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
<title>Lista de jugadores</title>
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
			<h4 class="text-center">Lista de Jugadores</h4>
			<br>
			<table class="table table-striped">
				<tr>
				<c:forEach var="list" items="${listaDeJugadores}">
					<td>${list.getNombreJugador()}</td>
					<td><a href="/proyecto-base-spring/${idEquipo}/${list.getIdjugador()}/eliminarJugador">Eliminar Jugador</a></td>
					<td><a href="/proyecto-base-spring/${idEquipo}/${list.getIdjugador()}/modificarJugador1">Modificar Jugador</a></td>
				</c:forEach>
				</tr>
			</table>
			<br>
			<a class="btn btn-success" href="/proyecto-base-spring/${idEquipo}/agregarJugador1">Agregar Jugador</a>
			<input class="btn btn-danger" type="button" onclick="history.back()" value="Volver atras">
		</div>
	</div>
</body>
</html>