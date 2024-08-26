package bank_management_system;

import java.sql.*;
public class Conn {
    Connection con;
    Statement stmt;
    Conn(){
        try{
            String url="jdbc:mysql://localhost:3306/bank_management_system";
           String username="root";
            String password="sneha@123";
           Class.forName("com.mysql.cj.jdbc.Driver");  
            con =DriverManager.getConnection(url,username,password);    
            stmt =con.createStatement(); 
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
