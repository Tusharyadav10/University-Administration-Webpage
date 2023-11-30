<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>REGISTRATION WINDOW</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
	<header>
		<nav>
            <div class="logo">
                <img src="./data/knu_logo_w.jpg">
            </div>
            <div><a href="./login.jsp">Home</a></div>
            <div><a href="./registration.jsp">Register</a></div>
            <div><a href="./delete.jsp">Delete</a></div>
            <div><a href="./uploadFile.jsp">Upload File</a></div>
            <div><a href="./view.jsp">View</a></div>
		</nav>
	</header>
	
    <div class="main">
        <div class="container">
            <div class="heading"><h1>ADD STUDENT</h1></div><br>
            	
	        <form action="regForm" method="post">
	        	<input type="text" name="roll" class="roll" placeholder="Enter roll no" /><br><br>
	        	<input type="text" name="name" class="name" placeholder="Enter name" /><br><br><br>
	        	<button type="submit">Register</button>
	        </form>
        </div>
    </div>

	<footer>
		Tushar Yadav @copyright 2023
	</footer>
</body>
</html>