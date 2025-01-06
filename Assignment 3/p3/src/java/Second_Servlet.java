import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Second_Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Second_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet Second_Servlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        response.setContentType("text/html"); 
        PrintWriter out = response.getWriter();
        
        Cookie[] cookies = request.getCookies();
        
        String username = null;
        
        if (cookies != null) { 
            for (Cookie cookie: cookies) {
                if(cookie.getName().equals("username")) {
                    username = cookie.getValue();
                    break;
                }
            }
        }
        if(username != null){
            out.println("<h2>Hello "+username+"</h2>");
        }
        else{
            out.println("<h2>Username Not Found In Cookies !!</h2>");
        }
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
