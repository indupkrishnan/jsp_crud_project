package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.book.Book;

public class BookDao {
public void saveBook(Book book) throws ClassNotFoundException, SQLException{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/dbdemo";
	String username="root";
	String password="03101994";
	
	Connection con=null;
	PreparedStatement p=null;
	int rs=0;	
	con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();	
	String qry="insert into emp values(?,?)";	
	p=con.prepareStatement(qry);	
	p.setInt(1, book.getId());
	p.setString(2, book.getName());
	rs=p.executeUpdate();
		
}


public List<Book> getAllBook() throws Exception{
	Class.forName("com.mysql.cj.jdbc.Driver");
	String url="jdbc:mysql://localhost:3306/dbdemo";
	String username="root";
	String password="03101994";	
	Connection con=null;
	PreparedStatement p=null;
	ResultSet rs=null;	
	con=DriverManager.getConnection(url,username,password);
	Statement st=con.createStatement();	
	String qry="select * from emp";	
	p=con.prepareStatement(qry);	
	rs=p.executeQuery();
	List<Book> li=new ArrayList<Book>();
	while(rs.next()){		
		Book b=new Book();
		b.setId(rs.getInt(1));
		b.setName(rs.getString(2));
		li.add(b);	
	}
	
	return li;
	
}
}
