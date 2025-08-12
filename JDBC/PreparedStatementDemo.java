import java.sql.*;
public class PreparedStatementDemo {
	public static void main(String args[]) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306//dbname";
		String uname = "root";
		String pass = "root";
		Connection con = DriverManager.getConnection(url, uname, pass);
		String query = "insert into Student values (?, ?)";
		PreparedStatement st = con.prepareStatement(query);
		int userId = 5;
		String username = "Mahesh";
	    st.setInt(1, userId);
		st.setString(2, username);
		int count = st.executeUpdate();
		System.out.println(count + " row/s effected");
		st.close();
		con.close();
	}

}
