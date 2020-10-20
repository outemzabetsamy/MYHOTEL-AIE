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
import dz.myhotel.bean.Chambre;
import dz.myhotel.bean.Ressource;

/**
 * Servlet implementation class TraiteListeRessource
 */
@WebServlet("/TraiteListeRessource")
public class TraiteListeRessource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteListeRessource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Ressource> ls = new ArrayList<Ressource>();
		SelectClass sc = new SelectClass();
		ls = sc.recupRessource();
		
		req.setAttribute("ls", ls);
	
		this.getServletContext().getRequestDispatcher("/ListeRessource.jsp")
				.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
