/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.io.IOException;
import java.util.Random;
import javax.swing.ImageIcon;

/**
 *
 * @author LuisGui
 */
public class EDDPractica1 {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
     INICIO inicio =new INICIO();
     inicio.setVisible(true);
     
     LETRAS le = new LETRAS();
     le.aleatorio();
    
}
      
}
