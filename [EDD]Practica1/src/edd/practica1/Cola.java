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
public class Cola {
     private Nodo primero;

    public void push(Object nowell) {
        Nodo nuevo = new Nodo();
        nuevo.setValor(nowell);
        if (this.primero == null) {
            this.primero = nuevo;
        } else {
            Nodo actual = this.primero;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevo);
        }
    }

    public Object pop() {
        Nodo Aux;
        Aux = this.primero;
        this.primero = this.primero.getSiguiente();
        return Aux.getValor();        
    }
}
