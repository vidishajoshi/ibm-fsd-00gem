package controller;

import java.io.IOException;
import java.io.PrintWriter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.CD;

/**
 * Servlet implementation class CheckCD
 */
public class CheckCD extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckCD() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   		try {
			doProcess(request, response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	}

   	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

   		try {
			doProcess(request, response);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
   	}
   	protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, ParseException {
   		response.setContentType("text/html");
   		PrintWriter out=response.getWriter();
   		String cdType=request.getParameter("type");
   		String title=request.getParameter("title");
   		String artist=request.getParameter("artist");
   		Date purchasedate= new SimpleDateFormat("dd-mm-yyyy").parse(request.getParameter("purchasedate"));
   		System.out.println(purchasedate);
   		String cost=request.getParameter("cost");
   		int cost1=Integer.parseInt(cost);
   		HttpSession session=request.getSession();
   		session.setAttribute("cd", new CD(title,artist,purchasedate,cost1));
   		session.setAttribute("cd_type", cdType);
   		
   		if(cdType.equals("international")) {
   			RequestDispatcher view=request.getRequestDispatcher("internationalCD.jsp");
			view.include(request, response);
   		}else  if(cdType.equals("special")){
   			RequestDispatcher view=request.getRequestDispatcher("Special.jsp");
			view.include(request, response);
   		}else {
   			out.println("Chosse valid type of CD");
   			RequestDispatcher view=request.getRequestDispatcher("CdDetails.jsp");
			view.forward(request, response);
   		}
   			
   		
     
   	}
}
