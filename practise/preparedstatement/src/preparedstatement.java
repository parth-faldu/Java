import java.sql.*;
import java.util.*;
public class preparedstatement {
    public static void main(String[] args){
        Connection con;
        PreparedStatement st;
        Scanner sc;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
            st = con.prepareStatement("insert into stud values(?,?)");
            sc = new Scanner(System.in);
            System.out.print("Enter rollno:");
            int rno = sc.nextInt();
            System.out.print("Enter name:");
            String nm = sc.next();
            st.setInt(1,rno);
            st.setString(2,nm);
            int ans = st.executeUpdate();
            System.out.println(ans+" Record inserted");
        }
        catch(Exception e){
            System.out.println(e);
        };
    }
}
