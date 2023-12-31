package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import service.*;



/**
 * Servlet implementation class Compte
 */
@WebServlet("*.DAO")
public class compteServlet  extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public compteServlet () {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getRequestDispatcher("login.html").forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String path=request.getServletPath();
		BanqueService proxy=new BanqueWS().getBanqueServicePort();
		if(path.equals("/Login.DAO")) {
		// TODO Auto-generated method stub
			
			int code =Integer.parseInt(request.getParameter("codecin"));
			String p = request.getParameter("pass");
			Compte c =new Compte();
			c.setCode(code);
			c.setPass(p);
			if (proxy.exist(c)) {
				session.setAttribute("codecin", code);
				session.setAttribute("pass", p);
				request.getRequestDispatcher("home.jsp").forward(request, response);
				
			} else {
				request.getRequestDispatcher("login.html").forward(request, response);
				
			}
		
	}else {
		if(path.equals("/Register.DAO")) {
			Compte c=new Compte();
			int l = Integer.parseInt(request.getParameter("codecin"));
			String p = request.getParameter("pass");
			c.setCode(l);
			System.out.print(l);
			c.setPass(p);
			System.out.print(p);
			proxy.saveCompte(c);
			request.getRequestDispatcher("login.html").forward(request, response);
		}else {
			if(path.equals("/deconnecter.DAO")) {
				request.getRequestDispatcher("login.html").forward(request, response);
			}
		}
			
		}
	}

}