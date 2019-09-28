/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejecutador;

import controlador.Controlador_Usuario;
import modelo.Acciones_Usuario;
import modelo.Usuario;
import vista.Log_In;
import vista.Log_UP;

/**
 *
 * @author MIGUEL
 */
public class Ejecutable {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Log_In LI = new Log_In();
        LI.setVisible(true);
        
        /*
        Usuario USER = new Usuario();
        Acciones_Usuario AC = new Acciones_Usuario();
        Log_UP LU = new Log_UP();
        
        Controlador_Usuario ctrl = new Controlador_Usuario(USER, AC, LU);
        ctrl.iniciar();
        LU.setVisible(true);
        */
    }
    
}
