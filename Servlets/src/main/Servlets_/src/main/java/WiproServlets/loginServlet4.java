package Wipro;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class loginServlet4 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String accountNumber = request.getParameter("accountNumber");
        String password = request.getParameter("password");

        // Dummy credentials (In real app, fetch from DB)
        if ("123456".equals(accountNumber) && "password123".equals(password)) {
            HttpSession session = request.getSession();
            session.setAttribute("name", "Akhila");
            session.setAttribute("balance", 5000.00);

            response.sendRedirect("balance");
        } else {
            //response.getWriter().println("Invalid credentials. <a href='login.html'>Try again</a>");
        	 response.sendRedirect("login.html?error=1");
        }
    }
}
