package ua.nure.reznik.Lab2.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ua.nure.reznik.Lab2.UserManager;

@WebServlet("/authenticationServlet")
public class AuthenticationServlet extends HttpServlet {

	private static final long serialVersionUID = -7236809930107404023L;

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String login = request.getParameter("login");
		String password = request.getParameter("password");

		PrintWriter writer = response.getWriter();

		if (UserManager.isUserPresent(login)) {
			if (UserManager.isPasswordCorrect(login, password)) {
				HttpSession session = request.getSession(true);
				session.setAttribute("users", UserManager.getUsers());
				session.setAttribute("currentUser", UserManager.getUser(login));
				getServletContext().getRequestDispatcher("/usersCommunity.jsp").forward(request, response);
			}
			writer.print("You have entered a bad password. Try again");
			return;
		}
		writer.print("User with login " + login + " doesn't exist. Try again");
		return;
	}

}