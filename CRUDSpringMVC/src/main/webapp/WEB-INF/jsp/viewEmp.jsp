<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Employee List</title>

<style>
body {
    font-family: Arial, sans-serif;
    margin: 0;
    padding: 0;
}

h1 {
    text-align: center;
}

table {
    width: 80%;
    margin: 20px auto;
    border-collapse: collapse;
}

table th,
table td {
    padding: 8px;
    border: 1px solid #ddd;
    text-align: left;
}

table th {
    background-color: #f2f2f2;
}

a {
    text-decoration: none;
    color: #007bff;
}

a:hover {
    text-decoration: underline;
}

h2 {
    text-align: center;
    margin-top: 20px;
}

.hidden {
    display: none;
}
</style>

</head>
<body>
<h1>Employee List : </h1>

<table>

<tr>
<th>Id</th><th>Name</th><th>Salary</th><th>Designation</th><th>Edit</th><th>Delete</th>
</tr>

<c:forEach var="e" items="${list}">

<tr>

<td>${e.getId()}</td>
<td>${e.getName()}</td>
<td>${e.getSalary()}</td>
<td>${e.getDesignation()}</td>
<td><a href="editEmp/${e.getId()}">Edit</a></td>
<td><a href="deleteEmp/${e.getId()}">Delete</a></td>

</tr>

</c:forEach>

</table>

<h2><a href="empForm">Add Employees</a></h2>

</body>
</html>