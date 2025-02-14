package in.sp.backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
 String myEmail=req.getParameter("email1");	
  String mypass=req.getParameter("pass1");
  PrintWriter out=res.getWriter();
  if(myEmail.equals("ddas@gmail") && mypass.equals("12345")) {
	  RequestDispatcher rd=req.getRequestDispatcher("/Profile.jsp");
	  rd.forward(req, res);
  }
  else {
	  RequestDispatcher rd=req.getRequestDispatcher("/MyHtml.html");
	  rd.include(req, res);
	  out.print("<h3 style='color:red'>Email and password didnot match</h3>");
  }
}
}
