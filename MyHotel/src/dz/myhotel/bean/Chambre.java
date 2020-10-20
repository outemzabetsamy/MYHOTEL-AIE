package dz.myhotel.bean;

public class Chambre {
	private int  numeroChambre,numeroEtage,nbPersonne;
	private String typeChambre;
	private Double prixChambre;
	
	public Chambre() {
		super();
	}
	public Chambre(int numeroChambre,int numeroEtage,String typeChambre,int nbPersonne,Double prixChambre){
	super();
	
	this.numeroChambre=numeroChambre;
	this.numeroEtage=numeroEtage;
	this.typeChambre=typeChambre;
	this.nbPersonne=nbPersonne;
	this.prixChambre=prixChambre;
	}
	public int getNumeroChambre() {
		return numeroChambre;
	}
	public void setNumeroChambre(int numeroChambre) {
		this.numeroChambre = numeroChambre;
	}
	public int getNumeroEtage() {
		return numeroEtage;
	}
	public void setNumeroEtage(int numeroEtage) {
		this.numeroEtage = numeroEtage;
	}
	public int getNbPersonne() {
		return nbPersonne;
	}
	public void setNbPersonne(int nbPersonne) {
		this.nbPersonne = nbPersonne;
	}
	public String getTypeChambre() {
		return typeChambre;
	}
	public void setTypeChambre(String typeChambre) {
		this.typeChambre = typeChambre;
	}
	public Double getPrixChambre() {
		return prixChambre;
	}
	public void setPrixChambre(Double prixChambre) {
		this.prixChambre = prixChambre;
	}

}
