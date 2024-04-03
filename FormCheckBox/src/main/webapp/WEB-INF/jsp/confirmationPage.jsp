<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Railway Reservation Form</title>
</head>
<body>
<h2>Your reservation is confirmed successfully.</h2>
<h3>Please, Re-Check the details!</h3>
<h4>First Name : <span>${reservation.firstName}</span></h4>
<h4>Last Name : <span>${reservation.lastName}</span></h4>
<h4>Gender : <span>${reservation.gender}</span></h4>
<h4>Meals : </h4>
<ul>
<c:forEach var="meal" items="${reservation.food}">
<li>${meal}</li>
</c:forEach>
</ul>
</body>
</html>