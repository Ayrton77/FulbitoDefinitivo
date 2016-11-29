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
<title>ListaDeEquiposEnPartido</title>
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
			<h4 class="text-center">Lista de Equipos en partido</h4>
			<table class="table table-striped">
				<c:forEach var="list" items="${listaDeEquipos}">
					<tr>
						<td>${list.getNombreEquipo()}</td>
					</tr>
				</c:forEach>
			</table>
			<br>
			<a class="btn btn-success" href="/proyecto-base-spring/Torneo/${idTorneo} /partido/${idPartido}/agregarEquipoAPartido1">Agregar Equipo a partido</a>
			<a class="btn btn-primary" href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/jugar">Jugar</a>
			<input class="btn btn-danger" type="button" onclick="history.back()" value="Volver atras">
		</div>
	</div>
</body>
</html>