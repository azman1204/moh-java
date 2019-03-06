
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/HelloWorld"})
public class HelloWorld extends HttpServlet {
    String message;
    public void init() throws ServletException {
        //Do required initialization 
        message="Hello "; 
    }
    
    // http://localhost:9999/javaee/HelloWorld?nama=azman
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //Set response content type 
        response.setContentType("text/html"); // application/json
        // plain/text Application/MS...
        //Actual logic goes here. 
        PrintWriter out = response.getWriter();
        String nama = request.getParameter("nama");
        out.println("<h1>" + this.message + nama + "</h1>");
    }
    
    // http://localhost:9999/javaee/HelloWorld
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // semua data dari di treat sbg string
        String nama = request.getParameter("nama");
        int umur = Integer.parseInt(request.getParameter("umur"));
        PrintWriter out = response.getWriter();
        out.println("<h1>" + nama + " " + umur + "</h1>");
    }
}
