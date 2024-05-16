package com.app.pages;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CandidateListServlet
 */
@WebServlet("/CandidateList")
public class CandidateListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		try(PrintWriter pw = response.getWriter()){
			pw.print("<h1>in candidate list page....: Succesful Login!!!</h1>");
			
			
			Cookie[] cookies = request.getCookies();
			if(cookies != null) {
				
				for(Cookie c : cookies)
					if(c.getName().equals("user_details")) {
						pw.print("<h2>User Details - " + c.getValue()+"</h2>");
						break;
					}
			}else
				pw.print("<h4> Nop Cookie, seesion tracking faild  </h4>");
			
			
			
			
		}
		
		
		
		
		
		
	}

	
}
