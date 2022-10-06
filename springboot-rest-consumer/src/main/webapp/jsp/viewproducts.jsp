<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
          <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<table>

<tr>
<td> Product Id</td>
<td> Product Name</td>
<td> Product Description</td>
<td> Product Price</td>
<td> Product Quantity</td>
</tr>

<c:forEach items="${products}" var="product">
<tr>
<td>${product.pid}</td>
<td> ${product.name}</td>
<td> ${product.description}</td>
<td> ${product.price}</td>
<td> ${product.quantity}</td>
</tr>

</c:forEach>



</table>
</body>
</html>