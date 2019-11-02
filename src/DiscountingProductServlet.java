import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(name = "DiscountingProductServlet", urlPatterns = "/calculate")
public class DiscountingProductServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String search = request.getParameter("txtSearch");
        String productDescription = request.getParameter("txtProductDescription");
        float price = Float.parseFloat(request.getParameter("numberListPrice"));
        float discountPercent = Float.parseFloat(request.getParameter("numberDiscountPercent"));
        float discountAmount = price * discountPercent / 100;
        float discountPrice = price - discountAmount;



        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("Product Description: " + productDescription + "<br>");
        writer.println("Price:               " + price + "<br>");
        writer.println("Discount Percent:    " + discountPercent + "<br>");
        writer.println("Discount Amount:     " + discountAmount + "<br>");
        writer.println("Discount Price:      " + discountPrice );

        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
