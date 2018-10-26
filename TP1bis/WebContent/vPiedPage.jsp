<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"
    import= "java.util.Date, java.text.DateFormat" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
<hr>
<br>
Mise à Jour le 

<%= DateFormat.getDateInstance(DateFormat.FULL).format(new Date()) %>
biblio
</body>
</html>