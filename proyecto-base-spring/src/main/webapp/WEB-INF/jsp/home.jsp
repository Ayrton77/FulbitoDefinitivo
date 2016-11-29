<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="t"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
 -->
 <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
 <title>Pagina de Inicio</title>
</head>
<body>
<div class="container-fluid">
	<div class="col-md-6 col-md-offset-3">
			<h4>Login</h4>
				<form:form modelAttribute="usuario" action="/proyecto-base-spring/home2" method="post">
					<div class="form-group">
						<label for="mail">Email</label>
						<form:input class="form-control" path="mailUsuarioRegistrado"/>
					</div>
					<div class="form-group">
						<label for="Contraseña">Contraseña</label>
						<form:input type="password" class="form-control" path="contraseñaUsuarioLoguiadom"/>
					</div>
					<div class="form-group">
						<input type="submit" class="btn btn-success" value="Ingresar">
					</div>					
				</form:form>
	</div>
	<div class="col-md-6 col-md-offset-3">
	<h4>Registro</h4>
			<a href="/proyecto-base-spring/registro1" class="btn btn-warning">Registrarse</a>
			<br>
			<h4>Buscar Torneo</h4>
			<div class="form-group">
			<form:form modelAttribute="torneo" action="buscarTorneo" method="post">
					<form:input class="form-control" path="nombreTorneo"/>
					<input type="submit" class="btn btn-success" value="Buscar torneo">
				</form:form>
			</div>
			
	</div>
			
	
</div>

</body>
</html>