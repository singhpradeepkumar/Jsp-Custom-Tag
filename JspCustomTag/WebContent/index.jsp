<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="arithmetic-progression.tld" prefix="series" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Custom Tag Demo</title>
</head>
<body>
Arithmetic Progression a=2.5, n=10 and d=5: <br/>
Series : <series:ap a="2.5" d="5" n="10" output="ap"/><br>
an : <series:ap a="2.5" d="5" n="10" output="an"/><br>
sn : <series:ap a="2.5" d="5" n="10" output="sn"/><br>

<br/><br/>
Geometric Progression a=2; n=10; r=2: <br/>
Series : <series:gp a="2.5" r="0.75" n="10"/> <br/>
an : <series:gp a="2.5" r="0.75" n="10" output="an"/>
</body>
</html>