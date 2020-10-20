package dz.myhotel.bdd;

import java.sql.*;

import dz.myhotel.bean.Chambre;
import dz.myhotel.bean.Client;
import dz.myhotel.bean.Reservation;
import dz.myhotel.bean.Ressource;

public class MajClass {
	final private String secret="ssshhhhhhhhhhh!!!!";
	ConnectBdMyHotel connexion = new ConnectBdMyHotel();
	AES aes=new AES();
	Statement stm;
	PreparedStatement pst;

	public void ajoutChambre(Chambre st) {
		try {
			stm = connexion.connect().createStatement();
			stm.executeUpdate("INSERT INTO `chambre`(`numchambre`, `numetage`, `typechambre`, `prixchambre`, `nbpersonne`) VALUES ('"
					+ aes.encrypt(st.getNumeroChambre()+"", secret)
					+ "','"
					+ aes.encrypt(st.getNumeroEtage()+"", secret)
					+ "','"
					+ aes.encrypt(st.getTypeChambre(), secret) + "','" + aes.encrypt(st.getPrixChambre()+"", secret) + "','"+ aes.encrypt(st.getNbPersonne()+"", secret)+"')");
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
	}

	public void supChambre(int id) {
		try {
			pst = connexion.connect().prepareStatement(
					"delete from chambre where id=?");
			pst.setInt(1, id);
			pst.execute();
			System.out.println("supression faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec de supression");
			e.printStackTrace();
		}

	}
	
	public void ModifChambre(Chambre st, int id) {
		try {
			stm = connexion.connect().createStatement();
			String up="UPDATE `chambre` SET `numchambre`="
					+ aes.encrypt(st.getNumeroChambre()+"", secret)
					+ ",`numetage`="
					+aes.encrypt(st.getNumeroEtage()+"", secret) 
					+",`typechambre`= '"
					+ aes.encrypt(st.getTypeChambre(), secret) + "',`prixchambre`=" + aes.encrypt(st.getPrixChambre()+"", secret) + ",`nbpersonne`="+ aes.encrypt(st.getNbPersonne()+"", secret)+" WHERE numchambre="+aes.encrypt(id+"", secret);
			stm.executeUpdate(up);
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
	}
	public void ajoutRessource(Ressource st) {
		try {
			stm = connexion.connect().createStatement();
			stm.executeUpdate("INSERT INTO `ressource`(`nom_res`, `type_res`, `tarif_res`) VALUES ('"
					+ aes.encrypt(st.getNomRessource(), secret)
					+ "','"
					+ aes.encrypt(st.getTypeRessource(), secret)
					+ "','"
					+ aes.encrypt(st.getTarifRessource()+"", secret) + "')");
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
	}

	
	public void ajoutClient(Client st){
		try {
			stm = connexion.connect().createStatement();
			stm.executeUpdate("INSERT INTO `client`(`idclient`, `nomclient`, `prenomclient`, `numtel`, `age`) VALUES ('"
					+ aes.encrypt(st.getIdClient(), secret)
					+ "','"
					+ aes.encrypt(st.getNomClient(), secret)
					+ "','"
					+aes.encrypt(st.getPrenomClient(), secret)  + "','" + aes.encrypt(st.getNumTel(), secret)+ "','"+ aes.encrypt(st.getAge()+"", secret)+"')");
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
		
	}
	public void modifClient(Client st,String id){
		try {
			String up="UPDATE `client` SET `idclient`='"+aes.encrypt(st.getIdClient(),secret)+"',`nomclient`='"
					+aes.encrypt(st.getNomClient(), secret) 
					+ "',`prenomclient`='"
					+ aes.encrypt(st.getPrenomClient(), secret) + "' WHERE `idclient`='"+ aes.encrypt(st.getIdClient(), secret)+"'";
			stm = connexion.connect().createStatement();
			stm.executeUpdate(up);
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
		
		
	}
	public void modifClient2(Client st,String id){
		try {
			String up="UPDATE `client` SET `idclient`='"+aes.encrypt(st.getIdClient(), secret)+"',`nomclient`='"
					+ aes.encrypt(st.getNomClient(),secret)
					+ "',`prenomclient`='"
					+aes.encrypt( st.getPrenomClient(), secret) + "',`numtel`='"
					+ aes.encrypt(st.getNumTel(), secret) + "',`age`='"
					+ aes.encrypt(st.getAge()+"", secret) + "' WHERE `idclient`='"+ aes.encrypt(st.getIdClient(), secret)+"'";
			stm = connexion.connect().createStatement();
			stm.executeUpdate(up);
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
		
		
	}
	
	public void modifRessource(Ressource st,int id){
		try {
			String up="UPDATE `ressource` SET `nom_res`='"+aes.encrypt(st.getNomRessource(), secret)+"',`type_res`='"
					+ aes.encrypt(st.getTypeRessource(), secret)
					+ "',`tarif_res`='"
					+ aes.encrypt(st.getTarifRessource()+"", secret) + "' WHERE `idressource`='"+ id+"'";
			stm = connexion.connect().createStatement();
			stm.executeUpdate(up);
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
		
		
	}
	
	public void ajoutReservation(Reservation st){
		try {
			stm = connexion.connect().createStatement();
			stm.executeUpdate("INSERT INTO `reservation`( `type_reservation`, `nbpers` ,`date_debut`, `date_fin`, `idclient`, `numchambre`) VALUES ('"
					
					+ aes.encrypt(st.getTypeReservation(), secret)
					+ "','"
					+ aes.encrypt(st.getNbpers()+"", secret)
					+ "','"
					+ aes.encrypt(st.getDateDeb(), secret) + "','" + aes.encrypt(st.getDateFin(), secret)+ "','"+ aes.encrypt(st.getIdclient(), secret)+"','"+aes.encrypt(st.getNumchambre()+"", secret) +"')");
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
	}
	
	public void ModifReservation(Reservation st,String id){
		try {
			String up="UPDATE `reservation` SET `type_reservation`= '"+ aes.encrypt(st.getTypeReservation(), secret)
					+ "',`nbpers`='"
					+ aes.encrypt(st.getNbpers()+"", secret)
					+ "',`date_debut`='"
					+ aes.encrypt(st.getDateDeb(), secret) + "',`date_fin`='" + aes.encrypt(st.getDateFin(), secret)+ "',`idclient`='"+ aes.encrypt(st.getIdclient(), secret)+"',`numchambre`='"+ aes.encrypt(st.getNumchambre()+"", secret)+"' WHERE idreservation="+id;
			stm = connexion.connect().createStatement();
			stm.executeUpdate(up);
			System.out.println("l'insertion est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec insertion");
			e.printStackTrace();
		}
	}
	
	public void changerEtatChambre(int numchambre){
		try {
			stm = connexion.connect().createStatement();
			stm.executeUpdate("update chambre set etatchambre='"+aes.encrypt("occupe", secret)+"' where numchambre='"+ aes.encrypt(numchambre+"", secret)+"'");
			System.out.println("la modificzation est faite avec succ�es");
		} catch (SQLException e) {
			System.err.println("echec modifiction ayini a tonton");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		MajClass tst = new MajClass();
		Chambre s = new Chambre();
		/*
		s.setNom("barache");
		s.setPrenom("amira");
		s.setNiveau("l3");
		s.setLangage("java EE");
		/*tst.ajoutStagiaire(s);*/
		//tst.supStagiaire(2);

	}

}
