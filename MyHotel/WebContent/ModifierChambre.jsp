<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Connection"%>
<%@page import="dz.myhotel.bdd.ConnectBdMyHotel"%>
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
	<%String id=request.getParameter("id");
	System.out.println(id);
	String numetage=request.getParameter("numetage");
	String typechambre=request.getParameter("typechambre");
	String nbpers=request.getParameter("nbpers");
	String prix=request.getParameter("prixchambre");
	%>
		<form action="TraiteModificationChambre" method="post">
			<h2>Modifier chambre</h2>
			<table>
				<tr>
					<td>Numero chambre: </td>
					<td><input type="text" name="numerochambre" value="<%=id%>"></td>
				</tr>
				<tr>
					<td>Numero etage: </td>
					<td><input type="text" name="numeroetage" value="<%=numetage%>"></td>
				</tr>
				<br>
				<tr>
					<td>Type chambre</td>
					<td><select name="typechambre">
					<option><%=typechambre%></option>
					<option>Double</option>
					<option>Simple</option>
					<option>Suit</option>
					<option>Luxe</option>
					
					</select></td>
				</tr>
				<br>
				<tr>
					<td>Nombre de personnes:  </td>
					<td><input type="text" name="nbpersonnes" value="<%=nbpers%>"></td>
				</tr>
				<tr>
					<td>Prix par nuit:  </td>
					<td><input type="text" name="prixchambre" value="<%=prix%>"></td>
				</tr>
	<tr> <td></td></tr>
			</table>
			<br>
			<br>
			<button id="edit" class="btn btn-lg btn-primary btn-block" type="submit" >
				Modifier</button>
		

		</form>

<%

    %>

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

