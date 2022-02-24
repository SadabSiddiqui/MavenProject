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
<form:form method="post" modelAttribute="laptop" action="editlaptop">
<table>
<tr>
<td><form:label path="serialNo">SerialNo :</form:label></td>
<td><form:input path="serialNo" /></td>
</tr>
<tr>
<td><form:label path="processorId">ProcessorId :</form:label></td>
<td><form:input path="processorId" /></td>
</tr>
<tr>
<td><form:label path="graphicCard">GraphicCard :</form:label></td>
<td><form:input path="graphicCard" /></td>
</tr>
<tr>
<td><form:label path="ram">Ram:</form:label></td>
<td><form:input path="ram" /></td>
</tr>
<tr>
<td><form:label path="company">company :</form:label></td>
<td><form:input path="company" /></td>
</tr>
<tr>
<td><form:label path="price">Price :</form:label></td>
<td><form:input path="price" /></td>
</tr>
<tr>
<td colspan="2"><input type="submit" value="Submit" /></td>
</tr>
</table>
</form:form>
</body>
</html>