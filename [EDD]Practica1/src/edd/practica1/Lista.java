/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;

/**
 *
 * @author LuisGui
 */

public class Lista {
       private Nodo primero;

    public int getTamaño() {
        return tamaño;
    }
       int tamaño;

    public Nodo getPrimero() {
        return primero;
    }

    public int getValor(int numero) {
        return valor;
    }

  
       int valor;

    public void insertar(Object numero) {
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

    public void eliminar(Object clave) {
        Nodo anterior = this.primero;
        for (Nodo actual = this.primero; actual != null; actual = actual.getSiguiente()) {
            if (actual.getValor()== clave) {
                if (actual == this.primero) {
                    this.primero = actual.getSiguiente();
                    return;
                }
                anterior.setSiguiente(actual.getSiguiente());
                return;
            }
            anterior = actual;
        }
        
    }
    
    

}
