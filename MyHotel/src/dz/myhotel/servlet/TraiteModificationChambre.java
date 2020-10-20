package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.javafx.geom.transform.BaseTransform.Degree;

import java.sql.*;

import dz.myhotel.bdd.ConnectBdMyHotel;
import dz.myhotel.bdd.MajClass;
import dz.myhotel.bean.Chambre;

/**
 * Servlet implementation class TraiteModificationChambre
 */
@WebServlet("/TraiteModificationChambre")
public class TraiteModificationChambre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteModificationChambre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
	
		
			
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
			m.ModifChambre(st,numeroChambre);
			String msg = "modification r�ussis";
			req.setAttribute("msg", msg);
	
	this.getServletContext().getRequestDispatcher("/ModifierChambre.jsp")
	.forward(req, response);
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse response) throws ServletException, IOException {
		doGet(req, response);
	}

}
