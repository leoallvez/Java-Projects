/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe10_replace;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira
 */
public class MeuExe10_replace {

    public static void main(String[] args) {
        String st = "1220,60";
        st = st.replace(',','.');
        String result = "A nova forma do número é: " + st;
        JOptionPane.showMessageDialog(null,result,"Exemplo replace",-1);
    }
    
}
