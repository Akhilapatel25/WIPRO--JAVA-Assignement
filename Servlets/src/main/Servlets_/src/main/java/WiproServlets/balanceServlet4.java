package Wipro;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/balance")
public class balanceServlet4 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);

        if (session != null && session.getAttribute("name") != null) {
            String name = (String) session.getAttribute("name");
            double balance = (Double) session.getAttribute("balance");

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();

            out.println("<h2>Welcome, " + name + "</h2>");
            out.println("<p>Your balance: " + balance + "</p>");
            out.println("<a href='logout'>Logout</a>");
        } else {
            response.getWriter().println("Session expired or invalid. <a href='login.html'>Login</a>");
        }
    }
}
