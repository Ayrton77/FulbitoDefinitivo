<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>	comandos de juego</title>
</head>
<body>
	
	
	${equipo1.getNombreEquipo()} - ${equipo2.getNombreEquipo()}
	<br>
	${partido.getGolesEquipo1()} - ${partido.getGolesEquipo2()}
	<br><br>
	equipo1
	<br><br>
	<!-- 	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol">Agregar Gol Equipo1  </a>
	 -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol" modelAttribute="jugador" method="post" >
		
		
		
		<form:select path="Idjugador">
			
			<c:forEach var="list" items="${listaDeJugadores1}">
				
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
			
			</c:forEach>
			
		</form:select>
		
		<input type="submit" value="agregar Gol Equipo 1">
	</form:form>
	<br><br>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores1}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="quitar Gol equipo 1">
	</form:form>
	<br>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarAmarrilla" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores1}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="agregarAmarilla">
	</form:form>
	<br><br>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarAmarrilla" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores1}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="quitarAmarrilla">
	</form:form>
	<br>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarRoja" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores1}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="agregar roja">
	</form:form>
	<br><br>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarRoja" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores1}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
			
		
		</form:select>
		<input type="submit" value="quitar roja">
	</form:form>
	<br>
	
	
	
	<br><br>
	equipo2
	<br><br>
	<br><br>
	<!-- 	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol">Agregar Gol Equipo1  </a>
	 -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarGol" modelAttribute="jugador" method="post" >
		
		
		
		<form:select path="Idjugador">
			
			<c:forEach var="list" items="${listaDeJugadores2}">
				
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
			
			</c:forEach>
			
		</form:select>
		
		<input type="submit" value="agregar Gol Equipo 2">
	</form:form>
	
	<br><br>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores2}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="quitar Gol equipo 2">
	</form:form>
	<br>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarAmarrilla" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores2}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="agregarAmarilla 2">
	</form:form>
	<br><br>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarAmarrilla" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores2}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="quitarAmarrilla 2">
	</form:form>
	<br>
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarRoja" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores2}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
		
		</form:select>
		<input type="submit" value="agregar roja 2">
	</form:form>
	<br><br>
	<!-- <a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a> -->
	<form:form action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarRoja" modelAttribute="jugador" method="post" >
		
		<form:select path="Idjugador">
			<c:forEach var="list" items="${listaDeJugadores2}">
	
				<form:option value="${list.getIdjugador()}">${list.getNombreJugador()}</form:option>
				
					
				
	
			</c:forEach>
			
		
		</form:select>
		<input type="submit" value="quitar roja2">
	</form:form>
	<br>
	
	
	
	<br><br>

	
	<!--<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarGol">Agregar Gol Equipo2  </a>
	 -->
	
	
	
	<br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol">Quitar Gol Equipo2  </a>
	<br>
	
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/resultado"> Finalizar  </a>
	
</body>
</html>