<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Erreur </title>
</head>
<body>
<%@include file="vEntete.html" %>

<h1> Erreur</h1>
<h4>une erreur est survenue durant le traitement de votre demande :
<%= HttpUtils.getRequestURL(request) %>
</h4>

<b>info sur l'erreur </b>

<%-- <%
if (Exception !=null) {
out.println("message de l'erreur" + Exception.getMessage());
PrintWriter outstream = new PrintWriter(out);
exception.printStackTrace(outstream); 
}
%>
 --%>

<jsp:include page="vPiedPage.jsp" flush="true"/>
</body>
</html>