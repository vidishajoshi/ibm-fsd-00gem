package comm.example.view;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import comm.example.dao.EmployeeDao;
import comm.example.dao.EmployeeDaoImpl;
import comm.example.model.Employee;

@WebServlet("/list_emp.view")
public class ListEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListEmployee() {
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
   		EmployeeDao ed=new EmployeeDaoImpl();
   		List<Employee> eList=new ArrayList<Employee>();
   		eList=ed.getAllEmployees();
   		out.println("<html><head>");
   		out.println("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n" + 
   				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\r\n" + 
   				"<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n" + 
   				"<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>\r\n" + 
   				"");
   		out.println("</head>");
   		
   		out.println("<body>");
   		out.println("<h1>Employees Details</h1>");
   		out.println("<table class=\"table table-striped\">");
		out.println("<tr><th>Id</th><th>Name</th><th>Email</th><th>Password</th><th>Country</th><th>Edit</th><th>Delete</th></tr>");
   		for(Employee l:eList) {
   		
		out.println("<tr><td>"+l.getId()+"</td><td>"+l.getName()+"</td><td>"+l.getEmail()+"</td><td>"+l.getPassword()+"</td><td>"+l.getCountry()+"</td><td><a href=\"edit_emp.view?id="+l.getId()+"\"><button type=\"button\" class=\"btn btn-warning\">Edit</button></a></td><td><a href=\"delete_emp.view?id="+l.getId()+"\"><button type=\"button\" class=\"btn btn-danger\">Delete</button></a></td>");
		
   		}
   		out.println("</tr></table>");
		out.println("</br><a href=\"main_page.html\"><button type=\"button\" class=\"btn btn-info\">Back</button></a>");
		out.println("</body></html>");
   		
   		
   	}
}
