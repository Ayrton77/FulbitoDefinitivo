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
<title>	Comandos de juego</title>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<h3>${equipo1.getNombreEquipo()}<small>${partido.getGolesEquipo1()}</small></h3> <h3>${equipo2.getNombreEquipo()}<small>${partido.getGolesEquipo2()}</small></h3>
			</div>
		</div>
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<!-- Equipo 1 -->
	<!-- 	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol">Agregar Gol Equipo1  </a>
	 -->		<h4 class="text-center">Agregar gol a ${equipo1.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol" modelAttribute="jugador" method="post" >
					<div class="form-group">
						<form:select class="form-control" path="Idjugador">
							<c:forEach var="list" items="${listaDeJugadores1}">
								<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input class="btn btn-success" type="submit" value="agregar Gol Equipo 1">
					</div>
				</form:form>
				<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
				<h4 class="text-center">Quitar gol a ${equipo1.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol" modelAttribute="jugador" method="post" >
					<div class="form-group">
						<form:select class="form-control" path="Idjugador">
							<c:forEach var="list" items="${listaDeJugadores1}">
								<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-danger" value="Quitar Gol equipo 1">
					</div>
				</form:form>
				<h4 class="text-center">Agregar amarilla a ${equipo1.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarAmarrilla" modelAttribute="jugador" method="post" >
					<div class="form-group">
						<form:select class="form-control" path="Idjugador">
							<c:forEach var="list" items="${listaDeJugadores1}">
								<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-warning" value="Agregar amarilla">
					</div>
				</form:form>
				<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
				<h4 class="text-center">Quitar amarilla a ${equipo1.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarAmarrilla" modelAttribute="jugador" method="post" >
					<div class="form-group">
						<form:select class="form-control" path="Idjugador">
							<c:forEach var="list" items="${listaDeJugadores1}">
								<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Quitar amarilla">
					</div>
				</form:form>
				<h4 class="text-center">Agregar roja a ${equipo1.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarRoja" modelAttribute="jugador" method="post" >
					<div class="form-group">
						<form:select class="form-control" path="Idjugador">
							<c:forEach var="list" items="${listaDeJugadores1}">
								<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-danger" value="Agregar roja">
					</div>
				</form:form>
				<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
				<h4 class="text-center">Quitar roja a ${equipo1.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarRoja" modelAttribute="jugador" method="post" >
					<div class="form-group">
						<form:select class="form-control" path="Idjugador">
							<c:forEach var="list" items="${listaDeJugadores1}">
									<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
							</c:forEach>
						</form:select>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Quitar roja">
					</div>
				</form:form>
			</div>
			
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
	<!-- 	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol">Agregar Gol Equipo1  </a>
	 -->		<h4 class="text-center">Agregar gol a ${equipo2.getNombreEquipo()}</h4>
				<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarGol" modelAttribute="jugador" method="post" >
				<div class="form-group">
					<form:select class="form-control" path="Idjugador">
						<c:forEach var="list" items="${listaDeJugadores2}">
							<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
						</c:forEach>
					</form:select>
				</div>
				<div class="form-group">
					<input class="btn btn-success" type="submit" value="Agregar gol equipo 2">
				</div>
				</form:form>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<h4 class="text-center">Quitar gol a ${equipo2.getNombreEquipo()}</h4>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol" modelAttribute="jugador" method="post" >
		<div class="form-group">
			<form:select class="form-control" path="Idjugador">
				<c:forEach var="list" items="${listaDeJugadores2}">
					<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-danger" value="Quitar gol equipo 2">
		</div>
	</form:form>
	<h4 class="text-center">Agregar amarilla a ${equipo2.getNombreEquipo()}</h4>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarAmarrilla" modelAttribute="jugador" method="post" >
		<div class="form-group">
			<form:select class="form-control" path="Idjugador">
				<c:forEach var="list" items="${listaDeJugadores2}">
					<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-warning" value="Agregar amarilla">
		</div>
	</form:form>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<h4 class="text-center">Quitar amarilla a ${equipo2.getNombreEquipo()}</h4>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarAmarrilla" modelAttribute="jugador" method="post" >
		<div class="form-group">
			<form:select class="form-control" path="Idjugador">
				<c:forEach var="list" items="${listaDeJugadores2}">
					<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-success" value="Quitar segunda amarilla">
		</div>
	</form:form>
	<h4 class="text-center">Agregar roja a ${equipo2.getNombreEquipo()}</h4>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarRoja" modelAttribute="jugador" method="post" >
		<div class="form-group">
			<form:select class="form-control" path="Idjugador">
				<c:forEach var="list" items="${listaDeJugadores2}">
					<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-danger" value="Agregar roja 2">
		</div>
	</form:form>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<h4 class="text-center">Quitar roja a ${equipo2.getNombreEquipo()}</h4>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarRoja" modelAttribute="jugador" method="post" >
		<div class="form-group">
			<form:select path="Idjugador">
				<c:forEach var="list" items="${listaDeJugadores2}">
					<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				</c:forEach>
			</form:select>
		</div>
		<div class="form-group">
			<input type="submit" class="btn btn-success" value="Quitar roja2">
		</div>
	</form:form>
	<!--<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarGol">Agregar Gol Equipo2  </a>
	 -->
	</div>
		</div>
	
	<div class="row">
		<div class="col-md-6 col-md-offset-3">
			<a class="btn btn-primary" href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol">Quitar Gol Equipo2  </a>
			<a class="btn btn-info" href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/resultado"> Finalizar  </a>
		</div>
	</div>
</div>
</body>
</html>