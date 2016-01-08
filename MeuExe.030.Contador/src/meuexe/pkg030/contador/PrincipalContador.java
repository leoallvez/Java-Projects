/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg030.contador;

import javax.swing.JFrame;

/**
 *
 * @author Leonardo
 */
public class PrincipalContador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        InterfaceContador cont = new InterfaceContador();
        cont.setVisible(true);
        cont.setSize(600,600);
        cont.setResizable(false);
        cont.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        cont.pack();
    }
    
}
