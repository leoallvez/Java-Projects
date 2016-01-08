/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe11.tolowercase;

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
        String st = "Meu_Nome@SERvidor.com.br";
        String result = "O usuàrio escreveu: "+ st;
        st = st.toLowerCase();
        result += "\n mas com o método toLowerCase()";
        result += "\nA nova forma da palavra ficou: " + st;
        
        JOptionPane.showMessageDialog(null,result,"Exemplo",-1);
    }
    
}
