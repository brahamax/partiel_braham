package service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import metier.Cours;
import metier.Etudiants;

public class Methode implements Methodes{
	private static Statement st = null;
	private static ResultSet rs=null;
	private static String sql = "";
	private static Bdd B= new Bdd(); 
	
	
	static void Creer_E(String nom, String prenom, String mail, String adresse, String tel, int id, String date) throws ClassNotFoundException, SQLException {
		Etudiants e = new Etudiants(nom,prenom,mail,adresse,tel,id,date);
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "insert into Etudiants values('"+id+"','"+nom+"','"+prenom+"','"+mail+"','"+adresse+"','"+tel+"',"+date+")";
		st.executeUpdate(sql);
		
		//deconnexion bdd
		B.deconnection();
	}
	
	static void Associer_C_E(Etudiants e,Cours c) throws ClassNotFoundException, SQLException {
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "";
		rs = st.executeQuery(sql);
		
		//deconnexion bdd
		B.deconnection();
	}
	static void Lire_I_E(Etudiants e) throws ClassNotFoundException, SQLException {
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "Select * from Etudiants Where idE ="+Integer.toString(e.getId());
		rs = st.executeQuery(sql);
		if(rs.next()){ 
			do{
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7)+","+rs.getString(8));
			}while(rs.next());
		}
		else{
			System.out.println("Record Not Found...");
		}
		//deconnexion bdd
		B.deconnection();
	}
	
	static void Modifier_I_E(Etudiants e,String nom, String prenom, String mail, String adresse, String tel, int id, String date) throws SQLException, ClassNotFoundException {
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "";
		rs = st.executeQuery(sql);
		
		//deconnexion bdd
		B.deconnection();
	}
	
	static void Supprimer_E(Etudiants e) throws SQLException, ClassNotFoundException {
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "DELETE FROM Etudiants WHERE idE = "+Integer.toString(e.getId());
		st.executeUpdate(sql);
		rs = st.executeQuery(sql);
		
		//deconnexion bdd
		B.deconnection();
	}
	
	static void Lister_E() throws SQLException, ClassNotFoundException {
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "Select * from Etudiants";
		rs = st.executeQuery(sql);
		if(rs.next()){ 
			do{
			System.out.println(rs.getString(1)+","+rs.getString(2)+","+rs.getString(3)+","+rs.getString(4)+","+rs.getString(5)+","+rs.getString(6)+","+rs.getString(7)+","+rs.getString(8));
			}while(rs.next());
		}
		else{
			System.out.println("Record Not Found...");
		}
		//deconnexion bdd
		B.deconnection();
	}
	
	static void authentifier(Etudiants e) throws SQLException, ClassNotFoundException {
		//connexion bdd
		B.connection();
		//traitement
		st = B.getCn().createStatement();
		sql = "";
		rs = st.executeQuery(sql);
		
		//deconnexion bdd
		B.deconnection();
		
	}

}
