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
 <title>Fulbito - Perfil</title>
</head>
<body>

<nav class="navbar navbar-default">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Fulbito</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="#">Home</a></li>
      <li><a href="/proyecto-base-spring/usuario/${userActivo.getIdUsuarioLoguiado()}/listaDeTorneos">Ver Mis Torneos</a></li> 
    </ul>
    <ul class="nav navbar-nav navbar-right">
       <li><a href="#">${userActivo.getNombreUsuarioLoguiado()}</a></li>
    </ul>
  </div>
</nav>
<div class="container">
	<div class="col-md-6 col-md-offset-3">
		<form:form modelAttribute="torneo2" action="buscarTorneo" method="post">
		<div class="form-group">
			<label for="Busqueda">Buscar torneo</label>
			<form:input class="form-control" path="nombreTorneo"/>
		</div>
		<div class="form-group">
		<input type="submit" class="btn btn-primary" value="Buscar torneo">
		</div>	
	</form:form>
	</div>
</div>
</body>
</html>