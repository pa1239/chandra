#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
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
      
      <c:forEach items="${symbol_dollar}{branches}" var="branch">
        <tr>
           <td>${symbol_dollar}{branch.branchNo}</td>
           <td>${symbol_dollar}{branch.branchName}</td>
           <td>${symbol_dollar}{branch.address}</td>
           <td>${symbol_dollar}{branch.location}</td>
        </tr>
      
      </c:forEach>
      
      
      
   </table>
</body>
</html>