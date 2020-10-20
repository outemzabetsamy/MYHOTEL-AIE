package dz.myhotel.bean;

public class Client {
public Client(String idClient,String nomClient,String prenomClient, String numTel,int age) {
		super();
		this.idClient = idClient;
		this.age = age;
		this.numTel = numTel;
		this.nomClient = nomClient;
		this.prenomClient = prenomClient;
	}
private int age;
private String idClient,numTel,nomClient,prenomClient;
	public Client() {
		super();
	}
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNumTel() {
		return numTel;
	}
	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}

}
