package dz.myhotel.bdd;

import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import dz.myhotel.bean.Chambre;
import dz.myhotel.bean.Client;
import dz.myhotel.bean.Reservation;
import dz.myhotel.bean.Ressource;
import dz.myhotel.bean.TableauReserv;
import dz.myhotel.bean.Utilisateur;

public class SelectClass {
	ConnectBdMyHotel cb = new ConnectBdMyHotel();
	Statement st;
	ResultSet rs;
	PreparedStatement pst;
	AES aes=new AES();
	final private String secret="ssshhhhhhhhhhh!!!!";


	// methode recuperation des utilisateurs
	public List<Utilisateur> recupUtil() {
		List<Utilisateur> lu = new ArrayList<Utilisateur>();
		try {
			st = cb.connect().createStatement();
			rs = st.executeQuery("select * from utilisateur");
			while (rs.next()) {
				String username = rs.getString("username");
				String pwd = rs.getString("pwd");
				Utilisateur u = new Utilisateur();
				u.setUsernam(username);
				u.setPwd(pwd);
				lu.add(u);

			}
		} catch (SQLException e) {

			e.printStackTrace();
		}

		return lu;

	}

	public List<Chambre> recupChambre() {
		List<Chambre> ls = new ArrayList<Chambre>();
		try {
			st = cb.connect().createStatement();
			rs = st.executeQuery("select * from chambre ");
			while (rs.next()) {
				//int id = rs.getInt(1);
				
				//String numeroChambre = aes.decrypt(rs.getString(1), secret);
				int num=Integer.parseInt(aes.decrypt(rs.getString(1), secret));
				//System.out.println(numeroChambre);
				String numeroEtage = aes.decrypt(rs.getString(2), secret);
				int nume=Integer.parseInt(numeroEtage);
				System.out.println(numeroEtage);
				String typeChambre = aes.decrypt(rs.getString(3), secret);
				System.out.println(typeChambre);
				
				String prixChambre = aes.decrypt(rs.getString(4), secret);
				Double prix=Double.parseDouble(prixChambre);
				System.out.println(prixChambre);
				String nbPersonne = aes.decrypt(rs.getString(5), secret);
				int nbp=Integer.parseInt(nbPersonne);
				System.out.println(nbPersonne);
				Chambre s = new Chambre(num, nume, typeChambre, nbp , prix );
				ls.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ls;

	}
	
	public List<Ressource> recupRessource() {
		List<Ressource> ls = new ArrayList<Ressource>();
		try {
			st = cb.connect().createStatement();
			rs = st.executeQuery("select * from ressource ");
			while (rs.next()) {
				//int id = rs.getInt(1);
				int idressource = rs.getInt(1);
				System.out.println(idressource);
				String nomressource = aes.decrypt(rs.getString(2), secret);
				System.out.println(nomressource);
				String typeressource = aes.decrypt(rs.getString(3), secret);
				System.out.println(typeressource);
				String etat=aes.decrypt(rs.getString(4), secret);
				String tarif = aes.decrypt(rs.getString(5), secret);
				Float tar=Float.parseFloat(tarif);
				
				
				System.out.println(tarif);
				Ressource s = new Ressource(idressource, nomressource, typeressource,etat, tar );
				ls.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ls;

	}

	
	public List<TableauReserv> recupReservation() {
		List<TableauReserv> ls = new ArrayList<TableauReserv>();
		try {
			st = cb.connect().createStatement();
			rs = st.executeQuery("select r.idreservation,r.type_reservation,r.nbpers,r.date_debut,r.date_fin,r.idclient,r.numchambre,c.idclient,c.nomclient,c.prenomclient,ch.numchambre,ch.typechambre from reservation r ,client c ,chambre ch where c.idclient=r.idclient and r.numchambre=ch.numchambre ");
			while (rs.next()) {
				//int id = rs.getInt(1);
				int idreservation = rs.getInt(1);
				System.out.println(idreservation);
				String typereservation = aes.decrypt(rs.getString(2), secret);
				System.out.println(typereservation);
				String nbpers = aes.decrypt(rs.getString(3), secret);
				int nbp=Integer.parseInt(nbpers);
				System.out.println(nbpers);
				
				String date_debut = aes.decrypt(rs.getString(4), secret);
				System.out.println(date_debut);
				String date_fin = aes.decrypt(rs.getString(5), secret);
				System.out.println(date_fin);
				String nom = aes.decrypt(rs.getString(9), secret);
				System.out.println(nom);
				String prenom = aes.decrypt(rs.getString(10), secret);
				System.out.println(prenom);
				String numchambre = aes.decrypt(rs.getString(11), secret);
				int num=Integer.parseInt(numchambre);
				System.out.println(numchambre);
				
				String typechambre = aes.decrypt(rs.getString(12), secret);
				System.out.println(typechambre);
				TableauReserv tb =new TableauReserv(idreservation,typereservation,nbp,date_debut,date_fin,nom,prenom,num,typechambre);
				ls.add(tb);
				
				
			
				
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ls;

	}
	
	public List<Client> recupClient() {
		List<Client> ls = new ArrayList<Client>();
		try {
			st = cb.connect().createStatement();
			rs = st.executeQuery("select * from client");
			while (rs.next()) {
				//int id = rs.getInt(1);
				String idclient = aes.decrypt(rs.getString(1), secret);
				System.out.println(idclient);
				String nom = aes.decrypt(rs.getString(2), secret);
				System.out.println(nom);
				String prenom = aes.decrypt(rs.getString(3), secret);
				System.out.println(prenom);
				
				String numtel = aes.decrypt(rs.getString(4), secret);
				System.out.println(numtel);
				String age =aes.decrypt(rs.getString(5), secret) ;
				int agee=Integer.parseInt(age);
				System.out.println(age);
				Client s = new Client(idclient, nom, prenom, numtel , agee );
				ls.add(s);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return ls;

	}
/*
	public Stagiaire rechStag(int id) {
		Stagiaire stag = new Stagiaire();
		try {
			pst = cb.connect().prepareStatement(
					"select * from stagiaire where id=?");
			pst.setInt(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				stag.setId(rs.getInt("id"));
				stag.setNom(rs.getString("nom"));
				stag.setPrenom(rs.getString("prenom"));
				stag.setNiveau(rs.getString("niveau"));
				stag.setLangage(rs.getString("langage"));

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

		return stag;

	}
	*/

	
	public static void main(String[] args) {
		SelectClass sc = new SelectClass();

		/*
		 * List<Utilisateur> lu; lu = sc.recupUtil(); for (int i = 0; i <
		 * lu.size(); i++) { System.out.println("username :  " +
		 * lu.get(i).getUsernam() + " pwd: " + lu.get(i).getPwd()); }
		 */
		/*
		List<Stagiaire> ls;
		ls = sc.recupStag();
		for (int i = 0; i < ls.size(); i++) {
			System.out.println("id " + ls.get(i).getId() + " nom "
					+ ls.get(i).getNom() + " prenom " + ls.get(i).getPrenom()
					+ " niveau " + ls.get(i).getNiveau() + " lagage "
					+ ls.get(i).getLangage());

		}
		*/
	}
}
