<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Editing page</title>
	<link href="css/bootstrap.css" rel="stylesheet">
</head>
<body>
	<form method="post" name="Edit" action="edit.jsp">
		<input type="hidden" name="id" value="${param['id']}" />
		<input type="password" name="password"
			placeholder="${userForEdit.getPassword()}" pattern="[A-Za-z0-9]{3,}"
			title="Password must be at least 3 characters" required>
			<br /><br /><br />
		<input type="text" name="fullName"
			placeholder="${userForEdit.getFullName()}" required>
			<br /> <br /> <br />
		<input type="text" name="eMail"
			placeholder="${userForEdit.getEmail()}" pattern=".+*@.+*"
			title="Email must have @ symbol" required>
		<button type="submit" name="Edit">Save changes</button>
	</form>
</body>
</html>