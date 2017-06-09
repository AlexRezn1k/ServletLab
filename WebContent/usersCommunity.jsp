<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ page import="ua.nure.reznik.Lab2.UserManager"%>
<%@ page import="ua.nure.reznik.Lab2.User"%>
<%@ page import="ua.nure.reznik.Lab2.Role"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>Insert title here</title>
	<link href="css/bootstrap.css" rel="stylesheet">	
</head>
<body>
	<%@include file="head.jsp"%>
	<table class="table">
		<tr>
			<c:if test="${currentUser.role == 'ADMIN'}">
				<th width="150">Login</th>
			</c:if>
			<th width="150">Full Name</th>
			<th width="150">Email</th>
			<th width="100">Role</th>
			<th width="100">Edit</th>
			<th width="100">Delete</th>
		<tr>
		<c:forEach var="user" items="${users}">
			<tr>
				<c:if test="${currentUser.role == 'ADMIN'}">
					<td>${user.key}</td>
				</c:if>
				<td>${user.value.fullName}</td>
				<td>${user.value.email}</td>
				<td>${user.value.role}</td>
				<td>
					<c:if test="${currentUser.role == 'ADMIN'}">
						<c:url value="/edit.jsp" var="editURL">
							<c:param name="id" value="${user.key}" />
						</c:url>
						<a href="${editURL}">Edit</a>						
					</c:if>
				</td>
				<td>
					<c:if test="${currentUser.role == 'ADMIN' || user.key == currentUser.login}">
						<c:url value="/delete.jsp" var="deleteURL">
							<c:param name="id" value="${user.key}" />
						</c:url>
						<a href="${deleteURL}">Delete</a>						
					</c:if>					
				</td>				
			</c:forEach>
	</table>

	<c:if test="${currentUser.role == 'ADMIN'}">
		<p align="left">
			<a href="registration.jsp">Add new user</a>
		</p>
	</c:if>

</body>
</html>