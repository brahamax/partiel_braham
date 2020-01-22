package lanceur;

import service.Bdd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;




public class Main {

	public static void main(String[] args) throws ClassNotFoundException {
 Bdd B = new Bdd();
 B.connection();
	}

}
