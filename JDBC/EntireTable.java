import java.sql.*;
public class EntireTable {
	
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306//dbname";
		String userName = "root";
		String pass= "root";
		
		Connection con = DriverManager.getConnection(url , userName, pass);
		Statement st = con.createStatement();
		
		String query = "Select * from student";
		
		ResultSet rs = st.executeQuery(query);
		while(rs.next()) {
			String userData= rs.getInt(1) + " : " + rs.getString(2);
			System.out.println(userData);
		}
		st.close();
		con.close();
	}

}
