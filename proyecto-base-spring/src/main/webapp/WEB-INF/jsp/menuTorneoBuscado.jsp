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
<title>Menu torneo</title>
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
			<h4 class="text-center">Torneo: ${nombreTorneo}</h4>
			<div class="form-group">
				<a class="btn btn-success" href="/proyecto-base-spring/torneoBuscado/${list.getNombreTorneo()}/${list.getIdTorneo()}/menu">Ver Progreso Torneo</a>
			</div>
			<div class="form-group">
				<a class="btn btn-danger" href="/proyecto-base-spring/torneoBuscado/${list.getNombreTorneo()}/${list.getIdTorneo()}/menu">Volver</a>
			</div>
			<td><a href="/proyecto-base-spring/Torneo/${idTorneo }/tablaDeGoleadores">Tabla De Goleadores</a></td>
			
		</div>
	</div>
</body>
</html>