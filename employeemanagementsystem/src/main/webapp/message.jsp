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

<h1>Status</h1>
<c:if test="${status=='yes'}">
<h3 style="color: green;">Employee Details stored successfully</h3>
</c:if>
<c:if test="${status=='no'}">
<h3 style="color: red">Employee Details not stored</h3>
</c:if>
</body>
</html>