package com.example.DariuszFe.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.DariuszFe.domain.User;
import com.example.DariuszFe.domain.rejestracja;
import com.example.DariuszFe.service.Rejestracja;

@WebServlet("/loginServlet.jsp")
public class loginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public loginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("login.jsp");
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		rejestracja rej = new rejestracja();

		rej.setLogin(request.getParameter("login"));
		rej.setPassword(request.getParameter("password"));

		if (this.getServletContext().getAttribute("storagee") != null) {
			for (rejestracja r : ((Rejestracja) this.getServletContext()
					.getAttribute("storagee")).getInstance()) {
				if (r.getLogin().equals(rej.getLogin())
						&& r.getPassword().equals(rej.getPassword())) {
					request.getSession().setAttribute("user", r);
					response.sendRedirect("getPersonData.jsp");
					return;
				}
			}

		}

		response.sendRedirect("logRej.jsp");

	}

}
