/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

/**
 *
 * @author MIGUEL
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Acciones_Usuario;
import modelo.Usuario;
import modelo.conexionMysql;
import vista.*;

public class Controlador_Usuario implements ActionListener{
    private Usuario Us;
    private Acciones_Usuario Acu;
    private Log_UP Lu;
    
    
    
    public Controlador_Usuario(Usuario Us, Acciones_Usuario Acu, Log_UP Lu) {
        this.Us = Us;
        this.Acu = Acu;
        this.Lu = Lu;
        this.Lu.btnRegistrar.addActionListener(this);
        
        
    }
    public void iniciar(){
        Lu.setTitle("Usuarios");
        Lu.setLocationRelativeTo(null);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){

            if(e.getSource() == Lu.btnRegistrar) {
            Us.setNombres(Lu.txtNombres.getText());
            Us.setApellidos(Lu.txtApellidos.getText());
            Us.setEmail(Lu.txtEmail.getText());
            Us.setClave(Lu.txtClave.getText());
            
            if (Acu.registrar(Us)) {
                JOptionPane.showMessageDialog(null, "Usuario Registrado");
            
            }else{
            
                JOptionPane.showMessageDialog(null, "Error al Registrar");
            }
            
           } 
                    
                    
                    
                        

                    
                
                
                }
            
            
            
            
            }
    
        
    

    
 
    
  
    
    
    
    
    

