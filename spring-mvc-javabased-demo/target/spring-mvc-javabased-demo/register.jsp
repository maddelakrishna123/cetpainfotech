<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/myurl/css/style.css" />" rel="stylesheet">

</head>
<body>
<div class="reg-form">
<h1>Register Page</h1>
<h3 style="color:green;">${message}</h3>
<form:form action="register" method="post" modelAttribute="emp">

<table>
<tr>
<td>Fullname Name</td>
<td><form:input path="ename"/></td> 
</tr>

<tr>
<td>User Name</td>
<td><form:input path="username"/></td> 
</tr>

<tr>
<td>Password</td>
<td><form:password path="password"/></td> 
</tr>

<tr>
<td>Email</td>
<td><form:input path="email"/></td> 
</tr>
<tr>
<td>Mobile</td>
<td><form:input path="mobile"/></td> 
</tr>
<tr>
<td>Salary</td>
<td><form:input path="salary"/>
<form:errors path="ename"></form:errors>
</td> 
</tr>


<tr>

<td colspan="2"><input type="submit" value="register"></td> 
</tr>
</table>

</form:form>
Existing Employee ?<a href="login"> Login Here</a>

<a href="../" class="btn">Home</a>
</div>
</body>
</html>