package gatenet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		
		PrintWriter out=response.getWriter();
		out.print("<html><head></head><body>");
		out.print("<form method='post' action='./second'>");
		out.print("CAddress<input type='text' name='caddress'>");
		out.print("CType<input type='text' name='ctype'>");
		out.print("<input type='hidden' name='cid' value='"+cid+"'>");
		out.print("<input type='hidden' name='cname' value='"+cname+"'>");
		out.print("<input type='submit' value='next'>");
		out.print("</form>");
		out.print("</body></html>");
	}

}
