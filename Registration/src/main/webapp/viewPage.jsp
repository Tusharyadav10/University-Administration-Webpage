<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>VIEW PAGE</title>
</head>
<body>
	<div align="center">
		<%-- <h3><c:out value="${student.fName}" /></h3>
		<h3><c:out value="${student.lName}" /></h3> --%>
		<img src="data:image/jpeg;base64,${student.base64Image}" width="240" height="300" />
	</div>
</body>
</html>