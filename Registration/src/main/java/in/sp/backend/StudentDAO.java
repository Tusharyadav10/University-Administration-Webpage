package in.sp.backend;

import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayOutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Base64;


public class StudentDAO {
	String dbURL = "jdbc:mysql://localhost:3306/university";
	String dbUser = "root";
	String dbPass = "toor";
	
	public Student get(int id) throws SQLException, IOException {
		Student stu = null;
		
		String sql = "SELECT fname, lname, photo FROM contact WHERE id = ?";
		
		try {
			DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
			Connection conn = DriverManager.getConnection(dbURL, dbUser, dbPass);
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet result = ps.executeQuery();
			
			if (result.next()) {
				stu = new Student();
				String fName = result.getString(1);
				String lName = result.getString(2);
				Blob blob = result.getBlob(3);
				
				InputStream inputStream = blob.getBinaryStream();
				ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
				
				byte[] buffer = new byte[4096];
				int bytesRead = -1;
				
				while ((bytesRead = inputStream.read(buffer)) != -1) {
					outputStream.write(buffer, 0, bytesRead);
				}
				
				byte[] imageBytes = outputStream.toByteArray();
				String base64Image = Base64.getEncoder().encodeToString(imageBytes);
				
				inputStream.close();
				outputStream.close();
				
				stu.setFname(fName);
				stu.setLname(lName);
				stu.setBase64Image(base64Image);
				
			} 
		}catch (SQLException | IOException ex) {
			ex.printStackTrace();
			throw ex;
		}
		if (stu == null) 
			System.out.println("Bug found!");
		
		return stu;
	}

	public int update(int updateType) throws SQLException {
		int flag = -1;
		
		// TODO: Write update function
		
		return flag;
	}
}
