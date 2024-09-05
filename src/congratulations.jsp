<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>congratulation</title>
</head>
<body>
<h3>Congratulations!!!--${c}-- You have successfully logged-in</h3>
<table>
  <tr>
 	<th>User Name </th>
 	<th>Password </th>
 	<th> Full Name</th>
 	<th>Email Address </th>
 	<th>Gender </th>
  </tr>
  
  <tr>
 	<td>${a} </td>
 	<td>${b}</td>
 	<td>${c}</td>
 	<td>${d} </td>
 	<td>${e} </td>
  </tr>
 
</table>


${a} <br>
${b} <br>
${c} <br>
${d} <br>
${e} 



</body>
</html>