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
 <title>Lista de partidos</title>
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
			<h4 class="text-center">Lista de Jugadores</h4>
			<table class="table table-striped">
				<thead>
					<tr>
						<th>Lista de paridos de la fecha ${idFecha}</th>
					</tr>
				</thead>
				<tbody>
					<tr>
						<c:forEach var="list" items="${listaDePartidos}">
						<td>
							<a href="/proyecto-base-spring/Torneo/${idTorneo }/fecha/${idFecha}/partido/${list.getIdPartido()}/listaDeEquipo">Agregar equipo al partido</a>
						</td>
						<td>
							Partido n: ${list.getIdPartido()}
						</td>
						</c:forEach>
					</tr>
				</tbody>
			</table>
			<br>
			<a class="btn btn-success" href="/proyecto-base-spring/Torneo/${idTorneo}/fecha/${idFecha}/agregarPartido">agregar PARTIDO</a>
			<input class="btn btn-danger" type="button" onclick="history.back()" value="Volver atras">
		</div>
	</div>
</body>
</html>