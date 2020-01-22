package metier;

public class Etablissement {
private String nom,mail,adresse,tel;
private Directeur dir;
public Etablissement(String nom, String mail, String adresse, String tel, Directeur dir) {
	super();
	this.nom = nom;
	this.mail = mail;
	this.adresse = adresse;
	this.tel = tel;
	this.dir = dir;
}
@Override
public String toString() {
	return "Etablissement [nom=" + nom + ", mail=" + mail + ", adresse=" + adresse + ", tel=" + tel + ", dir=" + dir
			+ "]";
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
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
public Directeur getDir() {
	return dir;
}
public void setDir(Directeur dir) {
	this.dir = dir;
}


}
