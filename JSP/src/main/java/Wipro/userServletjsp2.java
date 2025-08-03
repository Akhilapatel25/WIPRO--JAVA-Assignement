package Wipro;



import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/UserServlet")
public class userServletjsp2 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Getting form values
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String address = request.getParameter("address");
        String subscribe = request.getParameter("subscribe");
        String gender = request.getParameter("gender");
        String favNumber = request.getParameter("favNumber");
        String[] frameworks = request.getParameterValues("frameworks");

        // Set data as request attributes
        request.setAttribute("username", username);
        request.setAttribute("password", password);
        request.setAttribute("address", address);
        request.setAttribute("subscribe", subscribe);
        request.setAttribute("gender", gender);
        request.setAttribute("favNumber", favNumber);
        request.setAttribute("frameworks", frameworks);

        // Forward to JSP to display result
        request.getRequestDispatcher("result2.jsp").forward(request, response);
    }
}
