package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UpdateStudentServlet
 */
@WebServlet("/UpdateStudentServlet")
public class UpdateStudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateStudentServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		int updateType = Integer.parseInt(request.getParameter("update_type"));
		StudentDAO dao = new StudentDAO();
		
		try {
			int flag = dao.update(updateType);
			
			if (flag == 1) {
				response.setContentType("text/html");
				out.print("<h3 style='color:green;position:absolute; top:80vh'> User updated successfully!</h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/update.jsp");
				rd.include(request, response);
			}
			else {
				response.setContentType("text/html");
				out.print("<h3 style='color:red;position:absolute; top:80vh'> User not updated!</h3>");
				
				RequestDispatcher rd = request.getRequestDispatcher("/update.jsp");
				rd.include(request, response);	
			}
			
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}

}
