import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Org {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// making a connection

			Class.forName("com.mysql.cj.jdbc.Driver");

			// giving the datbase name , username, password

			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/org", "root", "Bhoyane@8585");

			// creating a statement object

			Statement stmt = con.createStatement();

			// executing a query

			ResultSet rs = stmt.executeQuery("select * from bonus");
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getInt(2) + " " + rs.getDate(3));
			}
			con.close();// closing the connection

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
