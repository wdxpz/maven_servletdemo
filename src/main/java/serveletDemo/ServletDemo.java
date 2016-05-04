package serveletDemo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletDemo extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");  
        resp.setContentType("text/html;charset=utf-8");
        
        String action = req.getParameter("action");  
        if("login_input".equals(action)) {  
            req.getRequestDispatcher("login.jsp").forward(req , resp);  
        } else if("login".equals(action)) {  
            String name = req.getParameter("name");  
            String password = req.getParameter("password");  
            resp.getWriter().write("name->" + name + ",password->" + password);
            System.out.println("name->" + name + ",password->" + password);
        }
    }

}
	
