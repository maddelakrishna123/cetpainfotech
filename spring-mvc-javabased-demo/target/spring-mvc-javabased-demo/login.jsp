<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/myurl/css/style.css" />" rel="stylesheet">
</head>
<body>
<h1>${AppTitle}</h1>
<h1>${message}</h1>
<div class="reg-form">
<form action="login" method="post">

<table>

<tr>
<td>User Name</td>
<td><input type="text" name="username"></td> 
</tr>

<tr>
<td>Password</td>
<td><input type="password" name="password"></td> 
</tr>
<tr>

<td colspan="2"><input type="submit" value="Login"></td> 
</tr>
</table>

</form>
New Employee ?<a href="register"> Register Here</a>

<a href="../" class="btn">Home</a>
</div>
</body>
</html>