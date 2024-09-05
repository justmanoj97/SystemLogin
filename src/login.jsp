<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>

<title>Login Form</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.7.1/dist/jquery.slim.min.js" type="text/javascript"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" type="text/javascript"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" type="text/javascript"></script>
</head>

	<div class="container">
		<h2>Login Form</h2>
		<h4>${msg} </h4>
		<img src= "images/login.png" alt="login logo" style="width:500px;height:600px;">
		
		<form action="loginServlet" method="post">
		
			<div class="form-group">
				<label for="username">Username:</label> 
				<input type="text" class="form-control" placeholder="Enter username" name="username">
			</div>
			
			<div class="form-group">
				<label for="pwd">Password:</label> 
				<input type="password" class="form-control" placeholder="Enter password" name="password">
			</div>

			<button type="submit" class="btn btn-primary">Submit</button>
			<button type="reset" class="btn btn-danger">Reset</button>
		</form>
	</div>

</body>
</html>
