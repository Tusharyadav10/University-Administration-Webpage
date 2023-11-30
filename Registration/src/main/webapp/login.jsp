<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LOGIN WINDOW</title>
<link rel="stylesheet" href="./css/style.css">
</head>
<body>
    <header>
		<nav>
            <div class="logo">
                <img src="./data/knu_logo_w.jpg">
            </div>
            <div><a href="./login.jsp">Home</a></div>
		</nav>
	</header>
	
    <div class="main">
        <div class="container">
            <div class="heading"><h1>Login Here!</h1></div><br>
            <form action="loginForm" method="post">
                <input type="text" name="username" id="username" placeholder="Enter username"><br><br><br>
                <input type="text" name="password" id="password" placeholder="Enter password"><br><br><br>
                <button type="submit">Submit</button>
            </form>
        </div>
    </div>

	<footer>
		Tushar Yadav @copyright 2023
	</footer>
</body>
</html>