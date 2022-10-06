<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Management System</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
<div class="container">
<div class="row bg-dark">
<div class="col text-center">
  <h3 class="text-info">Product Management System</h3>
</div>
</div>
<div class="row text-center mt-10 p-5">

<div class="col text-center">
  <h3 class="text-info">Admin Login </h3>
  
    <div>
       <form action="login" method="post">
       
        <table>
          <tr>
        <td>  <label>User Name</label>
          </td>
          <td><input type="text" name="username"></td>
          </tr>
           <tr>
        <td>  <label>Password</label>
          </td>
          <td><input type="password" name="password"></td>
          </tr>
           <tr>
       
          <td colspan="2"><input type="submit" value="Login"></td>
          </tr>
        </table>
       
       
       </form>
    
    
    </div>
</div>
  
</div>
</div>


</body>
</html>