package Wipro;




import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/view-cart")
public class ViewCartServlet5 extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        Cookie[] cookies = request.getCookies();
        response.setContentType("text/html");

        response.getWriter().println("<h2>Your Cart</h2>");
        boolean found = false;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().startsWith("item_")) {
                    response.getWriter().println("<li>" + cookie.getValue() + "</li>");
                    found = true;
                }
            }
        }

        if (!found) {
            response.getWriter().println("<p>Your cart is empty.</p>");
        }

        response.getWriter().println("<br><a href='index.html'>Back to Shopping</a>");
    }
}
