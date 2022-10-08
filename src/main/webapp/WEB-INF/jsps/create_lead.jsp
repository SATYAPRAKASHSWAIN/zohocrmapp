<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ include file="menu.jsp" %>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create</title>
</head>
<body>
	<h2>Create | Lead</h2>
	<form action="saveLead" method="post">
	<pre>
	First Name <input type="text" name="firstName" />
		Last Name <input type="text" name="lastName" />
		Email <input type="email" name="email" />
		Mobile <input type="number" name="mobile" />
		Source  :
		<select name="source" >
			  <option value="new paper">News Paper</option>
			  <option value="tv commercial">Tv Commercial</option>
			  <option value="online">Online</option>
			  <option value="Seminar">Seminar</option>
			  <input type="submit" value="save"/>  
          </select>
	</pre>
		

	</form>

</body>
</html>