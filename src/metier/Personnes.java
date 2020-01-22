package metier;

public abstract class  Personnes {
private String nom,prenom,mail,adresse,tel;
private int id;




public Personnes(String nom, String prenom, String mail, String adresse, String tel, int id) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.mail = mail;
	this.adresse = adresse;
	this.tel = tel;
	this.id = id;
}
@Override
public String toString() {
	return "Personnes [nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", adresse=" + adresse + ", tel=" + tel
			+ ", id=" + id + "]";
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
public String getMail() {
	return mail;
}
public void setMail(String mail) {
	this.mail = mail;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getTel() {
	return tel;
}
public void setTel(String tel) {
	this.tel = tel;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}


}
