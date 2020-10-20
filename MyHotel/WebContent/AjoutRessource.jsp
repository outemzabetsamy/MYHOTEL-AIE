<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>

<!-- Bootstrap -->
<link href="assets/css/bootstrap.min.css" rel="stylesheet">
<link href="assets/css/extable.css" rel="stylesheet">
<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<br><br>
<center>
<div class="col-md-2"></div>
<div class="col-md-8">
	<div class="jumbotron">
		<form action="TraiteAjoutRessource" method="post">
			<h2>Ajout ressource</h2>
			<table>
				<tr>
					<td>Nom ressource: </td>
					<td><input type="text" name="nom"></td>
				</tr>
				<tr>
					<td>Type Ressource: </td>
					<td><input type="text" name="type"></td>
				</tr>
				<br>
				
			
				<tr>
					<td>Tarif ressource  </td>
					<td><input type="text" name="tarif"></td>
				</tr>
				
	<tr> <td></td></tr>
			</table>
			<br>
			<br>
			<button class="btn btn-lg btn-primary btn-block" type="submit">
				Ajouter</button>
		

		</form>
	<%String msg=(String) request.getAttribute("msg");
	%> 
	<%=msg %>
	</div>
	</div>
	<div class="col-md-2"></div>
</center>
	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>