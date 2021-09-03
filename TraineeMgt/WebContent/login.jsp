<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src='validUser.js'></script>
</head>
<body>
	<form action="/AddUser" method="post">
		<table>
			<tr>
				<td>Enter User name</td>
				<td><input type="text" name="username" id="username" />
				<td><label id="username"></label></td>
			</tr>
			<tr>
				<td>Enter Password</td>
				<td><input type="password" name="password" id="password" /></td>
				<td><label id="password"></label></td>
			</tr>
		</table>
	</form>
</body>
</html>