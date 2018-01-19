<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset>
<legend> <marquee><b>I-PSS Survey</b></marquee> </legend>
<%String name=(String)session.getAttribute("Name"); %>
<%String age=(String)session.getAttribute("Age"); %>
<%String email=(String)session.getAttribute("Email-ID"); %>
<br><br>
<%="Thank You "+name %>
<br><br>
<%="Your age is "+age %>
<br><br>
<%="Email-ID given by you "+email%>
<br><br>
<%="Session ended" %>
<%session.invalidate(); %>
</fieldset>
</body>
</html>