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
 <title>Registro</title>
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
			<h4>Registro</h4>
			<form:form modelAttribute="usuario" action="/proyecto-base-spring/registro2" method="post">
				<div class="form-group">			
					<label for="Nombre">Nombre</label>
					<form:input class="form-control" path="nombreUsuarioLoguiado"/>
				</div>
				<div class="form-group">
					<label for="Mail">Email</label>
					<form:input class="form-control" path="mailUsuarioRegistrado"/>
				</div>
				<div class="form-group">
					<label for="Contra">Contraseņa</label>
					<form:input type="password" class="form-control" path="contraseņaUsuarioLoguiadom"/>
				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-success" value="Registro">
				</div>
				</form:form>
			<input type="button" class="btn btn-warning" onclick="history.back()" value="Volver atras">
			</div>
			
		</div>
	
</body>
</html>