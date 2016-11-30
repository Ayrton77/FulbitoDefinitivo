<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">
<title>ListaDeJugadores</title>
</head>
<body>
	<div class="container">
		<div class="col-md-3 col-md-offset-3">
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Lista de Jugadores</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${listaDeJugadores}">
						<tr>
							<td>${list.getNombreJugador()}</td>
							<td><a class="btn btn-primary" href="/proyecto-base-spring/torneo/${idTorneo}/${idEquipo}/${list.getIdjugador()}/eliminarJugador">Eliminar Jugador</a></td>
							<td><a class="btn btn-primary" href="/proyecto-base-spring/torneo/${idTorneo}/${idEquipo}/${list.getIdjugador()}/modificarJugador1">Modificar Jugador</a></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
			<div class="form-group">
				<a class="btn btn-success" href="/proyecto-base-spring/torneo/${idTorneo}/${idEquipo}/agregarJugador1">Agregar Jugador</a>	
			</div>
			<div class="form-group">
				<input class="btn btn-danger" type="button" onclick="history.back()" value="volver atras">
			</div>
		</div>
	</div>
</body>
</html>