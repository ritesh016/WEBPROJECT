import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DeletePro {
	public static void main(String[]args)throws Exception{
    deleteData();
	}
    
		public static void  deleteData() throws Exception{
			String url = "jdbc:mysql://127.0.0.1:3306/flight";
			String username = "root";
			String password = "2530";
			int BOOKING_DETAILS = 1003;
			String Query = "delete from BOOKING_DETAILS where BOOKING_ID=1003";
			Connection con =  DriverManager.getConnection(url,username,password);
			PreparedStatement pre = con.prepareStatement(Query);
			
			int col = pre.executeUpdate();
			System.out.println(col);
			con.close();
					
}
	}

