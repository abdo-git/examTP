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
<s:form action="save">
<table border="2">
<caption> Gestion des clients</caption>
<tr><td><s:textfield label="Numero" name="code"></s:textfield></td></tr>
<tr><td><s:textfield label="Nom" name="nom"></s:textfield></td></tr>
<tr><td><s:textfield label="Ville" name="ville"></s:textfield></td></tr>
<tr><td><s:submit value="Enregistrer"></s:submit></td></tr>
</table>
</s:form>

<table  border="2">
<caption> listes des clients</caption>
<tr><th>Code</th><th>nom</th><th>ville</th></tr>
<s:iterator value="listClients">
<tr><td><s:property value="code"/></td>
<td><s:property value="nom"/></td>
<td><s:property value="ville"/></td>
</tr>
</s:iterator>
</table>

</body>
</html>