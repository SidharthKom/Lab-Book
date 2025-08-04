package Lab_1;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC_test {
	public static void main(String[] args) {
		String url = "jdbc:mysql://127.0.0.1:3306/aug_4_2025";
		String user = "root";
		String password="Twisters52#";
		try(Connection con = DriverManager.getConnection(url,user,password))
		{
			System.out.println("Connected to DB");
			String insertsql = "INSERT INTO students(ID,Name,Age) VALUES(?,?,?);";
					try(PreparedStatement pstmt = con.prepareStatement(insertsql))
					{	
						pstmt.setInt(1,104);
						pstmt.setString(2, "sham");
						pstmt.setInt(3, 23);
						int rows = pstmt.executeUpdate();
						System.out.println("Inserted: "+rows);
						
					}
					catch(SQLException e) {
						e.printStackTrace();}
		
		String readsql = "SELECT * from students";
		try(Statement stmt = con.createStatement())
		{
			ResultSet rs = stmt.executeQuery(readsql);
			while(rs.next()) {
				System.out.println("ID:"+rs.getInt("ID"));
				System.out.println("Name: "+rs.getString("Name"));
				System.out.println("Age: "+rs.getInt("Age"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();}
		String updatesql = "UPDATE students SET Name = ? WHERE id = ?";
		try(PreparedStatement pstmt1 = con.prepareStatement(updatesql)){
			pstmt1.setString(1, "Ram");
			pstmt1.setInt(2, 101);
			int rows = pstmt1.executeUpdate();
			System.out.println("Updated: "+ rows);
		}
		catch(SQLException e) {
			e.printStackTrace();}
		
		
		}
		catch(SQLException e) {
			e.printStackTrace();}
		
		
		
		}
	}
	


