package in.sp.backend;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/submitFrom")
public class MyServer extends HttpServlet{
@Override
protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	String mysearch=req.getParameter("search1");
//	res.sendRedirect("https://www.youtube.com");
	res.sendRedirect("https://www.google.com/search?q="+mysearch);
}
}
