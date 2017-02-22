/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

/**
 *
 * @author LuisGui
 */
public class Nodo {  
    Object valor;
    Nodo siguiente; 
    
    public Nodo() {
        this.valor = 0;
        this.siguiente = null;
    }

    
    public Object getValor() {
        return valor;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }
  
       public void setValor(Object valor) {
        this.valor = valor;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }  
}
