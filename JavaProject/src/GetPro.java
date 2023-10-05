import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

public class GetPro {
public static void main(String[]args)throws Exception{
	getData();
}
public static void getData()throws Exception{
	String url = "jdbc:mysql://127.0.0.1:3306/flight";
	String username = "root";
	String password = "2530";
	String Query = "SELECT * FROM BOOKING_DETAILS";
	
	Connection con = DriverManager.getConnection(url,username,password);
	Statement sta = con.createStatement();
	ResultSet res = sta.executeQuery(Query);
	
	while(res.next()) {
		System.out.println("BOOKING_ID:"+res.getInt(1));
		System.out.println("DEPARTURE_FROM:"+res.getString(2));
		System.out.println("DASTINATION:"+res.getString(03));
		System.out.println("BOOKING_CLASS:"+res.getString(04));
		System.out.println("BOOKING_DATE:"+res.getString(05));
		System.out.println("DEPARTURE_DATE:"+res.getString(06));
		System.out.println("SEAT_NO:"+res.getInt(07));
	}
	con.close();
}
}
