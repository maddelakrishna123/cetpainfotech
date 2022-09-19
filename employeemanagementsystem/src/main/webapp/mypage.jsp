<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>This is dummy page</h1>



<jsp:useBean id="e" class="com.cetpa.webapp.beans.Employee" scope="request" >


</jsp:useBean>
<jsp:setProperty property="id" name="e" value="1001"/>
<jsp:setProperty property="name" name="e" value="Kumar"/>

<jsp:getProperty property="name" name="e"/>

<jsp:forward page="other.jsp"></jsp:forward>

</body>
</html>