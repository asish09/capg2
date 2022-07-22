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
<body bgcolor = "#b1bbe3">
<h1 align="center">Updating whether a patient is attended or not !!!</h1>

<form style= "text-align: center;" method="post">
<input type="hidden" name="id" value="<%=resultSet.getString("id") %>">
<input type="text" name="id" value="<%=resultSet.getString("id") %>">
<br>
checked:<br>
<input type="text" name="selected" value="<%=resultSet.getString("select") %>">
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