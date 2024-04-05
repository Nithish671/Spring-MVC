<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Regular Expression Validation</title>
<style>
.error {
    color: red;
    font-size: 14px; 
    margin-top: 5px; 
}
input[type="text"], input[type="password"] {
    padding: 5px; 
    margin-bottom: 10px; 
    border: 1px solid #ccc; 
    border-radius: 5px;
}
input[type="submit"] {
    padding: 10px 20px; 
    background-color: #4CAF50; 
    color: white; 
    border: none; 
    border-radius: 5px; 
    cursor: pointer; 
}
input[type="submit"]:hover {
    background-color: #45a049; 
}

section {
    text-align: center;
}


</style>
</head>
<body>

<h1>Sign Up!</h1>


<f:form action="helloAgain" modelAttribute="emp">
<p>UserName : <f:input path="name" placeholder="Enter Username" /></p>
<p>Password : <f:password path="pass" id="passwordInput" placeholder="Enter Password" /><span style="font-size: 14px;"><input type="checkbox" id="showPasswordCheckbox" />Show Password</span>
<br /><f:errors path="pass" cssClass="error" /></p>
<input type="submit" />
</f:form>

<script>
const passwordInput = document.getElementById("passwordInput");
const showPasswordCheckbox = document.getElementById("showPasswordCheckbox");

showPasswordCheckbox.addEventListener("change", function() {
  if (showPasswordCheckbox.checked) {
    passwordInput.type = "text";
  } else {
    passwordInput.type = "password";
  }
});
</script>

</body>
</html>