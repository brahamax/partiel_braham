package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Bdd {
	
private String url = "jdbc:mysql://localhost:8888/phpMyAdmin/db_structure.php?server=1&db=partiel";
private String login ="root";
private String passwd="";
private Connection cn =null;
private Statement st = null;
private ResultSet rs=null;

 public void connection() throws ClassNotFoundException {
		 
		 try {
			 Class.forName("com.mysql.jdbc.Driver");
			 cn= (Connection) DriverManager.getConnection(url,login,passwd);
			 st = cn.createStatement();
			 String sql = "Select * FROM Poste";
			 rs = st.executeQuery(sql);
			 System.out.println(rs.getString("titre"));
		 }
			 catch (SQLException e) {
		e.printStackTrace();	 
			 
		 }
		
	}

}
