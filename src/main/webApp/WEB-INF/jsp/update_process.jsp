<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Records Updated</title>
</head>
<body bgcolor="#b1bbe3">

<ul>
    <li><h3><a href="/display">Display Updates</a></h3></li>
</ul>

</body>
</html>
<%@ page import="java.sql.*" %>

<%! String driverName = "org.postgresql.Driver";%>
<%!String url = "jdbc:postgresql://localhost:5432/sample";%>
<%!String user = "postgres";%>
<%!String psw = "@Subbu123";%>
<%
String id = request.getParameter("id");
String age = request.getParameter("date_of_birth");
String email=request.getParameter("email");	
String phone=request.getParameter("phone");
String address=request.getParameter("address");

if(id != null)
{
Connection con = null;
PreparedStatement ps = null ;

try
{
Class.forName(driverName);
con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample",
		"postgres","@Subbu123");
String sql="Update student set date_of_birth=?,email=?,phone=?,address=? where id="+id;
ps = con.prepareStatement(sql);
/* ps.setString(1,id); */
ps.setString(1, age);
ps.setString(2, email);
ps.setString(3, phone);
ps.setString(4, address);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Records Updated Successfully !!!");
}
else
{
out.print("There is a problem in updating Record !!!");
} 
}

catch(Exception sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}

%>
