package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.myhotel.bdd.MajClass;
import dz.myhotel.bean.Chambre;

/**
 * Servlet implementation class TraiteAjoutChambre
 */
@WebServlet("/TraiteAjoutChambre")
public class TraiteAjoutChambre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteAjoutChambre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int numeroChambre = Integer.parseInt(req.getParameter("numerochambre"));
		int numeroEtage = Integer.parseInt(req.getParameter("numeroetage"));
		String typeChambre = req.getParameter("typechambre");
		int nbPersonne = Integer.parseInt(req.getParameter("nbpersonnes"));
		Double prixChambre = Double.parseDouble(req.getParameter("prixchambre"));
		Chambre st = new Chambre();
		st.setNumeroChambre(numeroChambre);
		st.setNumeroEtage(numeroEtage);
		st.setTypeChambre(typeChambre);
		st.setNbPersonne(nbPersonne);
		st.setPrixChambre(prixChambre);
		MajClass m = new MajClass();
		m.ajoutChambre(st);
		System.out.println("recuperation des parametre reussis");
		System.out.println("chiffrement des données reussis");
		System.out.println("Ajout avec succes");
		
		String msg = "ajout reussis";
		req.setAttribute("msg", msg);
		this.getServletContext().getRequestDispatcher("/AjoutChambre.jsp")
				.forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
