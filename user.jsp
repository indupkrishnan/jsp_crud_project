<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="insert" method="post">
<p><b>Add new record</b></p>
<br/>
<table>
	<tr>
	<td>User Id</td>
	<td><input type="text" name="userid" /></td>
	</tr>
	
	<tr>
	<td>Name</td>
	<td><input type="text" name="fname" /></td>
	</tr>
	
	<tr>
	<td></td>
	<td><input type="submit" value="submit"/></td>
	</tr>

</table>

</form>

<p><a href="ListBook.jsp?action=view">View all Records</a></p>
</body>
</html>