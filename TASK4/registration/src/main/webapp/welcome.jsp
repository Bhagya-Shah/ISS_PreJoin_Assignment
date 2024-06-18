<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="jakarta.servlet.http.HttpSession"%>
<%
session = request.getSession(false);
if (session == null || session.getAttribute("uname") == null) {
	response.sendRedirect("login.jsp");
	return;
}
String uname = (String) session.getAttribute("uname");
%>
<!DOCTYPE html>
<html>
<head>
<title>Welcome</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>

	<div>
		<h2>
			Welcome,
			<%=uname%>!
		</h2>
		<form action="Logout" method="get">
			<input type="submit" value="Logout">
		</form>
	</div>
</body>
</html>
