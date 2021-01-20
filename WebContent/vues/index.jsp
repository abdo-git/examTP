<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="s" uri="/struts-tags" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<s:form action="log">
<table border="2">
<caption>Connexion</caption>
<tr><td><s:textfield label="username" name="user"></s:textfield></td></tr>
<tr><td><s:textfield label="password" name="pass"></s:textfield></td></tr>
<tr><td><s:submit value="sign in"></s:submit></td></tr>
</table>
</s:form>

</body>
</html>