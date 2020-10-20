package dz.myhotel.bean;

public class Ressource {
 private int idRessource;
 private String nomRessource,typeRessource,etatResource;
 private float tarifRessource;
	public Ressource() {
		super();
	}
	public Ressource(int idRessource,String nomRessource, String typeRessource,
			String etatResource, float tarifRessource) {
		super();
		this.idRessource = idRessource;
		this.nomRessource = nomRessource;
		this.typeRessource = typeRessource;
		this.etatResource = etatResource;
		this.tarifRessource = tarifRessource;
	}
	public String getNomRessource() {
		return nomRessource;
	}
	public void setNomRessource(String nomRessource) {
		this.nomRessource = nomRessource;
	}
	public int getIdRessource() {
		return idRessource;
	}
	public void setIdRessource(int idRessource) {
		this.idRessource = idRessource;
	}
	public String getTypeRessource() {
		return typeRessource;
	}
	public void setTypeRessource(String typeRessource) {
		this.typeRessource = typeRessource;
	}
	public String getEtatResource() {
		return etatResource;
	}
	public void setEtatResource(String etatResource) {
		this.etatResource = etatResource;
	}
	public float getTarifRessource() {
		return tarifRessource;
	}
	public void setTarifRessource(float tarifRessource) {
		this.tarifRessource = tarifRessource;
	}

}
