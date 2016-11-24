<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<title>ListaDeTorneos</title>
</head>
<body>
<div class="container">
	
	<div class="col-md-6 col-md-offset-3">
		<h4>Lista de torneos</h4>
		<table class="table table-striped">
		
			<c:forEach var="list" items="${listaDeTorneos}">
	
				<tr>
					<td>${list.getNombreTorneo()}</td>
					<td><a href="/proyecto-base-spring/Usuario/${idUsuario}/Torneo/${list.getIdTorneo()}/listaDefechas"> fechas</a></td>
					<td><a href="/proyecto-base-spring/Usuario/${idUsuario}/Torneo/${list.getIdTorneo()}/ver"> Ver equipo</a></td>
					<td><a href="/proyecto-base-spring/Usuario/${idUsuario}/Torneo/${list.getIdTorneo()}/eliminarTorneo">Eliminar Torneo</a></td>
					<td><a href="/proyecto-base-spring/Usuario/${idUsuario}/Torneo/${list.getIdTorneo()}/modificarTorneo1">Modificar Torneo</a></td>
				</tr>
	
			</c:forEach>
	
	</table>
	
	<input class="btn-btn-warning" type="button" onclick="history.back()" value="volver atras">
	<a class="btn btn-success" href="/proyecto-base-spring/torneo/${idUsuario}/agregarTorneo1">Agregar Torneo</a>
	</div>
</div>
</body>
</html>