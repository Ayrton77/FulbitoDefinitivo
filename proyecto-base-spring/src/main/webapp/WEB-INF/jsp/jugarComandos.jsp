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
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/agregarGol">Agregar Gol Equipo1  </a>
	<br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/agregarGol">Agregar Gol Equipo2  </a>
	<br><br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/1/quitarGol">Quitar Gol Equipo1  </a>
	<br>
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/equipo/2/quitarGol">Quitar Gol Equipo2  </a>
	<br>
	
	<a href="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/${idEquipo1}/${idEquipo2}/resultado"> Finalizar  </a>
	
</body>
</html>