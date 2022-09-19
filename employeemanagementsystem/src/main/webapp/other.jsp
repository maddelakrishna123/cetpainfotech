<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Other JSP Page</h1>
<jsp:useBean id="e" class="com.cetpa.webapp.beans.Employee" scope="request">


</jsp:useBean>

<jsp:getProperty property="id" name="e"/>

<c:forEach items="${Clist}" var="item">
<h1>hhh</h1>

</c:forEach>

</body>
</html>