<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Produits</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
</head>
<body>
<%@include file="header.jsp"%>
<div class="container col-md-8 col-md-offset-2">
<div class="panel panel-info">
<div class="panel panel-heading" > <h3>Recherche des Produits</h3></div>
<div class="panel panel-body" ></div>
<form action="chercher.do" method="get">
	<label>Mot Clé</label>
<input type="text"  name="motCle" value="${ model.motCle}"/>
<button type="submit" class="btn btn-primary">Chercher</button>
</form>
<table class="table table-striped">
 <tr>
 	<th>ID</th> <th>DESIGNATION</th> <th>PRIX</th> <th>QUANTITE</th>
 </tr>
 
 <c:forEach items="${model.produits }" var="p">
 	<tr>
 		<td>${p.id } </td>
 		<td>${p.designation } </td>
 		<td>${p.prix } </td>
 		<td>${p.quantite } </td>
 		<td> <a href="editer.do?id=${p.id}"> Editer</a> </td>
 		<td> <a onclick="return confirm('etes vous sur de supprimer? ')" href="supprimer.do?id=${p.id}"> Supprimer</a></td>
 	</tr>
  
 </c:forEach>

</table>
</div>
</div>
</body>
</html>