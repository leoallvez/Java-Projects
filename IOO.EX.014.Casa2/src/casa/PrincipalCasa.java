/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author 12141100130
 */
public class PrincipalCasa {
    public static void main(String[] args) {
        Casa op = new Casa(200.00,3);
        op.adicionarPorta();
        op.mostrarCasa();
    }

    
}
