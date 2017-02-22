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
public class ListaCircular {
     private Nodocircular primero;

    public void insertar(Object numero) {
        Nodocircular nuevo = new Nodocircular ();
        if (this.primero == null) {
            this.primero = nuevo;
        } else if (this.primero.getSiguiente() == null) {
            this.primero.setSiguiente(nuevo);
            nuevo.setAnterior(this.primero);
            this.primero.setAnterior(nuevo);
            nuevo.setSiguiente(this.primero);
        } else {
            this.primero.getAnterior().setSiguiente(nuevo);
            nuevo.setSiguiente(this.primero);
            nuevo.setAnterior(this.primero.getAnterior());
            this.primero.setAnterior(nuevo);
        }
    }

    public void eliminar(  Object clave) {
        Nodocircular actual = this.primero;
        while (actual.getValor() != clave && (actual = actual.getSiguiente()) != this.primero) {
        }
        if (actual == this.primero) {
            this.primero.getAnterior().setSiguiente(this.primero.getSiguiente());
            this.primero.getSiguiente().setAnterior(this.primero.getAnterior());
            this.primero = this.primero.getSiguiente();
        } else {
            actual.getAnterior().setSiguiente(actual.getSiguiente());
            actual.getSiguiente().setAnterior(actual.getAnterior());
        }
        actual = null;
    }
    
    public void mostrar(){
    
        for(int i=0;i<10;i++){
         if (this.primero.getSiguiente()== null) {
             System.out.println("si");
         }else{
             System.out.println("no");
        }
    }
    }

}
