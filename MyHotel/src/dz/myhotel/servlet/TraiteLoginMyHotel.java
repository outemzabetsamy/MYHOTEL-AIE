package dz.myhotel.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dz.myhotel.bdd.SelectClass;
import dz.myhotel.bean.Utilisateur;

/**
 * Servlet implementation class TraiteLoginMyHotel
 */
@WebServlet("/TraiteLoginMyHotel")
public class TraiteLoginMyHotel extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String us = req.getParameter("username");
		String pwd = req.getParameter("pwd");
		SelectClass sc = new SelectClass();
		List<Utilisateur> lu = new ArrayList<Utilisateur>();
		lu = sc.recupUtil();
		boolean trouv = false;
		for (int i = 0; i < lu.size(); i++) {
			if (lu.get(i).getUsernam().equals(us)
					&& lu.get(i).getPwd().equals(pwd)) {
				trouv = true;
				break;
			}

		}
		String message;
		if (trouv == false) {
			message = "Nom d'utilisateur ou mot de passe incorrecte";
			req.setAttribute("msg", message);
			this.getServletContext().getRequestDispatcher("/LoginMyHotel.jsp")
					.forward(req, resp);
		} else {
			this.getServletContext().getRequestDispatcher("/AccueilMyHotel.jsp")
					.forward(req, resp);
		}

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doGet(req, resp);
	}

}
