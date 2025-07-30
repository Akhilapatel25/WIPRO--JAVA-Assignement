package WiproServlets;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/grade")
public class GradeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        // Get attributes from forwarded request
        String name = (String) request.getAttribute("name");
        Object marksObj = request.getAttribute("marks");

        // ✅ Null check to avoid 500 error
        if (name == null || marksObj == null) {
            out.println("<h3 style='color:red;'>Error: Missing form data. Please submit through the form.</h3>");
            return;
        }

        int marks = (int) marksObj;

        // Grade calculation logic
        String grade;
        if (marks >= 90) grade = "A";
        else if (marks >= 75) grade = "B";
        else if (marks >= 60) grade = "C";
        else if (marks >= 40) grade = "D";
        else grade = "F";

        // Output
        out.println("<h2>Result</h2>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Marks: " + marks + "</p>");
        out.println("<p>Grade: " + grade + "</p>");
    }

    // ✅ Allow GET request just in case
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }
}
