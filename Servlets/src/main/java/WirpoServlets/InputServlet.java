package WirpoServlets;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/input")
public class InputServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // Handles GET requests — redirect to form
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("marksForm.html");
    }

    // Handles form submission (POST)
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        int marks = Integer.parseInt(request.getParameter("marks"));

        request.setAttribute("name", name);
        request.setAttribute("marks", marks);

        RequestDispatcher dispatcher = request.getRequestDispatcher("grade");
        dispatcher.forward(request, response);
    }
}
