<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW PAGE</title>
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
            <div class="heading"><h1>VIEW STUDENT</h1></div><br>
            	
	        <form action="viewstudent" method="get">
	        	<input type="number" name="id" class="id" placeholder="Enter student id" /><br><br>
	        	<button type="submit">VIEW</button>
	        </form>
        </div>
    </div>

	<footer>
		Tushar Yadav @copyright 2023
	</footer>
</body>
</html>