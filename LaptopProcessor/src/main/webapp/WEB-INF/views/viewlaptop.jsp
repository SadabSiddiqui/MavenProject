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

<h1>Laptop List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>serialNo</th><th>ProcessorId</th><th>GraphicCard</th><th>ram</th><th>Company</th><th>price</th></tr>  
   <c:forEach var="laptop" items="${listContact}">   
   <tr>  
   <td>${laptop.serialNo}</td>  
   <td>${laptop.processorId}</td>  
   <td>${laptop.graphicCard}</td>  
   <td>${laptop.ram}</td>  
   <td>${laptop.company}</td>  
   <td>${laptop.price}</td>  
   <td><a href="editlap/${laptop.serialNo}">Update</a></td> 
   <td><a href="deletelaptop/${laptop.serialNo}">Delete</a></td>  
    
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="laptop">Add New Laptop</a>

</body>
</html>