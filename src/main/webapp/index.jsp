<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
</head>
<body>
<h1><%= "Hello World!" %>
</h1>
<br/>
<form action="Usercontroller" method="post">
  <input type="text" name="first_name">
    <input type="text" name="last_name">
    <input type="text" name="user_name">
    <input type="text" name="password">
    <input type="text" name="ville">
    <input type="text" name="centre">
  <input type="submit" value="env">
</form>
</body>
</html>