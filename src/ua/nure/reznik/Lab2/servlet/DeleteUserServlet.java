package ua.nure.reznik.Lab2.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.reznik.Lab2.UserManager;

public class DeleteUserServlet extends HttpServlet {

	private static final long serialVersionUID = 4330068438328325381L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("id");		
		UserManager.removeUser(login);
		response.sendRedirect("usersCommunity.jsp");
	}
	
}
