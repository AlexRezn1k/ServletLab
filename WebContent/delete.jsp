<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	<link href="css/bootstrap.css" rel="stylesheet">	
</head>
<body>
	<form method="post" name="Delete" action="deleteAction.jsp">
		<input type="hidden" name="id" value="${param['id']}"/>
		<button type="submit" name="Delete">Confirm delete</button>
	</form>
</body>
</html>