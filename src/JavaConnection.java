/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CM139
 */

import java.sql.*;
import javax.swing.JOptionPane;

public class JavaConnection {
    Connection conn;
    
    public static Connection ConnectDb(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/library_management_system", "root", "rajatkumar123");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
            return null;
        }
    }
    
}
