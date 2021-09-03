<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script src='validTrainee.js'></script>
</head>
<body>
	<form action="/AddTrainee.do" method="post">
		<table>
			<tr>
				<td>Enter Trainee name</td>
				<td><input type="text" name="name" id="name" />
				<td><label id="name"></label></td>
			</tr>
			<tr>
				<td>Enter Branch</td>
				<td><input type="text" name="branch" id="branch" /></td>
				<td><label id="branch"></label></td>
			</tr>
			<tr>
				<td>Enter Percentage</td>
				<td><input type="text" name="percentage" id="percentage" /></td>
				<td><label id="percentage"></label></td>
			</tr>
		</table>
	</form>
</body>
</html>