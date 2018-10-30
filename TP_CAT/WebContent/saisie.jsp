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
<div class="panel panel-heading" > <h3>Saisie de Produit</h3></div>
<div class="panel panel-body" ></div>
<form action="saveProduit.do" method="post">
	
<div class="form-group">
	<label class="control-label"> Désignation</label>
	<input type="text" name="designation" class="form-control" value="${produit.designation }" required="required"/>
	<span></span>
	<label class="control-label"> Prix</label>
	<input type="text" name="prix" class="form-control" value="${produit.prix }"required="required"/>
	<span></span>
	<label class="control-label"> Quantité</label>
	<input type="text" name="quantite" class="form-control" value="${produit.quantite }"required="required"/>
	<span></span>
</div>
	<div>
			<button type="submit" class="btn btn-secondary"> Enregister </button>
	</div>



</form>

</div>
</div>
</body>
</html>