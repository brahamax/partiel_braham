package service;

import metier.Cours;
import metier.Etudiants;

public class Methode implements Methodes{
	static void Creer_E(String nom, String prenom, String mail, String adresse, String tel, int id, String date) {
		Etudiants e = new Etudiants(nom,prenom,mail,adresse,tel,id,date);
		//partie bd
	}
	
	static void Associer_C_E(Etudiants e,Cours c) {
	//partie bdd
	}
	static void Lire_I_E(Etudiants e) {
	//partie bdd
	}
	
	static void Modifier_I_E(Etudiants e,String nom, String prenom, String mail, String adresse, String tel, int id, String date) {
		//partie bdd
	}
	
	static void Supprimer_E(Etudiants e) {
		//partie bdd
	}
	
	static void Lister_E() {
		//partie bdd
	}
	
	static void authentifier(Etudiants e) {
		//partie bdd
		
	}

}
