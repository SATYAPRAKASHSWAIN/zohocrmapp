<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ include file="menu.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List</title>
</head>
<body>
	<a href="viewLeadPage">create new lead</a>
	<h2>List All Leads</h2>
	<table>
		<tr>
			<th>FirstName</th>
			<th>LastName</th>
			<th>Source</th>
			<th>Email</th>
			<th>mobile</th>

		</tr>


		<c:forEach var="lead" items="${leads}">
			<tr>
				<td><a href="findLeadById?id=${lead.id}"> ${lead.firstName}</a>
				</td>
				<td>${lead.lastName}</td>
				<td>${lead.source}</td>
				<td>${lead.email}</td>
				<td>${lead.mobile}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>