package ua.nure.reznik.Lab2.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.nure.reznik.Lab2.User;
import ua.nure.reznik.Lab2.UserManager;

public class EditUserServlet extends HttpServlet {

	private static final long serialVersionUID = 9027056750120575422L;

	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		HttpSession session = request.getSession(true);

		User user = UserManager.getUser(request.getParameter("id"));
		session.setAttribute("userForEdit", user);
		
		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/edit1.jsp");
		dispatcher.forward(request, response);
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("id");		
		String editPassword = request.getParameter("password");
		String editFullName = request.getParameter("fullName");
		String editEmail = request.getParameter("eMail");

		User user = UserManager.getUser(login);
		
		user.setEmail(editEmail);
		user.setFullName(editFullName);
		user.setPassword(editPassword);
		response.sendRedirect("usersCommunity.jsp");		
	}
	
}