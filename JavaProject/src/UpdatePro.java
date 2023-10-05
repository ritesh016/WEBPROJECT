import java.sql.*;

public class UpdatePro {
	public static void main(String[] args)throws Exception {
		updateData();
	}

public static void  updateData() throws Exception{
	String url = "jdbc:mysql://127.0.0.1:3306/FLIGHT";
	String username = "root";
	String password = "2530";
	int BOOKING_ID =1002;
	String Query = "update BOOKING_DETAILS set SEAT_NO = '31' where BOOKING_ID =1002";
	Connection con =  DriverManager.getConnection(url,username,password);
	PreparedStatement pre = con.prepareStatement(Query);
	
	int up = pre.executeUpdate();
	System.out.println(up);
	con.close();
			
}
}