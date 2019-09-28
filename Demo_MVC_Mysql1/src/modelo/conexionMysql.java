/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author MIGUEL
 */
public class conexionMysql {
     Connection conectar = null;
    
    public Connection getconexion(){
        try {
            
          Class.forName("com.mysql.jdbc.Driver");
          
          conectar=(Connection) DriverManager.getConnection ("jdbc:mysql://127.0.0.1:3306/demo_mvc","root","");

            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de Conexion" + e.getMessage());
        }
    
        return conectar;
    
    }  
    
    
    
    
    
}
