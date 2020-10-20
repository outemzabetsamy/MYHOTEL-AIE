package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dz.myhotel.bdd.MajClass;
import dz.myhotel.bean.Client;
import dz.myhotel.bean.Reservation;

/**
 * Servlet implementation class TraiteModifierReservation
 */
@WebServlet("/TraiteModifierReservation")
public class TraiteModifierReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteModifierReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("debuuuuuuut");
		String idreserv= request.getParameter("idreserv");
		String idc=request.getParameter("ancienidc");;
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
		maj.modifClient(c,idc);
		System.out.println("le client c est bon tpoura la reserv");
		Reservation r=new Reservation();
		r.setTypeReservation(typereservation);
		r.setDateDeb(datedebut);
		r.setDateFin(datefin);
		r.setIdclient(idclient);
		r.setNbpers(nbpersonnes);
		r.setNumchambre(numerochambre);
		maj.ModifReservation(r,idreserv);
		System.out.println(" la reserv c boon");
		//maj.changerEtatChambre(numerochambre);
		String msg = "ajout r�ussis";
		request.setAttribute("msg", msg);
		this.getServletContext().getRequestDispatcher("/ModifierReservation.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
