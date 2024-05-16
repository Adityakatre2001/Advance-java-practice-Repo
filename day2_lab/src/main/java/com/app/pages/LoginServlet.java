package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.UserDaoImpl;
import com.app.entities.User;


@WebServlet(value = "/login", loadOnStartup = 1)
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDaoImpl userDao;

	public void init() throws ServletException {
		System.out.println("In init of " + getClass());


		try {
			userDao = new UserDaoImpl();
		} catch (SQLException e) {
			throw new ServletException("error occurd in "+getClass(),e);
		}




	}


	public void destroy() {
		try {
			userDao.cleanUp();
		} catch (SQLException e) {
			System.out.println("error occured in Destory" + getClass());


		}
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		try(PrintWriter pw = response.getWriter()){

			String mail = request.getParameter("em");
			String pass = request.getParameter("pass");

			User user = userDao.signIn(mail,pass);

			if (user == null) {
				pw.print("<h1>Invalid Login , please <a href='login.html>Better Luck next Time</a></h1>");



			}else {
				//Cookie c2= new Cookie("user_details",user.toString());
				Cookie c1= new Cookie("user_details",user.toString());

				response.addCookie(c1);

				if(user.getRole().equals("voter")) {


					if(user.isStatus())
						response.sendRedirect("logout");
					else

						response.sendRedirect("CandidateList");
				}
				else {

					response.sendRedirect("admin");
				}








			}

		} catch (SQLException e) {
			throw new 
			ServletException("error in servicing " + getClass(),e);
		}

	}

}

















