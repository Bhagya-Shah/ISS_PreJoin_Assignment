<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/script.js"></script>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<form action="Login" method="post"
		onsubmit="return validateLoginForm()">
		<h2>Login</h2>
		<label for="uname">User name:</label> <input type="text" id="uname"
			name="uname" required><br> <br> <label
			for="password">Password:</label> <input type="password" id="password"
			name="password" required><br> <br> <input
			type="submit" value="Login">
	</form>
</body>
</html>
