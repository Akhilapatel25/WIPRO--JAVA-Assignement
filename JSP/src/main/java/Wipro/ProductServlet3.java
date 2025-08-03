package Wipro;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.PrintWriter;

@WebServlet("/product")
public class ProductServlet3 extends HttpServlet {
	
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
	        throws ServletException, IOException {
	    doPost(request, response); // Simply forward GET requests to doPost
	}
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String product = request.getParameter("product");
        String price = request.getParameter("price");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        out.println("<form action='order' method='post'>");
        out.println("Quantity: <input type='text' name='quantity'><br>");
        out.println("<input type='text' name='product' value='" + product + "'>");
        out.println("<input type='text' name='price' value='" + price + "'>");
        out.println("<input type='submit' value='Buy'>");
        out.println("</form>");
    }
}
