<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Railway Reservation Form</title>
</head>
<body>
<h1>Railway Reservation Form</h1>

<f:form action="submitForm" modelAttribute="reservation">
<p>First Name : <f:input path="firstName" /></p>
<p>Last Name : <f:input path="lastName" /></p>
<p>Gender : <f:radiobutton path="gender" value="Male" />Male 
<f:radiobutton path="gender" value="Female" />Female</p>
<p>Meals : <f:checkbox path="food" value="Breakfast" />Breakfast 
<f:checkbox path="food" value="Lunch" />Lunch 
<f:checkbox path="food" value="Dinner" />Dinner</p>
<input type="submit" />
</f:form>
</body>
</html>