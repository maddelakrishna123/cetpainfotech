<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Employee Profile</h1>
<!--  scriptlet -->


<table>
<tr>

<td>Id</td>
<td>${emp.id}</td>

</tr>
<tr>

<td>Name</td>
<td>${emp.name}</td>

</tr>
<tr>

<td>Email</td>
<td>${emp.email}</td>

</tr>
<tr>

<td>Username</td>
<td>${emp.username}</td>

</tr>
<tr>

<td>Salary</td>
<td>${emp.salary}</td>

</tr>
<tr>

<td>Mobile</td>
<td>${emp.mobile}</td>

</tr>

</table>

</body>
</html>