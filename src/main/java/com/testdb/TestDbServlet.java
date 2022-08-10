package com.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * Servlet implementation class TestDbServlet
 */
@WebServlet("/TestDbServlet")
public class TestDbServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		// setup connction var
			String user = "springstudent";
			String pass = "springstudent";
			
			String url = "jdbc:mysql://localhost:3306/web_customer_tracker?useSSL=false";
			String driver = "com.mysql.jdbc.Driver";
			
		// get connection to db
			try {
				
				PrintWriter out = response.getWriter();
				out.println("Connecting to DB....");
				
				Class.forName(driver);
				Connection conn = DriverManager.getConnection(url, user, pass);
				
				out.println("Success Connection .....");
				
				conn.close();
				
			}catch (Exception e) {
				e.printStackTrace();
				throw new ServletException(e);
			}
		 
			
			
			
			
			
			
	}

}
