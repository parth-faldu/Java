import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Validate extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        String unm = request.getParameter("unm");
        String pass = request.getParameter("pass");
        
        Connection con;
        PreparedStatement pst;
        ResultSet rs;
        
        try {            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            

            pst = con.prepareStatement("SELECT * FROM account WHERE unm = ? AND pass = ?");
            pst.setString(1,unm);
            pst.setString(2,pass);
              
            rs = pst.executeQuery();
            
            if(rs.next()){
                RequestDispatcher rd = request.getRequestDispatcher("Welcome");
                rd.forward(request, response);
            }
            else{
                out.println("<h3 style='color:red;'>Invalid Credentials</h3>");

                RequestDispatcher rd = request.getRequestDispatcher("index.html");
                rd.include(request, response);                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
}
