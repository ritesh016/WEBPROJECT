package basicprogram;

import java.util.Scanner;

public class Simple{
	public static void main(String[]args)throws Exception {
		insertData();
		
		}
	public static void insertData() throws Exception{
		String url = "jdbc:mysql://127.0.0.1:3306/Data";
		String username = "root";
		String password = "2530";
		String Query = "SELECT * FROM data.data2";
		
		Connection con = DriverManager.getConnection(url,username,password);
		Statement ste = con.createStatement();
		ResultSet sre = ste.executeQuery(Query);
		
		while(sre.next()) {
			System.out.println("id:"+sre.getInt(1));
			System.out.println("name:"+sre.getString);
			System.out.println();
		}
		con.close();
	}
}
