<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@taglib uri="/exemples" prefix="ex" %>
<<jsp:useBean id="adherent" class="mesBeans.Adherent" scope="request"></jsp:useBean>
<html>
<head>

<meta charset="ISO-8859-1">
<title>bonjour.jsp</title>

</head>
<body>
<P><BR>Contenu HTML statique<BR></P> <P><B>Utilisation de
 l'action getProperty pour récupérer le nom et le prénom
:</B><BR>

<jsp:getProperty name="adherent" property="prenom"/>
 <jsp:getProperty name="adherent" property="nom"/>
 
 </P> 
 
 <P><B>Récupération des valeurs par scriptlet dans les attributs de balise 
 :</B> <ex:Bonjour prenom="<%=adherent.getPrenom()%>" 
 nom="<%=adherent.getNom()%>"> 
 <BR><B>Ceci est le contenu de la balise</B>
  blablablablablabla 
 <B>Fin du contenu de la balise</B><BR>
  </ex:Bonjour> </P>
 
</body>
</html>