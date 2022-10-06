<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

.form-group
{
 height: auto;
 width: 400px;
 margin: auto;

}
.form-group input
{
 display: block;

}
.form-group label
{
 color: white;

}
.registration-form
{
margin: auto;
width: 100%;
background-color:gray;
}
.err {
color: red;

}
</style>
</head>
<body>
<h1>Register Page</h1>


<div class="registration-form">
<h3>Registration Page</h3>

<form:form action="register" method="post" modelAttribute="emp">

<div class="form-group">

<label>Id</label>
<input type="number" name="id">

</div>
<div class="form-group">

<label>Full Name</label>
<input type="text" name="name"/>

<form:errors path="name" cssClass="err"></form:errors>
</div>

 <div class="form-group">

<label>User Name</label>
<input type="text" name="username" id="username">
<form:errors path="username" cssClass="err"></form:errors>
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
<form:errors path="salary" cssClass="err"></form:errors>
</div>
<div class="form-group">

<label>Age</label>
<input type="number" name="age">
<form:errors path="age" cssClass="err"></form:errors>
</div>
<div class="form-group">


<input type="submit" value="Register">

</div>
</form:form>

<div>



</div>
</div>


<script type="text/javascript">


function validateData() {
	var username = document.getElementById("username").value;
	//alert(username); should contain only alpanumeric (space) ,8 and maximum 15 
	
	
	var regepression = "^[a-zA-Z0-9 ]{8,15}$";
	
	var regExp = new RegExp(regepression);
	if(!regExp.test(username))
		{
		alert("Invalid Username ")
		return false;
		
		}
	return true;
	
}


</script>
</body>
</html>