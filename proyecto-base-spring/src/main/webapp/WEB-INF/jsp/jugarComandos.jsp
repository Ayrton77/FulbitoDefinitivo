<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">s">
<title>	Comandos de juego</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<h3>${equipo1.getNombreEquipo()} ${partido.getGolesEquipo1()} - ${equipo2.getNombreEquipo()} ${partido.getGolesEquipo2()}</h3>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<h3 class="text-center">${equipo1.getNombreEquipo()}</h3>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores1}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-success" type="submit" value="Agregar Gol Equipo 1">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores1}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-grup">
					<input class="btn btn-danger" type="submit" value="quitar Gol equipo 1">	
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarAmarrilla" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores1}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-warning" type="submit" value="Agregar amarilla">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarAmarrilla" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-group" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores1}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-success" type="submit" value="Quitar amarilla">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarRoja" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores1}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-danger" type="submit" value="agregar roja">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarRoja" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores1}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-success" type="submit" value="Quitar roja">
				</div>
				</form:form>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<h3 class="text-center">${equipo2.getNombreEquipo()}</h3>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarGol" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-success" type="submit" value="Agregar Gol Equipo 2">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-danger" type="submit" value="Quitar Gol equipo 2">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarAmarrilla" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-warning" type="submit" value="Agregar amarilla 2">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarAmarrilla" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-success" type="submit" value="Quitar amarilla 2">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarRoja" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-danger" type="submit" value="Agregar roja 2">
				</div>
				</form:form>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarRoja" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form*group">
					<input class="btn btn-success" type="submit" value="Quitar roja2">
				</div>
				</form:form>
				<div class="form-group">
					<a class="btn btn-danger" href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol">Quitar Gol Equipo2  </a>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6 col-md-offset">
				<a class="btn btn-info" href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/resultado"> Finalizar  </a>
			</div>
		</div>
	</div>
</body>
</html>