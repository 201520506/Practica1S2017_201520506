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
     Lista lis = new Lista();
              
     Cola randomCola = new Cola ();
    Random random = new Random();
       
        while(randomCola.getTamaño()<80){
            int x = (int)(random.nextDouble() * 23.0);
            LETRAS f;
            f=(LETRAS)lis.getValor(x);
                if(f.getCantidad()>0){
                randomCola.push(f.getLetra());
                System.out.print(f.getLetra()+" ");
                f.setCantidad(f.getCantidad()-1);            
            }       
        }
            System.out.print("SALIO");
     
}
      
}
