import java.sql.*;
public class AddData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306//dbname";
		String uname = "root" ;
		String pass = "root";
		Connection con = DriverManager.getConnection(url, uname, pass);
		Statement st = con.createStatement();
		String query = "insert into tableName values (col1, col2)";
//		ResultSet rs = st.executeQuery(query);
		int rows = st.executeUpdate(query);
		System.out.println(rows);
		st.close();
		con.close();
		

	}

}
