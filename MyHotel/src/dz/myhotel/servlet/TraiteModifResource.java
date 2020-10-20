package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.myhotel.bdd.MajClass;
import dz.myhotel.bean.Client;
import dz.myhotel.bean.Ressource;

/**
 * Servlet implementation class TraiteModifResource
 */
@WebServlet("/TraiteModifResource")
public class TraiteModifResource extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteModifResource() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		int idres = Integer.parseInt(req.getParameter("idres")) ;
		String nomres = req.getParameter("nomres");
		String typeres = req.getParameter("typeres");
		Float tarif = Float.parseFloat(req.getParameter("tarif"));
		
		Ressource st = new Ressource();
		st.setIdRessource(idres);
		st.setNomRessource(nomres);
		st.setTypeRessource(typeres);
		st.setTarifRessource(tarif);
		
		MajClass m = new MajClass();
		m.modifRessource(st,idres);
		String msg = "modification r�ussis";
		req.setAttribute("msg", msg);

this.getServletContext().getRequestDispatcher("/AjoutClient.jsp")
.forward(req, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
