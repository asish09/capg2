<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE unspecified PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<body bgcolor="#b1bbe3">
<ul>
    <li><h3><a href="/displayD">Display Updates</a></h3></li>
</ul>
</body>
</html>
<%@ page import="java.sql.*" %>

<%! String driverName = "org.postgresql.Driver";%>

<%

String id = request.getParameter("id");                                        
String select=request.getParameter("select");											

if(id != null)
{
Connection con = null;
PreparedStatement ps = null ;

try
{
Class.forName(driverName);
con = DriverManager.getConnection("jdbc:postgresql://localhost:5432/sample",
		"postgres","@Subbu123");
String sql="Update student set select=? where id="+id;
ps = con.prepareStatement(sql);

ps.setString(1, select);
int i = ps.executeUpdate();
if(i > 0)
{
out.print("Records Updated Successfully");
}
else
{
out.print("There is a problem in updating Record.");
} 
}
catch(Exception sql)
{
request.setAttribute("error", sql);
out.println(sql);
}
}

%>