<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="j"%>
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
<center>
	<h2>
		<j:out value="Liste des Reservations" />
		
	</h2>
	</center>
	<button ></button>
	
	<table id="TableauReserv">
		<thead>
			<tr>
				<th colspan="9">Liste des reservations</th>
			</tr>
			<tr>
				<!--  <th>ID</th>-->
				<th>ID reservation</th>
				<th>Nom</th>
				<th>Prenom</th>
				<th>Type de reservation</th>
				<th>Numero de chambre</th>
				<th>Type de chambre</th>
				<th>Nb de personnes</th>
				<th>Date de debut</th>
				<th>Date de fin</th>
			</tr>
		</thead>
		<tbody>
		
		
			<j:forEach var="ch" items="${ls}">
				<tr>
				<td><j:out value="${ch.idreservation }"></j:out></td>
				
				<td><j:out value="${ch.nom }"></j:out></td>
				<td><j:out value="${ch.prenom }"></j:out></td>
				<td><j:out value="${ch.typereservation }"></j:out></td>
				<td><j:out value="${ch.numchambre }"></j:out></td>
				<td><j:out value="${ch.typechambre }"></j:out></td>
				<td><j:out value="${ch.nbpers}"></j:out></td>
				<td><j:out value="${ch.date_debut }"></j:out></td>
				<td><j:out value="${ch.date_fin }"></j:out></td>
				
					
					
				</tr>

			</j:forEach>
			
		</tbody>


	</table>




	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>