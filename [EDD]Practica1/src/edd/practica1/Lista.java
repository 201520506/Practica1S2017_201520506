/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author LuisGui
 */
public class Lista {
       private Nodo primero;

    public Nodo getPrimero() {
        return primero;
    }

    public int getValor() {
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
     public void dibujar() {
        try {
            FileOutputStream fos = new FileOutputStream("lista.dot");
            fos.write("digraph lista{\nrankdir = LR;\ninicio [shape = plaintext, label = \"inicio\"];\nnull [shape = plaintext, label = \"null\"];\n".getBytes());
            String str1 = "inicio -> struct0;\n";
            String str = "";
            Nodo actual = this.primero;
            int i = 0;
            while (actual != null) {
                str = str + " -> struct" + i + "";
                fos.write(("struct" + i + " [shape = record,label=\"{<f0> |<f1>" + actual.getValor()+ " |<f2> }\"];\n").getBytes());
                actual = actual.getSiguiente();                fos.write(("struct" + i + " [shape = record,label=\"{<f0> |<f1>" + actual.getValor()+ " |<f2> }\"];\n").getBytes());

                ++i;
            }
            str = str + ";\nlabel = \"Lista Simple\";\n";
            str = str.substring(4);
            str1 = str1 + "struct" + (i - 1) + " -> null;\n";
            if (this.primero != null) {
                fos.write(str.getBytes());
                fos.write(str1.getBytes());
            } else {
                fos.write("inicio -> null\n;".getBytes());
            }
            fos.write("}".getBytes());
        }
        catch (IOException ioe) {
            System.out.println("excepcion en la lista");
        }
    }

}
