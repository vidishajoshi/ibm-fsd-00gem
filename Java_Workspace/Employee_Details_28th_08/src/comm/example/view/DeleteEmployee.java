package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;

/**
 * Servlet implementation class DeleteEmployee
 */
@WebServlet("/delete_emp.view")
public class DeleteEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	}

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		try {
			doProcess(request, response);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	}
   	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, SQLException {

   		response.setContentType("text/html");
   		PrintWriter out=response.getWriter();
   		EmployeeDao de=new EmployeeDaoImpl();
   		String newid=request.getParameter("id");
   		int id=Integer.parseInt(newid);
   		de.deleteEmployee(id);
   		RequestDispatcher  view=request.getRequestDispatcher("list_emp.view");
		view.forward(request, response);

   		
   	}
}
