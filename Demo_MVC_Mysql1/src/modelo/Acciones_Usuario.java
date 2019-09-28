/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author MIGUEL
 */
public class Acciones_Usuario extends conexionMysql {
    
    public boolean registrar(Usuario user){
        PreparedStatement ps = null;
        Connection con = getconexion();
        
        String sql = "INSERT INTO usuarios (nombres, apellidos, email, clave) values (?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNombres());
            ps.setString(2, user.getApellidos());
            ps.setString(3, user.getEmail());
            ps.setString(4, user.getClave());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println(e);
            return false;
        } finally {
            try {
                con.close();
            } catch (Exception e) {
                System.err.println(e);
            }

        }

    }
    
  
    }
        
        
    
   
