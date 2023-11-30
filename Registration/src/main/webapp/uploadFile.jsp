<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UPLOAD WINDOW</title>
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
            <div class="heading"><h1>Upload Your File</h1></div><br>
            
	        <form method="post" action="uploadServlet" enctype="multipart/form-data">
	        	Roll No: <input type="number" name="id" placeholder="Enter id" /><br><br>
	        	First Name: <input type="text" name="fname" placeholder="Enter first name" /><br><br>
	        	Last Name: <input type="text" name="lname" placeholder="Enter last name" /><br><br>
	        	Photo: <input type="file" name="photo" size="50" /><br><br><br>
	        	<button type="submit">Upload</button>
	        </form>
        </div>
    </div>

	<footer>
		Tushar Yadav @copyright 2023
	</footer>

</body>
</html>