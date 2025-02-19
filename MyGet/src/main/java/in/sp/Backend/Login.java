package in.sp.Backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/myLogin")
public class Login extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
	String myName=(String)req.getParameter("name1");
	String myPass=(String)req.getParameter("pass1");
	PrintWriter out=res.getWriter();
	if(myName.equals("demo@") && myPass.equals("1234")) {
		System.out.println("Welcome");
		out.println("Welcome");
	}
	else {
	System.out.println("Get Lost");
	out.println("Failed");
	}

	
}
}
