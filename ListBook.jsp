<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.util.*" %>
    <%@page import="com.dao.BookDao" %>
    <%@page import="com.book.Book" %>
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% 
BookDao dao=new BookDao();
List<Book> bookList=dao.getAllBook();
%>

<table border=1>
<tr>
<td> id</td>
<td> Name</td>
</tr>
<%for(Book b:bookList){ %>
<tr>
<td><%=b.getId() %></td>
<td><%=b.getName() %></td>
<td><a href="BookServlet?action=updateform&userId=<%=b.getId()%>">Update</a></td>
<td><a href="BookServlet?action=deleteform&userId=<%=b.getId()%>">delete</a></td>
</tr>
<%} %>
</table>
</body>
</html>