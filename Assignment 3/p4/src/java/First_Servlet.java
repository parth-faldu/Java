import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class First_Servlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet First_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet First_Servlet at " + request.getContextPath() + "</h1>");
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
        
        String username = request.getParameter("username");
        
        HttpSession session = request.getSession();
        session.setAttribute("username",username);
       
        
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet First_Servlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Welcome " + username + "</h2>");
            out.println("<form action='Second_Servlet' method='post'>"
                    + "<input type='submit' value='retrive session data'>"
                    + "</form");
            out.println("</body>");
            out.println("</html>");
            
            out.close();
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}
