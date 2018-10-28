<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fin session</title>
</head>
<body>
<%@include file="vEntete.html" %>
<h3>Au revoir ${requestScope.user }</h3>
<h1>Deconnexion </h1>

<p> vos réservations ont été supprimées </p>

<a href="Controleur"> Se connecter à nouveau</a>
<jsp:include page="vPiedPage.jsp" flush="true" />

</body>
</html>