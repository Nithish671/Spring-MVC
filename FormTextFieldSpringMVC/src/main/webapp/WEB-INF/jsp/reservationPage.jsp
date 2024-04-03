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
<h2>Railway Reservation Form</h2>

<f:form action="submitForm" modelAttribute="reservation">
<p>First Name : <f:input type="text" path="firstName" /></p>
<p>Last Name : <f:input path="lastName" /></p>
<p><input type="submit"></p>
</f:form>
</body>
</html>