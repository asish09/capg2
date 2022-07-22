<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%

String id = request.getParameter("id");
String driver = "org.postgresql.Driver";
try {
Class.forName(driver);
} catch (ClassNotFoundException e) {
e.printStackTrace();
}
Connection connection = null;
Statement statement = null;
ResultSet resultSet = null;
%>
<%
try{
connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample",
		"postgres","@Subbu123");
statement=connection.createStatement();
String sql ="select * from student where id="+id;
resultSet = statement.executeQuery(sql);
while(resultSet.next()){
%>
<!DOCTYPE html>
<html>
<body bgcolor="#b1bbe3">
<h1 align="center">Update data from the database !!!</h1>

<form style= "text-align: center;" method="post" >
<input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
<input type="text" name="id" value="<%=resultSet.getString("id") %>">
<br>
age:<br>
<input type="text" name="date_of_birth" value="<%=resultSet.getString("date_of_birth") %>">
<br>
email:<br>
<input type="text" name="email" value="<%=resultSet.getString("email") %>">
<br>
phone:<br>
<input type="text" name="phone" value="<%=resultSet.getString("phone") %>">
<br>
address:<br>
<input type="text" name="address" value="<%=resultSet.getString("address") %>">
<br>
<br>
<input type="submit" value="submit">
</form>
<%
}
connection.close();
} catch (Exception e) {
e.printStackTrace();
}
%>
</body>
</html>