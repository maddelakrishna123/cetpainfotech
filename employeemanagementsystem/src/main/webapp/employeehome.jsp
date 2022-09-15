<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<link href="../style.css" rel="stylesheet" type="text/css">

<title>Employee Home Page</title>

</head>
<body>


<%
String username = request.getParameter("username");
%>
<div class="header" style="text-align: right;">
Welcome , <%=username %> , <a href='logout'>Logout</a>
</div>
<div>
<a href="profile">ViewProfile</a>
</div>

</body>
</html>

<!-- 

Date d = new Date();
 -->