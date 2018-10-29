<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>essai1.jsp</title>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
</head>
<body>
<form action="http://localhost:8080/tp6JSTL/CtrlEssais" method="get" >

<br/><br/><br/> 
<h2> Bonjour <c:out value="${requestScope.client}" /> </h2>
<c:if test="${requestScope.client.nom == 'Madame' }">
<br/><br/><br/>
quel est votre nom de jeune fille: 
<input type="text" name="nomJF"/>
<br/><br/><br/>
<input type="submit"/>
</c:if>

</form>


<%=2*9 %>

<% for (int i=0; i<3; i++){
	out.print("i vaut :"+i);
}
%>

<%
String chemin = request.getContextPath();
String locale= request.getLocalAddr();

out.println(chemin);
out.println(locale);

%>


</body>
</html>