<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Enregistrement</title>
</head>
<body>
<%@page language="java" errorPage="erreur.jsp" %>
<%@include file ="vEntete.html" %>
		 <h1>Enregistrement</h1>
		<form method='post' action='Controleur?page=1'>
		<p> Quel est votre nom ? </p>
		<input name=nom type=text size=25/>
		<p> Votre mot de passe ? </p>
		<input name=mdp type=password size=25/>
		<input type=submit name='Valider'/>
		</form>
		
	<jsp:include page="vPiedPage.jsp" flush="true"></jsp:include>
</body>
</html>