import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TestServlet")
public class TestServlet extends HttpServlet{
	public TestServlet(){
		super();
	}
	protected void doGet(HttpServletRequest req,HttpServletResponse res)throws ServletException, IOException{
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;UTF-8");

		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		PrintWriter out=res.getWriter();
		out.println("<html><head></head><body><br>"+username+"<br>"+password+"</body></html>");
	}
	protected void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		req.setCharacterEncoding("UTF-8");
		res.setContentType("text/html;charset=UTF-8");

		String username=req.getParameter("username");
		String password=req.getParameter("password");
		System.out.println(username);
		System.out.println(password);
		PrintWriter out=res.getWriter();
		out.println("<html><head><head><body><br>"+username+"<br>"+password+"</body></html>");
	}
}
