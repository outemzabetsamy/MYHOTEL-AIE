package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.myhotel.bdd.MajClass;
import dz.myhotel.bean.Chambre;
import dz.myhotel.bean.Client;

/**
 * Servlet implementation class TraiteModifClient
 */
@WebServlet("/TraiteModifClient")
public class TraiteModifClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteModifClient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest req, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		String idclient = req.getParameter("idclient");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String numtel = req.getParameter("numtel");
		int age = Integer.parseInt(req.getParameter("age"));
		Client st = new Client();
		st.setIdClient(idclient);
		st.setNomClient(nom);
		st.setPrenomClient(prenom);
		st.setNumTel(numtel);
		st.setAge(age);
		MajClass m = new MajClass();
		m.modifClient2(st,idclient);
		String msg = "modification r�ussis";
		req.setAttribute("msg", msg);

this.getServletContext().getRequestDispatcher("/AjoutClient.jsp")
.forward(req, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		doGet(req, response);
	}

}
