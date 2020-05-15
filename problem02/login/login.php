<!DOCTYPE html>
<html>
<head>
	<title>Login Page</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
<body>
	<div id="frm">
		<h2>Log In</h2>
		<form action="process.php" method="POST">
				<label>Email</label><br>
				<input type="text" id="email" name="email" placeholder="Enter E-mail here" /><br>

				<label>Password</label><br>
				<input type="password" id="password" name="password" placeholder="Enter Password here" /><br>

				<input type="submit" id="btn" value="Login"/>



		</form>
	</div>

</body>
</html>