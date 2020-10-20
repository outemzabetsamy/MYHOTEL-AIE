package dz.myhotel.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

import dz.myhotel.bdd.ConnectBdMyHotel;
import dz.myhotel.bean.Chambre;

/**
 * Servlet implementation class TraiteChambreButttons
 */
@WebServlet("/TraiteChambreButttons")
public class TraiteChambreButttons extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TraiteChambreButttons() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("wayiiiiiiiiiii2");
		String button=request.getParameter("button");
		if("add".equals(button)){
			System.out.println("wayiiiiiiiiiii4");
			
			this.getServletContext().getRequestDispatcher("/AjoutChambre.jsp")
			.forward(request, response);	
		}else{
			if("edit".equals(button)){
				
				System.out.println("wayiiiiiiiiiii3");
				
				String id ="5";
				int numetage;
				try{
				System.out.println("iwdheeeeed "+id);
				    ConnectBdMyHotel cn= new ConnectBdMyHotel();
				    System.out.println("avant cn.connect()");
				  cn.connect();
				  System.out.println("avant statement");
				    Statement st = cn.connect().createStatement();
				    System.out.println("apres statement )");
				    ResultSet rs = st.executeQuery("select * from chambre where numchambre='" + 5 + "'");
				    System.out.println("aprres RS");
				    while(rs.next()){
				    	 numetage=rs.getInt("numetage");
				    	 System.out.println("numetage RS");
				    	 String typechambre=rs.getString("typechambre");
				    	 System.out.println(typechambre);
				    	 int nbpers=rs.getInt("nbpersonne");
				    	 System.out.println(nbpers);
				    	 request.setAttribute("id",id);
				    	 request.setAttribute("numetage", numetage);
				    	 request.setAttribute("typechambre", typechambre);
				    	 
				    }
				    
				} catch(SQLException e) {
					System.err.println("echec insertion");
					e.printStackTrace();
				}
				this.getServletContext().getRequestDispatcher("/ModifierChambre.jsp")
				.forward(request, response);	
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
