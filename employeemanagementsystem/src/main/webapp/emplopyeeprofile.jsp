<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%! 
int x =90;
int y = 100;
%> <!--  Declarative Elements -->
<h1>Employee Profile</h1>
<!--  scriptlet -->
<%


 String data =(String) request.getAttribute("data");

String[] details = data.split("-");
for(String d:details)
{
	%>
	
	<h1> <%=x+y %></h1>
	<% 
}
%>


</body>
</html>