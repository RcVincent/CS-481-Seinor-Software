<!DOCTYPE html>
<html>
<head>
	<title>CTM mkii - Login</title>
	<link rel="stylesheet" href="css/bootstrap.css">
</head>
<body>
<h1>Login</h1>
<div class="fluid-container">
	<form  class="form-horizontal" method="post">
		<div class="form-group row">
					<label for="email" class="control-label col-2">Email:</label>
					<input type="text" class="form-control col-10" id="email" name="email" value="${email}">
		</div>
		<div class="row">
					<label for="password" class="control-label col-2">Password:</label>
					<input type="password" class="form-control col-10" id="password" name="password" value="${password}">
		</div>
		<div class="row">
			<div class="col">
				<button type="submit" class="btn btn-info">Submit</button>
			</div>
		</div>
	</form>
	<p>Don't have an account? <a href="create_account">Create an Account</a></p>
</div>
</body></html>