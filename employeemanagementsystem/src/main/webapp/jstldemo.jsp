<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
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

<%

List<String> list = new ArrayList<String>();

list.add("India");
list.add("USA");
list.add("Japan");

out.println(list.get(0));

%>

<c:set var="Clist" value="${list}" scope="session"></c:set>
The size of the list is 
<c:out value="${list.size()}"></c:out>


<c:forEach items="${Clist}" var="item">

<h1>${item}</h1>
</c:forEach>






<a href="employees">Click</a>


<c:forEach items="${list}" var="item">
<h4>${item}</h4>

</c:forEach>




</body>
</html>