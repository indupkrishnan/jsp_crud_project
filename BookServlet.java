package com.test;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.book.Book;
import com.dao.BookDao;


@WebServlet("/")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	BookDao bd=null;
	public BookServlet() {
		super();
		bd=new BookDao();
	}	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getServletPath();
		switch (action){
		case "/insert":insertBook(request,response);
			
			break;
		case "/delete":
			break;
		case "/view":getAllBooks(response);
			break;
			
			
		}
		
		}
	void insertBook(HttpServletRequest request, HttpServletResponse response){
		int id=Integer.parseInt(request.getParameter("userid"));
		String name=request.getParameter("fname");

		Book book=new Book();
		book.setId(id);
		book.setName(name);
		try {
			bd.saveBook(book);
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		}
	void getAllBooks( HttpServletResponse response){
		try {
			bd.getAllBook();
			response.sendRedirect("ListBook");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	}


