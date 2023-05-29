package q_6_it_returns;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*
;/**
 * Servlet implementation class IT_Returns
 */
@WebServlet("/IT_Returns")
public class IT_Returns extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public IT_Returns() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String gender = request.getParameter("gender");
		String salary = request.getParameter("salary");
		String tax = request.getParameter("tax");
		
		PrintWriter out = response.getWriter();
		
		out.println("<h1> Hi "+name);
		out.println("Your salary = "+salary);
		out.println("Tax deducted = "+tax);
		
		File fd = new File("C:\\Users\\RVIN\\Desktop\\itreturn.txt");
		fd.createNewFile();
		
		FileOutputStream fout = new FileOutputStream(fd);
		fout.write(("hello"+name+gender+salary+tax).getBytes());
		
		fout.close();
		out.close();
	}

	

}
