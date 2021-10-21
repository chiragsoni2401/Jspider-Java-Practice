import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Enumeration;
//import com.mysql.jdbc.Driver;


public class Demo{
	 
	public static void main(String[] args) throws Exception {
		System.out.println("JDBC program demo");
		//loading mysql Driver class
		
		Class.forName("com.mysql.jdbc.Driver");
		
		//Enumeration<java.sql.Driver> e = DriverManager.getDrivers();
		
		Connection con = DriverManager.getConnection("jdbc:mysql:\\localhost:3306:\\jdbc_db", "root", "92*csoni");
		
		Statement stmt = con.createStatement();
		stmt.execute("insert into student values(1,'chirag', 89");
		ResultSet rs = stmt.executeQuery("select * from student");
		
		System.out.println(rs);
		System.out.println(stmt);
		System.out.println(con);
		
		System.out.println("Id\tName\tMarks");
		
		
		while(rs.next()){
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getDouble(3));
		}
		con.close();
		stmt.close();
		rs.close();
	}
}

