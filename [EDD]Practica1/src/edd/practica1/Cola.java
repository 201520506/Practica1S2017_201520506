/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;
import edd.practica1.Nodo;

/**
 *
 * @author LuisGui
 */
public class Cola {
     private Nodo primero;

    public void push() {
        Nodo nuevo = new Nodo();
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

    public void pop() {
        this.primero = this.primero.getSiguiente() != null ? this.primero.getSiguiente() : null;
    }
}
