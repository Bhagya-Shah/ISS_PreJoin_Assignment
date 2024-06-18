<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/script.js"></script>
</head>
<body>
	<%@ include file="navbar.jsp"%>
	<form name="registerForm" action="Register" method="post"
		onsubmit="return validateRegisterForm()">
		<h2>Registration</h2>
		<table>
			<tr>
				<td>User Name</td>
				<td><input type="text" name="uname" required></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input type="password" name="password" required></td>
			</tr>
			<tr>
				<td>Email</td>
				<td><input type="email" name="email" required></td>
			</tr>
			<tr>
				<td>Phone</td>
				<td><input type="text" name="phone" required></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="SUBMIT"></td>
			</tr>
		</table>
	</form>
</body>
</html>
