import java.sql.*;
public class First {
    
    public static void main(String[] args){
        
        Connection con;
        Statement st;
  
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            System.out.println("Connected...");
            st = con.createStatement();
            int rec = st.executeUpdate("insert into Student values(1,'Parth')");
            System.out.println(rec + "Record inserted");
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
