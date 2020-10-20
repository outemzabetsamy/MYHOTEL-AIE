<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.*,dz.myhotel.bdd.ConnectBdMyHotel"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">


<html lang="en">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<title>Bootstrap 101 Template</title>
<!--<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>-->
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
		<form action="TraiteAjoutReservation" method="post">
			<h2>Ajouter une reservation</h2>
			<table>
				<tr>
					<td>Nom client: </td>
					<td><input type="text" name="nomclient"></td>
				</tr>
				<tr>
					<td>Prenom client: </td>
					<td><input type="text" name="prenomclient"></td>
				</tr>
				<br>
				<tr>
					<td>Type chambre</td>
					<td><select name="typechambre" id="typechambre" >
					<option>Double</option>
					<option>simple</option>
					<option>Suit</option>
					<option>Luxe</option>
					
					</select></td>
					
				</tr>
				<br>
				<tr>
					<td>Nombre de personnes:  </td>
					<td><input type="text" name="nbpersonnes"></td>
				</tr>
				<br>
				<tr>
					<td>Date debut:  </td>
					<td><input type="text" name="datedebut"></td>
				</tr>
				<br>
				
				<tr>
					<td>Date fin:  </td>
					<td><input type="text" name="datefin"></td>
				</tr>
				<br>
				
				<tr>
					<td>Numero chambre  </td>
					<td><select name="numerochambre1" id="numerochambre1">
					<option value="-1"> Choisir numero chambre</option>
					
				 	

					
					
					
					</select></td>
				</tr>
				<br>
				<tr>
					<td>Type de reservation  </td>
					<td><select name="typereservation">
					<option>Option</option>
					<option>Confirmé</option>
					
					
					</select></td>
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
<script type="text/javascript">
            
		 $(document).ready(function() {
		        $("#typechambre").on("change", function() {
		            var type = $("#typechambre").val();
		            console.log("dayiiiiiiiiiiiiiiiii");
		            if (type === "")
		            {
		                
		            }
		            else
		            {
		               
		                $.ajax({
		                    url: "fetch1.jsp",
		                    data: {type: type},
		                    method: "POST",
		                    success: function(data)
		                    {
		                        $("#numerochambre1").html(data);
		                        
		                    }
		                });
		            }
		        });
		    });
		</script>