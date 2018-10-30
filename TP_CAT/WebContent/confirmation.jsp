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
<div class="container col-md-8 col-md-offset-2 col-xs-12">
<div class="panel panel-info">
<div class="panel panel-heading" > <h3>Confirmation</h3></div>
<div class="panel panel-body" ></div>

<div class="form group">
	<label>ID : </label>
	<label>${produit.id}</label>
</div>
	<div class="form group">
<label> DESIGNATION : </label>
	<label>${produit.designation}</label>

<div class="form group">
	<label>PRIX : </label>
	<label>${produit.prix}</label>
</div>	
<div class="form group">	
	<label>QUANTITE : </label>
	<label>${produit.quantite}</label>
</div>
</div>
</div>

</div>
</body>
</html>