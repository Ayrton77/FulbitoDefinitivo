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
<title>Agregar equipo al partido</title>
</head>
<body>
	<div class="container">
		<form:form modelAttribute="partido" action="/proyecto-base-spring/Torneo/${idTorneo}/partido/${idPartido}/agregarEquipoAPartido2" method="GET">
		<div class="row">
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<div class="form-group">
					<form:select class="form-control" path="idEquipo1">
						<c:forEach var="list" items="${listaDeEquiposSelect}">
							<form:option value="${list.getIdEquipo()}">${list.getNombreEquipo()}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
			<div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
				<div class="form-group">
					<form:select class="form-control" path="idEquipo2">
						<c:forEach var="list" items="${listaDeEquiposSelect}">
							<form:option value="${list.getIdEquipo()}">${list.getNombreEquipo()}</form:option>
						</c:forEach>
					</form:select>
				</div>
			</div>
	</div>
		<div class="row">
			<div class="col-md-6 col-md-offset-3">
				<input class="btn btn-success" type="submit" value="Agregar Equipos a partido">
				<input class="btn btn-danger" type="button" onclick="history.back()" value="Volver atras">
			</div>
		</div>
	</form:form>	
	</div>
</body>
</html>