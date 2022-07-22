<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page import="java.sql.*" %> 
<%@ page import="java.io.*" %> 
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%
String id = request.getParameter("id");
String driver = "org.postgresql.Driver";
String connectionUrl = "jdbc:postgresql://localhost:5432/";
String database = "sample";
String userid = "postgres";
String password = "@Subbu123";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<html>
<body bgcolor="#b1bbe3">
<h1 align ="center">Patient Details !!!</h1>
<ul>
    <li><h3><a href="/welcome">Log Out !</a></h3></li>
</ul>
<table align="center" cellpadding="5" cellspacing="5" border="1">
<tr bgcolor="#e3664f">
<td>id</td>
<td>student_name</td>
<td>date_of_birth</td>
<td>father_name</td>
<td>mother_name</td>
<td>CheckedStatus</td>
<td>Option to check</td>


</tr>

<%
try{
connection = DriverManager.getConnection(connectionUrl+database, userid, password);
statement=connection.createStatement();
String sql ="select * from student order by id";
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<tr bgcolor="#bceb4d">
<td><%=resultSet.getString("id") %></td>
<td><%=resultSet.getString("student_name") %></td>
<td><%=resultSet.getString("date_of_birth") %></td>
<td><%=resultSet.getString("father_name") %></td>
<td><%=resultSet.getString("mother_name") %></td>
<td><%=resultSet.getString("select") %></td>
<td>
<a href="selectingstudent?id=<%=resultSet.getString("id")%>">SelectedOrNOt</a>
</td>
</tr>

<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</table>
</body>
</html>
