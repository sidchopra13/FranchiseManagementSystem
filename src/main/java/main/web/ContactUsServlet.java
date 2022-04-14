package main.web;

import java.io.IOException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/contactUs")
public class ContactUsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public  ContactUsServlet() {
	    	super();
	    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			    throws ServletException, IOException {
			        doGet(request, response);
	}
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("contactUs.jsp");
        dispatcher.forward(request, response);
	}
}

