package in.sp.Backend;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/aaa")
public class MySevlet extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String myName=req.getParameter("name1");
	String myEmail=req.getParameter("email1");
	System.out.println("Name "+myName);
	System.out.println("Email "+myEmail);
	PrintWriter out=res.getWriter();
	out.println("Name: "+myName);
	out.print("Email: "+myEmail);
}
}
