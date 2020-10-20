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

<!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
<!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-3"></div>
			<div class="col-md-6">
				<div class="text-center">
					<br> <br> <br>
					<div>
						<img alt="" src="images/user.png">
					</div>
					<br> <br> <br>
					<div class="jumbotron">
						<div class="container">

							<form class="form-signin" action="TraiteLoginMyHotel"
								method="post">
								<h2 class="form-signin-heading">veuillez vous authentifier</h2>
								<label for="inputEmail" class="sr-only">Nom
									d'utilisateur</label> <input type="text" name="username"
									class="form-control" placeholder="Nom d'utilisateur" required
									autofocus> <label for="inputPassword" class="sr-only">Mot
									de passe</label> <input type="password" name="pwd" class="form-control"
									placeholder="Mot de passe" required>
								<div class="checkbox">
									<label> <input type="checkbox" value="remember-me">
										Retenir le mot de passe
									</label>
								</div>
								<button class="btn btn-lg btn-primary btn-block" type="submit">Se
									connecter</button>
							</form>
							<b style="color: red;"> <%
 	String msg = (String) request.getAttribute("msg");
 	if (msg != null)
 		out.println(msg);
 %>
							</b>
						</div>
						<!-- /container -->


						<!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
						<script src="../../assets/js/ie10-viewport-bug-workaround.js"></script>

					</div>
				</div>
			</div>
			<div class="col-md-3"></div>

		</div>


	</div>

	<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
	<!-- Include all compiled plugins (below), or include individual files as needed -->
	<script src="assets/js/bootstrap.min.js"></script>
</body>
</html>