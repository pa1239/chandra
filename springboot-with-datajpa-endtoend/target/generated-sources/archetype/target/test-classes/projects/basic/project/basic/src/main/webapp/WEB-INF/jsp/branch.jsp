<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

   <h2>branches are here</h2>

   <table>
      <tr>
         <th>branchNo</th>
         <th>address</th>
         <th>branchName</th>
         <th>location</th>
      </tr>
      
      <c:forEach items="${branches}" var="branch">
        <tr>
           <td>${branch.branchNo}</td>
           <td>${branch.branchName}</td>
           <td>${branch.address}</td>
           <td>${branch.location}</td>
        </tr>
      
      </c:forEach>
      
      
      
   </table>
</body>
</html>