<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link href="<c:url value="/css/bootstrap.min.css" />" rel="stylesheet">

<title>Mensaje de error</title>
</head>
<body>
	<div class="container">
		<div class="col-md-6 col-md-offset-3">
		<div class="alert alert-danger">
	 	 <strong>Error!</strong>${mensajeError}
		</div>
	</div>
	</div>

</body>
</html>