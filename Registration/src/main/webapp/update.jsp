<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <link rel="stylesheet" href="./css/styles.css">
</head>
<body>
    <header>
		<nav>
            <div class="logo">
                <img src="./data/knu_logo_w.jpg">
            </div>
            <div><a href="./login.jsp">Home</a></div>
            <div><a href="./registration.jsp">Register</a></div>
            <div><a href="./update.jsp">Update</a></div>
            <div><a href="./delete.jsp">Delete</a></div>
            <div><a href="./uploadFile.jsp">Upload File</a></div>
		</nav>
	</header>
	
    <div class="main">
        <div class="container">
            <div class="heading"><h1>UPDATE DB</h1></div><br>
            
	        <form action="updateForm" method="post">
                <input type="radio" id="roll" name="update_type" value="0"><label for="roll">Roll</label>
                <input type="radio" id="name" name="update_type" value="1"><label for="name">Name</label>
                <input type="radio" id="both" name="update_type" value="2"><label for="both">Both</label><br><br>
                <input type="text" name="roll" class="roll" placeholder="Enter updated roll" /><br><br>
	        	<input type="text" name="name" class="name" placeholder="Enter updated name" /><br><br>
	        	<button type="submit">Update</button>
	        </form>
        </div>
    </div>

	<footer>
		Tushar Yadav @copyright 2023
	</footer>
    
</body>
</html>