import java.sql.*;

public class InsertPro {
public static void main(String[]args)throws Exception{
	insertData();
}
public static void insertData() throws Exception{
	String url = "jdbc:mysql://127.0.0.1:3306/flight";
	String username = "root";
	String password = "2530";
	String Query = "insert into BOOKING_DETAILS values(?,?,?,?,?,?,?)";
	
	Connection con = DriverManager.getConnection(url,username,password);
	PreparedStatement pre = con.prepareStatement(Query);
	pre.setInt(01,1006);
	pre.setString(02,"PATNA");
	pre.setString(03,"KOLKATA");
	pre.setString(04,"NORMAL");
	pre.setString(05,"2003/09/15");
	pre.setString(06,"2023/12/30");
	pre.setInt(07,36);
	pre.executeUpdate();
	con.close();
}
}
