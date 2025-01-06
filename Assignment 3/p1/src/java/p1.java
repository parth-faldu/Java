import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
        initParams = {
            @WebInitParam(name = "counter",value = "0")
        }
)
    
public class p1 extends HttpServlet {
   
    int counter;
    
    public void init(ServletConfig config) throws ServletException{
        super.init(config);
        
        String counterInit = config.getInitParameter("counter");
        
        if(counterInit != null){
            counter = Integer.parseInt(counterInit);
        }
        else{
            counter = 0;
        }
    }
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet p1</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Pages Count :"  +  counter++  + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
}
