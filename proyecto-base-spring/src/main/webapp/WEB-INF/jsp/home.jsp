<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<h3>home</h3>
<br>
<h4>Login</h4>
	<form:form modelAttribute="usuario" action="/proyecto-base-spring/home2" method="post">
		User mail
		<form:input path="mailUsuarioRegistrado"/>
		user Contra
		<form:input path="contraseñaUsuarioLoguiadom"/>
		<input type="submit" value="Ingresar">
	</form:form>
<br>
<h4>Registro</h4>
<a href="/proyecto-base-spring/registro1">Registrarse</a>
<br>
<h4>Buscar Torneo</h4>
<form:form modelAttribute="torneo" action="buscarTorneo" method="post">
		<form:input path="nombreTorneo"/>
		<input type="submit" value="Buscar torneo">
	</form:form>
</body>
</html>