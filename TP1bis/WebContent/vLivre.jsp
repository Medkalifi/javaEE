	<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    		pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.ArrayList" %>
    <%@ page import="mesBeans.Client" %>
    <%@ page import="mesBeans.Livre" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Livre</title>
<jsp:useBean id="user" class="mesBeans.Client" scope="session"></jsp:useBean>
</head>
<body>
 <h3> Bonjour <jsp:getProperty property="user" name="user" /></h3>
		<h1>Ouvrage demandé</h1>
		<form method='post' action='Controleur?page=2'> 
		<p> Quel est son titre ? </p> 
		<input name=titre type=text size=25/> 
		<p> Quelle est sa catégorie ? </p> 
		<select name='categorie'> 
		 <option>Thriller</option>
		 <option>Roman</option> 
		  <option>Bande dessin&eacute;e</option>
		<option>Histoire</option>
		</select>
		<input type=submit name=Valider/> 
		</form>
		<p> vos réservations: </p>
		<% 
		  for (Livre livre :user.getLivres()){
			  out.println("<p>" +livre.toString()+ "</p>");
			  
		  }
		%>
		
		<a href="Controleur?page=3">Se deconnecter</a>
</body>
</html>