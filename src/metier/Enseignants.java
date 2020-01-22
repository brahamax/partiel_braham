package metier;

public class Enseignants extends Personnes{
private String matiere;

public Enseignants(String nom, String prenom, String mail, String adresse, String tel, int id, String matiere) {
		super(nom, prenom, mail, adresse, tel, id);
		// TODO Auto-generated constructor stub
		this.matiere=matiere;
	}

public String getMatiere() {
	return matiere;
}

public void setMatiere(String matiere) {
	this.matiere = matiere;
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return (super.toString()+""+this.matiere);
}





}
