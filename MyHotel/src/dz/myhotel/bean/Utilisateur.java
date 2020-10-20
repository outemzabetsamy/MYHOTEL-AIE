package dz.myhotel.bean;

public class Utilisateur {
private String usernam,pwd;

public Utilisateur() {
	super();

}

public Utilisateur(String usernam, String pwd) {
	super();
	this.usernam = usernam;
	this.pwd = pwd;
}

public String getUsernam() {
	return usernam;
}

public void setUsernam(String usernam) {
	this.usernam = usernam;
}

public String getPwd() {
	return pwd;
}

public void setPwd(String pwd) {
	this.pwd = pwd;
}

}
