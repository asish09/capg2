<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%-- <%@ tag lib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Input Details</title>
</head>
<body bgcolor="#b1bbe3">
<h1 align="center">Registration Page !!!</h1>
<font color = "red">${errorMessage}</font>
	<form style= "text-align: center;" method="post" >
		<h3>Patient_Name     : <input type = "text" name="student_name"/><br><br><br></h3>
		<h3>Age 	         : <input type = "text" name ="date_of_birth"><br><br><br></h3>
		<h3>Email	         : <input type = "text" name ="email"><br><br><br></h3>
		<h3>Phone	         : <input type = "text" name ="phone"><br><br><br></h3>
		<h3>Health_Issue     : <input type = "text" name ="father_name"><br><br><br></h3>
		<h3>Appointment_Date : <input type = "text" name ="mother_name"><br><br><br></h3>
		<h3>Address          : <input type = "text" name ="address"><br><br><br></h3>
		
		<input type="submit"/>
	</form>
</body>
</html>