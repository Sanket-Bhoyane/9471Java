import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;
public class  FirstNameWorker{

	public static void main(String[] args) {
		

	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql_db","root", "Bhoyane@8585");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery("select * from worker");
		while(rs.next())
			System.out.println(rs.getString(2));
		con.close();
	}catch(Exception e) {
		System.out.println(e);
	}
	}}


