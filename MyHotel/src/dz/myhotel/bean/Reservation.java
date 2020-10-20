package dz.myhotel.bean;

public class Reservation {
	public Reservation(int idReservation, String typeReservation, int nbpers,
			String dateDeb, String dateFin,String idClient,int numchambre) {
		super();
		this.idReservation = idReservation;
		this.typeReservation = typeReservation;
		this.dateDeb = dateDeb;
		this.dateFin = dateFin;
		this.idclient=idClient;
		this.nbpers=nbpers;
		this.numchambre=numchambre;
	}

	public int getNumchambre() {
		return numchambre;
	}

	public void setNumchambre(int numchambre) {
		this.numchambre = numchambre;
	}

	public int getNbpers() {
		return nbpers;
	}

	public void setNbpers(int nbpers) {
		this.nbpers = nbpers;
	}

	public String getIdclient() {
		return idclient;
	}

	public void setIdclient(String idclient) {
		this.idclient = idclient;
	}

	private int idReservation,nbpers,numchambre;
	private String typeReservation;
	private String dateDeb,dateFin,idclient;
	
	public Reservation() {
		super();
	}

	public int getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(int idReservation) {
		this.idReservation = idReservation;
	}

	public String getTypeReservation() {
		return typeReservation;
	}

	public void setTypeReservation(String typeReservation) {
		this.typeReservation = typeReservation;
	}

	public String getDateDeb() {
		return dateDeb;
	}

	public void setDateDeb(String dateDeb) {
		this.dateDeb = dateDeb;
	}

	public String getDateFin() {
		return dateFin;
	}

	public void setDateFin(String dateFin) {
		this.dateFin = dateFin;
	}

}
