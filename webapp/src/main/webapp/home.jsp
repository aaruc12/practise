<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <form action="addstud">
    <input type="text" name="sid"><br>
    <input type="text" name="sname"><br>
    <input type="text" name="sdesc"><br>
    <input type="submit">
    </form>
     <form action="find">
    <input type="text" name="sid"><br>
    
    <input type="submit">
    </form>
     <form action="delete">
    <input type="text" name="sid"><br>
    
    <input type="submit">
    </form>
</body>
</html>