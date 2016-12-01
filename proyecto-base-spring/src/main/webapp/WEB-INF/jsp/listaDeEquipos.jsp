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
<title>Lista De Equipos</title>
</head>
<body>
<div class="container">
	<div class="col-md-6 col-md-offset-3">
			<table class=" table table-striped">
				<thead>
					<tr>
						<th>Lista de equipos</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach var="list" items="${listaDeEquipos}">
					<tr>
						<td>${list.getNombreEquipo()}</td>
						<td><a class="btn btn-primary" href="/proyecto-base-spring/torneo/${idTorneo}/equipo/${list.getIdEquipo()}/ver"> Ver</a></td>
						<td><a class="btn btn-primary" href="/proyecto-base-spring/torneo/${idTorneo}/equipo/${list.getIdEquipo()}/eliminarEquipo">Eliminar Equipo</a></td>
						<td><a class="btn btn-primary" href="/proyecto-base-spring/torneo/${idTorneo}/equipo/${list.getIdEquipo()}/modificarEquipo1">Modificar Equipo</a></td>
					</tr>
					</c:forEach>
				</tbody>
			</table>
			<br>
			<div class="form-group">
				<a class="btn btn-success" href="/proyecto-base-spring/torneo/${idTorneo}/agregarEquipo1">Agregar Equipo</a>
			</div>
			<div class="form-group">
				<input type="button" class="btn btn-danger" onclick="history.back()" value="Volver atras">
			</div>
	</div>
	
</div>
</body>
</html>