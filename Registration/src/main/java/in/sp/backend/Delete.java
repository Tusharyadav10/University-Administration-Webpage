package in.sp.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
@WebServlet("/delForm")
public class Delete extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String myroll = request.getParameter("roll");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:/university", "root", "toor");
			
			PreparedStatement ps = con.prepareStatement("delete from btech where roll=?");
			ps.setString(1, myroll);
			
			int count = ps.executeUpdate();
			if(count > 0) {
				response.setContentType("text/html");
				out.print("<h3 style='color:green;position:absolute; top:80vh'> User deleted successfully</h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/delete.jsp");
				rd.include(request, response);	
			} else {
				response.setContentType("text/html");
				out.print("<h3 style='color:red;position:absolute; top:80vh'> User not present in db! </h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/delete.jsp");
				rd.include(request, response);	
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			response.setContentType("text/html");
			out.print("<h3 style='color:red;position:absolute; top:80vh'> Exception occured : " + e.getMessage() + "</h3>");
			
			RequestDispatcher rd = request.getRequestDispatcher("/delete.jsp");
			rd.include(request, response);	
		}
		
	}
	

}
