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
import dz.myhotel.bean.TableauReserv;

/**
 * Servlet implementation class TraiteListeReservation
 */
@WebServlet("/TraiteListeReservation")
public class TraiteListeReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteListeReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<TableauReserv> ls = new ArrayList<TableauReserv>();
		SelectClass sc = new SelectClass();
		ls = sc.recupReservation();
		TableauReserv cm =new TableauReserv();
		request.setAttribute("ls", ls);
	
		this.getServletContext().getRequestDispatcher("/ListeReservation2.jsp")
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
