package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.myhotel.bdd.MajClass;
import dz.myhotel.bean.Chambre;
import dz.myhotel.bean.Ressource;

/**
 * Servlet implementation class TraiteAjoutRessource
 */
@WebServlet("/TraiteAjoutRessource")
public class TraiteAjoutRessource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteAjoutRessource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest req, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String nomres = req.getParameter("nom");
		String typeres = req.getParameter("type");
		Float tarif = Float.parseFloat(req.getParameter("tarif"));
		
		Ressource st = new Ressource();
		st.setNomRessource(nomres);
		st.setTypeRessource(typeres);
		st.setTarifRessource(tarif);
		
		MajClass m = new MajClass();
		m.ajoutRessource(st);
		String msg = "ajout r�ussis";
		req.setAttribute("msg", msg);
		this.getServletContext().getRequestDispatcher("/AjoutRessource.jsp")
				.forward(req, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		doGet(req, response);
	}

}
