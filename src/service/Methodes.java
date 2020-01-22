package service;

import metier.Cours;
import metier.Etudiants;

public interface Methodes {
public static void Creer_E(String nom, String prenom, String mail, String adresse, String tel, int id, String date) {}
static void Associer_C_E(Etudiants e, Cours c) {}
static void Modifier_I_E(Etudiants e,String nom, String prenom, String mail, String adresse, String tel, int id, String date) {}
static void Lire_I_E(Etudiants e) {}
static void Supprimer_E(Etudiants e) {}
static void Lister_E() {}
static void authentifier(Etudiants e) {}

	

}
