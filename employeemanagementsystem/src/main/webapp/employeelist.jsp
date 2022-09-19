<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
 
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <link rel="stylesheet" type="text/css" href="<c:url value = "style.css" />" /> 
</head>

<body>
<table>
<tr>

<td>Id</td>
<td>Name</td>
<td>Email</td>
<td>Mobile</td>
<td>Salary</td>
<td>UserName</td>
</tr>
<c:forEach items="${empList}" var="emp">
<tr>

<td>${emp.id}</td>
<td>${emp.name}</td>
<td>${emp.email}</td>
<td>${emp.mobile}</td>
<td>${emp.salary}</td>
<td>${emp.username}</td>
</tr>

</c:forEach>

</table>

</body>
</html>