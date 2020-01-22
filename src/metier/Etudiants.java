package metier;

public class Etudiants extends Personnes {
	private String date_n;
	
	public Etudiants(String nom, String prenom, String mail, String adresse, String tel, int id, String date) {
		super(nom, prenom, mail, adresse, tel, id);
		// TODO Auto-generated constructor stub
		this.date_n=date;
	}

	public String getDate_n() {
		return date_n;
	}

	public void setDate_n(String date_n) {
		this.date_n = date_n;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String r = super.toString();
		r = r + " "+ this.date_n;
		return r;
	}


	

}
