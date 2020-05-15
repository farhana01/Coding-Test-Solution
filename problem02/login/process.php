<?php 
	//get value passe form in login.php file

	//$email = $_POST['email'];
	//$password = $_POST['password'];

	// prevent musql injection

	//$email = stripcslashes($email);
	//$password = stripcslashes($password);
	//$email = mysql_real_escape_string($email);
	//$password = mysql_real_escape_string($password);
		$db = mysqli_connect('localhost', 'root', '', 'login');
		//$email = stripcslashes($email);
		//$password = stripcslashes($password);
		$email = mysqli_real_escape_string($db, $_POST['email']);
		$password = mysqli_real_escape_string($db, $_POST['password']);

	//connect to server and select database

	//mysql_connect("localhost", "root", "");
	//mysql_select_db("login");

	//query
	$result = mysqli_query($db,"SELECT * FROM users where email = '$email' and password = '$password'") 
		or die("Failed to query database");

	$row = mysqli_fetch_array($result);

	if($row['email'] == $email && $row['password'] == $password){
		echo "Login successful !! Welcome ";
	}
	else{
		echo "failed to login";
	}

?>