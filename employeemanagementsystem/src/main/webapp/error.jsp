<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Error</h1>
<jsp:useBean id="e" class="com.cetpa.webapp.beans.Employee" scope="application">


</jsp:useBean>
 <jsp:getProperty property="id" name="e"/>
 
</body>
</html>