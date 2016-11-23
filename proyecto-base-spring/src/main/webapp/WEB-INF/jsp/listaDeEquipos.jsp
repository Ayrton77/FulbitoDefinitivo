<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListaDeEquipos</title>
</head>
<body>
	Lista de Equipos
	<br>
	
	<table>
		
			<c:forEach var="list" items="${listaDeEquipos}">
	
				<tr>
					<td>${list.getNombreEquipo()}</td>
					
					<td><a href="/proyecto-base-spring/torneo/${idTorneo}/equipo/${list.getIdEquipo()}/ver"> Ver</a></td>
					<td><a href="/proyecto-base-spring/torneo/${idTorneo}/equipo/${list.getIdEquipo()}/eliminarEquipo">Eliminar Equipo</a></td>
					<td><a href="/proyecto-base-spring/torneo/${idTorneo}/equipo/${list.getIdEquipo()}/modificarEquipo1">Modificar Equipo</a></td>
				</tr>
	
			</c:forEach>
	
	</table>
	
		<a href="/proyecto-base-spring/torneo/${idTorneo}/agregarEquipo1">Agregar Equipo</a>

	
</body>
</html>