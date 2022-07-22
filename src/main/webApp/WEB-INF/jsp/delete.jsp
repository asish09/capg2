<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="#b1bbe3">
<ul>
    <li><h3><a href="/display">Back</a></h3></li>
</ul>
</body>
</html>

<%@page import="java.sql.*,java.util.*"%>
<%

String id=request.getParameter("id");
try
{
Class.forName("org.postgresql.Driver");
Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample", "postgres", "@Subbu123");
Statement st=conn.createStatement();
int i=st.executeUpdate("DELETE FROM student WHERE id="+id);
out.println("Records deleted successfully !!!");
}

catch(Exception e)
{
System.out.print(e);
e.printStackTrace();
}
%>