
package com.code;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DB_conection {
    
     public static Connection connect(){
    
        Connection con = null;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/selfzen","root","");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        return con;
    
    }
}
