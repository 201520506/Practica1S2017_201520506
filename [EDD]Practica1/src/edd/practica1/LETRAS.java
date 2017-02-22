/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.util.Random;

/**
 *
 * @author LuisGui
 */
public class LETRAS {
Lista l = new Lista();
   char letras[] = new char[7];
         public void aleatorio(){
          char[] letra={'A','B','C','D','E','F','G','H','I','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
    
         Random rnd = new Random();
          int x;
          for (int i = 0; i < 7; i++) {
              x = (int)(rnd.nextDouble() * 10.0);
              letras[i]=(letra[x]);
              l.insertar(letra[i]);     
              
     }
         }
   
   
    
}
