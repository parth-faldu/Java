import java.sql.*;

public class p1 {

    public static void main(String[] args){
        try{
            Connection con;
            Statement st;
            ResultSet rs;
            
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st = con.createStatement();
            
            rs = st.executeQuery("select * from emp");
            
            while(rs.next()){
                System.out.println("id :" + rs.getInt(1) +
                                   "\nName : " + rs.getString(2) +
                                   "\nSalary : " + rs.getInt(3) +
                                   "\nDesignation :" + rs.getString(4) + 
                                   "\nDepartment :" + rs.getString(5) + "\n");
                
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
