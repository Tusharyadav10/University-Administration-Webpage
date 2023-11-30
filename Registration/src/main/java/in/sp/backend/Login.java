package in.sp.backend;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
@WebServlet("/loginForm")
public class Login extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		
		String myun = request.getParameter("username");
		String mypsw = request.getParameter("password");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:/university", "root", "toor");
			
			PreparedStatement ps = con.prepareStatement("select * from admin where username=? AND password=?");
			ps.setString(1, myun);
			ps.setString(2, mypsw);
			
			ResultSet result = ps.executeQuery();
			if(result.next()) {
				response.setContentType("text/html");
				out.print("<h3 style='color:green;position:absolute; top:80vh'> Login Successfull</h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/registration.jsp");
				rd.include(request, response);	
			} else {
				response.setContentType("text/html");
				out.print("<h3 style='color:red;position:absolute; top:80vh'> Username or Password incorrect! </h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
				rd.include(request, response);	
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			
			
			response.setContentType("text/html");
			out.print("<h3 style='color:red;position:absolute; top:80vh'> Exception occured : " 
			+ e.getMessage() + "</h3>");
			 
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);	
		}
		
	}
	

}
