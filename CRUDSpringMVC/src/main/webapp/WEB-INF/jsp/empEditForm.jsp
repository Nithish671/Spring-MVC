<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Edit Employee</title>
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
    width: 50%;
    margin: 0 auto;
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

input[type="text"],
input[type="submit"] {
    padding: 8px;
    width: 100%;
    box-sizing: border-box; /* Makes sure padding is included in the width */
}

input[type="submit"] {
    background-color: #4CAF50;
    color: white;
    border: none;
    cursor: pointer;
}

input[type="submit"]:hover {
    background-color: #45a049;
}

.hidden {
    display: none;
}
</style>
</head>
<body>
<h1>Edit Employee : </h1>

<f:form method="post" action="/CRUDSpringMVC/editSave">
<table>

<tr>
<td></td><td><f:hidden path="id" /></td>
</tr>

<tr>
<th>Name : </th><td><f:input path="name" /></td>
</tr>

<tr>
<th>Salary : </th><td><f:input path="salary" /></td>
</tr>

<tr>
<th>Designation : </th><td><f:input path="designation" /></td>
</tr>

<tr>
<th></th><th><input type="submit" value="Confirm" /></th>
</tr>

</table>
</f:form>
</body>
</html>