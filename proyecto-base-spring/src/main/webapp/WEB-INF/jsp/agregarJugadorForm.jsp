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
<title>Agregar Jugador Formulario</title>
</head>
<body>
<div class="container">
	<div class="col-md-6 col-md-offset-3">
		<h3>Agregar Jugador formulario</h3>
		<form:form action="/proyecto-base-spring/torneo/${idTorneo}/${idEquipo}/agregarJugador2" modelAttribute="jugador" method="post">
		<div class="form-group">
			<label for="Nombre">Nombre del jugador</label>
			<form:input class="form-control" path="nombreJugador"/>
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-success"  value="AgregarJugador">
		</div>
		</form:form>
		<input type="button" class="btn btn-warning" onclick="history.back()" value="Volver atras">
	</div>
</div>
</body>
</html>