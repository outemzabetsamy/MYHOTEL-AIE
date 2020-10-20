package dz.myhotel.bean;

public class TableauReserv {
	int idreservation ;
	String typereservation;
	public TableauReserv(int idreservation, String typereservation, int nbpers,
			String date_debut, String date_fin, String nom, String prenom,
			int numchambre, String typechambre) {
		super();
		this.idreservation = idreservation;
		this.typereservation = typereservation;
		this.nbpers = nbpers;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.nom = nom;
		this.prenom = prenom;
		this.numchambre = numchambre;
		this.typechambre = typechambre;
	}

	public int getIdreservation() {
		return idreservation;
	}

	public void setIdreservation(int idreservation) {
		this.idreservation = idreservation;
	}

	public String getTypereservation() {
		return typereservation;
	}

	public void setTypereservation(String typereservation) {
		this.typereservation = typereservation;
	}

	public int getNbpers() {
		return nbpers;
	}

	public void setNbpers(int nbpers) {
		this.nbpers = nbpers;
	}

	public String getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(String date_debut) {
		this.date_debut = date_debut;
	}

	public String getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(String date_fin) {
		this.date_fin = date_fin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNumchambre() {
		return numchambre;
	}

	public void setNumchambre(int numchambre) {
		this.numchambre = numchambre;
	}

	public String getTypechambre() {
		return typechambre;
	}

	public void setTypechambre(String typechambre) {
		this.typechambre = typechambre;
	}

	int nbpers;	
	String date_debut;
	String date_fin;
	String nom;
	String prenom;
	int numchambre;
	String typechambre;
	
	public TableauReserv() {
		super();
	}

}
