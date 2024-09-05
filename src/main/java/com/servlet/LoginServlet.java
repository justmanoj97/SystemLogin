package com.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// read the data coming from login page
		String name = request.getParameter("username"); // sinjeena
		String pass = request.getParameter("password"); // 1234

		try {
			// 1. Load/Register Driver class
			Class.forName("com.mysql.cj.jdbc.Driver");

			try {
				// 2. Creating a connection
				Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/julybatch", "root", "root");

				// 3. Create statement
				PreparedStatement ps = conn.prepareStatement("select * from profile where username=? and password=?");
				ps.setString(1, name); // "sinjeena"
				ps.setString(2, pass); // 1234

				// 4. Execute Query
				ResultSet rs = ps.executeQuery(); //// <--only for retrieval Operation
				if (rs.next()) {
					// true
					System.out.println(rs.getString(1) + "          " + rs.getString(2) + "  " + rs.getString(3) + "  "
							+ rs.getString(4) + "  " + rs.getString(5));

					String username = rs.getString(1); // sinjeena
					String password = rs.getString(2); // 1234
					String fullname = rs.getString(3); // Sinjeena
					String email = rs.getString(4); // s@gmail.com
					String gender = rs.getString(5); // female

					request.setAttribute("a", username); // sinjeena
					request.setAttribute("b", password);
					request.setAttribute("c", fullname);
					request.setAttribute("d", email);
					request.setAttribute("e", gender); // female

					request.getRequestDispatcher("congratulations.jsp").forward(request, response);

				} else {
					// false ---->means whenever we are entering wrong username and/or password
					request.setAttribute("msg", "Wrong credential..Re-Try"); // 64

					request.getRequestDispatcher("login.jsp").forward(request, response);
				}

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
