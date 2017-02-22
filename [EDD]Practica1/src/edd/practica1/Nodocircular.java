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

public class Nodocircular {

    public Nodocircular() {
        this.valor = 0;
        this.siguiente = null;
        this.anterior = null;

    } 

    public Object getValor() {
        return valor;
    }

    public Nodocircular getSiguiente() {
        return siguiente;
    }

    public Nodocircular getAnterior() {
        return anterior;
    }

    public void setValor(Object valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodocircular siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodocircular anterior) {
        this.anterior = anterior;
    }
    Object valor;
    Nodocircular siguiente;
    Nodocircular anterior;
 
 
    
            
}
