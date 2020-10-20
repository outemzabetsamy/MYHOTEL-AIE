package dz.myhotel.bdd;
import java.sql.*;

public class ConnectBdMyHotel {
	Connection c;
	public ConnectBdMyHotel() {
		// connection au serveur de base de donn�es
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out
					.println("la connection au serveur est faite avec succ�es");
		} catch (Exception e) {
			System.err.println("echec de connexion au serveur "
					+ e.getMessage());
		}
		//connexion a la base de donn�es
		try {
			c=DriverManager.getConnection("jdbc:mysql://localhost:3308/myhotel", "root", "");
			System.out.println("connexion a la base de donn�e r�ussis");
			
		} catch (Exception e) {
			System.err.println("echec connexion a la base de donn�e");
		}
	}
	public Connection connect() {
		return c;
		
	}
	public static void main(String[] args) {
		ConnectBdMyHotel d= new ConnectBdMyHotel();
		d.connect();
	}
}


