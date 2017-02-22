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

    public String getLetra() {
        return letra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
//
//    public LETRAS() {
//        this.letra = "";
//        this.cantidad = 0;
//    }

    public LETRAS(String letra, int cantidad) {
        this.letra = letra;
        this.cantidad = cantidad;
    }
   String letra;
   int cantidad;
   
   
    
}
