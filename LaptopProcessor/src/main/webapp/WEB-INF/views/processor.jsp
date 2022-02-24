<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<title>Spring MVC - Processor</title>
</head>
<body>
<h2>Employee Details</h2>
<form:form method="post" modelAttribute="processor" action="processor">
<table>
<tr>
<td><form:label path="id">ID :</form:label></td>
<td><form:input path="id" /></td>
</tr>
<tr>
<td><form:label path="generation">Generation :</form:label></td>
<td><form:input path="generation" /></td>
</tr>
<tr>
<td><form:label path="company">Company :</form:label></td>
<td><form:input path="company" /></td>
</tr>
<tr>
<td><form:label path="core">Core :</form:label></td>
<td><form:input path="core" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit" /></td>
</tr>
</table>
</form:form>
</body>
</html>