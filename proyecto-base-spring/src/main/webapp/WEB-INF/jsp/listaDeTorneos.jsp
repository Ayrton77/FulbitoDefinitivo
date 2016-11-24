<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ListaDeTorneos</title>
</head>
<body>
	Lista de Torneos
	<br>
	
	<table>
		
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
	
		<a href="/proyecto-base-spring/torneo/${idUsuario}/agregarTorneo1">Agregar Torneo</a>

	<input type="button" onclick="history.back()" value="volver atras">
</body>
</html>