import java.sql.*;

public class JDBCdemo{
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.jdbc.Driver"); 
		String url = "jdbc:mysql://localhost:3306//dbname";
		String uName = "root";
		String pass = "root";
		String query = "select username from tablename where user.id =3";
		Connection con = DriverManager.getConnection(url, uName, pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name = rs.getString("username");
		System.out.println(name);
		st.close();
		con.close();
	}
}