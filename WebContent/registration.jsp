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
	<form method="post" name="registration" action="add.jsp">
		<div id="container" align="center">
			<input type="text" name="login" placeholder="Enter username"
				pattern="[A-Za-z0-9]{5,}"
				title="Login must be at least 5 characters" required />
			<br /> <br /> <br />
			<input type="password" name="password"
				placeholder="Enter password" pattern="[A-Za-z0-9]{3,}"
				title="Password must be at least 3 characters" required />
			<br /> <br /> <br />
			<input type="text" name="mail"
				placeholder="Enter e-mail" pattern=".+@.+" required />
			<br /> <br /> <br /> <input type="text" name="fullName"
				placeholder="Enter your full name"
				pattern="[A-Z][a-z]{1,10}\s[A-Z][a-z]{1,10}" required />
			<br /> <br /> <br />
			<button type="submit" name="register">Create account</button>
		</div>
	</form>
</body>
</html>