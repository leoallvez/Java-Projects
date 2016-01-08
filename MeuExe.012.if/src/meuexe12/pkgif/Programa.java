/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe12.pkgif;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para A:"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite um valor para B:"));
        
        String result = "Para os valores \n";
        result += "A = "+a+" e B = "+b;
        
        if (a <= b){
            result += "\nA variavel A é menor ou igual a B";
        }else{
            result += "\nA variavel A é maior ou igual a B";
        }
        
        JOptionPane.showMessageDialog(null,result, "Resultado",-1);
        
    }
    
}
