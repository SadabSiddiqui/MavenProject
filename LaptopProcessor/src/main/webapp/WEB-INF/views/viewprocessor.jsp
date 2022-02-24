<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
     <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Processor List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>id</th><th>Generation</th><th>Company</th><th>Core</th></tr>  
   <c:forEach var="processor" items="${listContact}">   
   <tr>  
   <td>${processor.id}</td>  
   <td>${processor.generation}</td>  
   <td>${processor.company}</td>  
   <td>${processor.core}</td>  
   <td><a href="editpro/${processor.id}">Update</a></td> 
   <td><a href="deleteprocessor/${processor.id}">Delete</a></td>  
    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="processor">Add New Processor</a>

</body>
</html>