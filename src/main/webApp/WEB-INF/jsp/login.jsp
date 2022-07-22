<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Login</title>
</head>
<body bgcolor="#b1bbe3">
<h1 align="center"><font><strong>Enter your User ID and Password !!!</strong></font></h1>

<h3><font color = "red">${errorMessage}</font></h3>
	<form style = "text-align: center;" method="post">
		<h2>Name     : <input type="text" name="userid"/><br><br><br></h2>
		<h2>Password : <input type="password" name="password"><br><br><br></h2>
		<input type="submit"/>
	</form>
</body>
</html>