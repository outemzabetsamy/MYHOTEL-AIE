package dz.myhotel.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import dz.myhotel.bdd.SelectClass;
import dz.myhotel.bean.Chambre;

/**
 * Servlet implementation class TraiteListeChambre
 */
@WebServlet("/TraiteListeChambre")
public class TraiteListeChambre extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteListeChambre() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Chambre> ls = new ArrayList<Chambre>();
		SelectClass sc = new SelectClass();
		ls = sc.recupChambre();
		Chambre cm =new Chambre();
		String l=ls.get(0).getTypeChambre();
			List<String> a =new ArrayList<String>();
			a.add("1");
			a.add("2");
			a.add("3");
			a.add("5");
			
			
		
		System.out.println("le type:"+l);
		req.setAttribute("ls", ls);
	
		this.getServletContext().getRequestDispatcher("/ListeChambre.jsp")
				.forward(req, resp);
		/*RequestDispatcher dispatcher =req.getRequestDispatcher("/MyHotel/WebContent/ListeChambre.jsp");
		dispatcher.forward(req, resp);*/
		//resp.sendRedirect("ls");
	}

}
