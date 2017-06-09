<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Authentication page</title>
	<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<form method="post" name="Authentication" action="authenticationServlet">
		<p align=center>
			<label><b>Login</b></label>
			<input type="text" placeholder="Login" name="login" />
			<br /><br />
			<label><b>Password</b></label>
			<input type="password" placeholder="Password" name="password" />
			<br /><br />
			<button type="submit" name="login" class="btn btn-default">LogIn</button>
			<br />
		</p>
	</form>
	
	
</body>
</html>