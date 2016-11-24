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
<title>	Jugar lista de jugadores</title>
</head>
<body>
<div class="container">
	<div class="col-md-6 col-md-offset-3">
		Jugadores e1:
	<table class="table table-striped">
		
			<c:forEach var="list" items="${listaJugadoresEquipo1}">
	
				<tr>
					<td>${list.getNombreJugador()}</td>
				</tr>
	
			</c:forEach>
	
	</table>
	Jugadores e2:
	<table class="table table-striped">
		
			<c:forEach var="list2" items="${listaJugadoresEquipo2}">
	
				<tr>
					<td>${list2.getNombreJugador()}</td>
				</tr>
	
			</c:forEach>
	
	</table>
	</div>
<a class="btn btn-succes" href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/jugar2">Jugar</a>
<input type="button" class="btn btn-warning" onclick="history.back()" value="Volver atras">
</div>
</body>
</html>