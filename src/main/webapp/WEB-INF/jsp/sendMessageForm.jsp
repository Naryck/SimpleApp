<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Send message</title>

</head>
<body>
	<center>
		<h1>Send message</h1>
		<img src="Images/sendmail.png"/>
		<br>
		<form action="sendMessageAction">
			<br>
			Enter email: <input type="text" name="email" /><br>
			Enter topic: <input type="text" name="topic" /><br>
			Enter message: <input type="text" name="messageText" /> <br> 
			<input type="submit" value="Send" /><br>
		</form>
		<br>
		<br>
		<br>
		<a href="home">Cancel</a>
	</center>
</body>
</html>