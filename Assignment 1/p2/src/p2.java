import java.util.*;
import java.sql.*;

public class p2 {
    
    static Scanner sc = new Scanner(System.in);
    static Connection con;
    static PreparedStatement pst;
    static ResultSet rs;
    
    static int id,salary;
    static String name,designation,department;

     public static void main(String[] args){
        
        
        while(true){
            
            try{
                System.out.println("\n1.Insert");
                System.out.println("2.Update");
                System.out.println("3.Delete");
                System.out.println("4.Search");
                System.out.println("5.Exit");
            
                System.out.print("\nEnter Your Choice :");
                int ch = sc.nextInt();

                switch(ch){
                    case 1:
                        insert();
                        break;
                    case 2:
                        update();
                        break;
                    case 3:
                        delete();
                        break;
                    case 4:
                        search();
                        break;
                    case 5:
                        return;   
                    default:
                        System.out.println("Invalid Choice..!!");
                        break;
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
    }
    public static Connection dbConnection(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
        }
        catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
    public static void details(){
            System.out.print("\nEnter Id :");
            id = sc.nextInt();
            
            sc.nextLine();
            
            System.out.print("Enter Name :");
            name = sc.nextLine();
            
            System.out.print("Enter Salary :");
            salary  = sc.nextInt();
            
            sc.nextLine();
            
            System.out.print("Enter Designation :");
            designation = sc.nextLine();
            
            System.out.print("Enter Departement :");
            department = sc.nextLine();
    }
    public static void insert(){
        
        try{
            con = dbConnection();
            pst = con.prepareStatement("INSERT INTO emp VALUES(?,?,?,?,?)");
            
            details();
            pst.setInt(1,id);
            pst.setString(2,name);
            pst.setInt(3,salary);
            pst.setString(4,designation);
            pst.setString(5,department);
            
            int record_update = pst.executeUpdate();
            
            System.out.print((record_update > 0) ? "\nrecord inserted..\n" : "\necord not inserted..\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void update(){

        try{
            con = dbConnection();
            pst = con.prepareStatement("UPDATE emp SET name = ? , salary = ? , designation = ? , department = ? WHERE id = ?");
            
            details();
            pst.setString(1,name);
            pst.setInt(2,salary);
            pst.setString(3,designation);
            pst.setString(4,department);
            pst.setInt(5,id);
            
            int record_update = pst.executeUpdate();
            
            System.out.print((record_update > 0) ? "\nrecord updated..\n" : "\necord not updated..\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void delete(){
        try{
            con = dbConnection();
            pst = con.prepareStatement("DELETE FROM emp WHERE id = ?");
            
            System.out.print("\nEnter Id :");
            id = sc.nextInt();
            
            pst.setInt(1,id);
            
            int record_update = pst.executeUpdate();
            
            System.out.print((record_update > 0) ? "\nrecord removed..\n" : "\necord not removed..\n");
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    public static void search(){
         try{
            con = dbConnection();
            pst = con.prepareStatement("SELECT * FROM emp WHERE id = ?");
            
            System.out.print("\nEnter Id :");
            id = sc.nextInt();
            
            pst.setInt(1,id);
            
            rs = pst.executeQuery();
            
            while(rs.next()){
                System.out.println("\nid :" + rs.getInt(1) +
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