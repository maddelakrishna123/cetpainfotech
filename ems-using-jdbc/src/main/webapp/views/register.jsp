<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Register Page</h1>


<div class="registration-form">
<h3>Registration Page</h3>

<form action="register" method="post">

<div class="form-group">

<label>Id</label>
<input type="number" name="id">

</div>
<div class="form-group">

<label>Full Name</label>
<input type="text" name="name">

</div>

 <div class="form-group">

<label>User Name</label>
<input type="text" name="username">

</div> 
<div class="form-group">

<label>Password</label>
<input type="password" name="password">

</div>

<div class="form-group">

<label>Email</label>
<input type="email" name="email">

</div>

<div class="form-group">

<label>Mobile</label>
<input type="number" name="mobile">

</div>

<div class="form-group">

<label>Salary</label>
<input type="number" name="salary">

</div>
<div class="form-group">

<label>Age</label>
<input type="number" name="age">

</div>
<div class="form-group">


<input type="submit" value="Register">

</div>
</form>

<div>



</div>
</div>
</body>
</html>