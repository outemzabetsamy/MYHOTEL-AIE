package dz.myhotel.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import sun.rmi.runtime.NewThreadAction;

import dz.myhotel.bdd.ConnectBdMyHotel;
import dz.myhotel.bdd.MajClass;
import dz.myhotel.bdd.SelectClass;
import dz.myhotel.bean.Chambre;
import dz.myhotel.bean.Client;
import dz.myhotel.bean.Reservation;

/**
 * Servlet implementation class TraiteAjoutReservation
 */
@WebServlet("/TraiteAjoutReservation")
public class TraiteAjoutReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteAjoutReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		SelectClass sc=new SelectClass();
		ConnectBdMyHotel cn=new ConnectBdMyHotel();
		cn.connect();
		System.out.println("avant operation");
		String op =request.getParameter("operation");
		System.out.println("operation i3edda mazal id == "+op);
		String id=request.getParameter("id");
		System.out.println("apres id== "+ id);
		if(op.equals("numerochambre")){
			List<Chambre> clist=sc.recupChambre(id);
			Gson json=new Gson();
			String chambreList=json.toJson(clist);
			response.setContentType("text/html");
			response.getWriter().write(chambreList);
			this.getServletContext().getRequestDispatcher("/AjoutReservation.jsp")
			.forward(request, response);
		}*/
		System.out.println("debuuuuuuut");
		String nomclient= request.getParameter("nomclient");
		System.out.println(nomclient);
		String prenomclient = request.getParameter("prenomclient");
		System.out.println(prenomclient);
		String typechambre=  request.getParameter("typechambre");
		System.out.println("avant nbpersobnes");
		int nbpersonnes=  Integer.parseInt(request.getParameter("nbpersonnes"));
		String datedebut= request.getParameter("datedebut");
		String datefin= request.getParameter("datefin");
		int numerochambre=Integer.parseInt(request.getParameter("numerochambre1"));
		String typereservation=request.getParameter("typereservation");
		String idclient= numerochambre+ nomclient+datedebut;
		System.out.println("le client");
		Client c=new Client();
		c.setNomClient(nomclient);
		c.setPrenomClient(prenomclient);
		c.setIdClient(idclient);
		MajClass maj=new MajClass();
		maj.ajoutClient(c);
		System.out.println("le client c est bon tpoura la reserv");
		Reservation r=new Reservation();
		r.setTypeReservation(typereservation);
		r.setDateDeb(datedebut);
		r.setDateFin(datefin);
		r.setIdclient(idclient);
		r.setNbpers(nbpersonnes);
		r.setNumchambre(numerochambre);
		maj.ajoutReservation(r);
		System.out.println(" la reserv c boon");
		maj.changerEtatChambre(numerochambre);
		String msg = "ajout r�ussis";
		request.setAttribute("msg", msg);
		this.getServletContext().getRequestDispatcher("/AjoutReservation.jsp")
				.forward(request, response);
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
