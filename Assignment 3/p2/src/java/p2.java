import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class p2 extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            Connection con;
            Statement st;
            ResultSet rs;

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            st= con.createStatement();
            rs = st.executeQuery("SELECT * FROM emp");
            
            out.print("<table border=1 cellspacing=0>"
                            +"<caption>Employee Records</caption>"
                                + "<th>ID</th>"
                                + "<th>Name</th>"
                                + "<th>Salary</th>"
                                + "<th>Designation</th>"
                                + "<th>Department</th>");
            
            while(rs.next()){
                out.print("<tr>"
                            + "<td>"+rs.getInt(1)+"</td>"
                            + "<td>"+rs.getString(2)+"</td>"
                            + "<td>"+rs.getInt(3)+"</td>"
                            + "<td>"+rs.getString(4)+"</td>"   
                            + "<td>"+rs.getString(5)+"</td>"                                    
                        + "</tr>");
                
            }
            
            out.print("</table>");
            
            rs.close();
            st.close();
            con.close();
            
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
