package ua.nure.reznik.Lab2.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ua.nure.reznik.Lab2.Role;
import ua.nure.reznik.Lab2.UserManager;

public class AddUserServlet extends HttpServlet {

	private static final long serialVersionUID = -5032609190099823187L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		String mail = request.getParameter("mail");
		String fullName = request.getParameter("fullName");

		if (!UserManager.isUserPresent(login)) {
			UserManager.addUser(login, password, mail, fullName, Role.USER);
		}
		response.sendRedirect("usersCommunity.jsp");
	}

}
