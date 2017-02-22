/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edd.practica1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import org.jespxml.JespXML;
import org.jespxml.excepciones.TagHijoNotFoundException;
import org.jespxml.modelo.Atributo;
import org.jespxml.modelo.Tag;
import org.xml.sax.SAXException;

/**
 *
 * @author LuisGui
 */
public class INICIO extends javax.swing.JFrame {

    /**
     * Creates new form INICIO
     */
    public INICIO() {
        initComponents();
    }
    Lista lista = new Lista();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("LEER XML");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("JUGAR ");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 JFileChooser fc=new JFileChooser();
 
//Abrimos la ventana, guardamos la opcion seleccionada por el usuario
int seleccion=fc.showOpenDialog(this);
 
//Si el usuario, pincha en aceptar
if(seleccion==JFileChooser.APPROVE_OPTION){
 
    //Seleccionamos el fichero
    File fichero=fc.getSelectedFile();
 
    //Ecribe la ruta del fichero seleccionado en el campo de texto
  
  
        JespXML xml = new JespXML(new File(fichero.getAbsolutePath()));
        try {
            Tag raiz = xml.leerXML();
            
            System.out.println(raiz.getNombre());
            int dimension  = Integer.parseInt(raiz.getTagHijoByName("dimension").getContenido());
        
            
            Tag doble  = raiz.getTagHijoByName("dobles");
            for(int i=0 ; i < doble.getTagsHijos().size();i++){
            int posx = Integer.parseInt(raiz.getTagHijoByName("dobles").getTagsHijos().get(i).getTagHijoByName("x").getContenido());
            int posy = Integer.parseInt(raiz.getTagHijoByName("dobles").getTagsHijos().get(i).getTagHijoByName("y").getContenido());
            System.out.println("X:" + posx + "Y: " +posy);
            }
             Tag triple  = raiz.getTagHijoByName("triples");
            for(int i=0 ; i < triple.getTagsHijos().size();i++){
            int posx = Integer.parseInt(raiz.getTagHijoByName("triples").getTagsHijos().get(i).getTagHijoByName("x").getContenido());
            int posy = Integer.parseInt(raiz.getTagHijoByName("triples").getTagsHijos().get(i).getTagHijoByName("y").getContenido());
            System.out.println("X:" + posx + "Y: " +posy);
            }
                Tag diccionario = raiz .getTagHijoByName("diccionario");
               
            for (int i =0 ;i < diccionario.getTagsHijos().size() ;i++){
             lista.insertar(diccionario.getTagsHijos().get(i).getContenido());
             System.out.println(diccionario.getTagsHijos().get(i).getContenido());
                     }
         
            
            
         
        } catch (Exception ex) {
            System.out.println(ex);
           
        } 
        
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        INGRESOUSUARIO inicio =new INGRESOUSUARIO();
        inicio.setVisible(true);
        
        this.setVisible(false);
   
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(INICIO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new INICIO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}
