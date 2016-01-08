package meuexe8.numeromaior;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves.
 * @version 17.02.2015
 */
public class Programa {

    public static void main(String[] args) {
        
        Busca numero = new Busca();
        int n;
        int m = 0;
        String N;
        
        for(int i = 0; i < 9; i++){
            N = JOptionPane.showInputDialog(m +" é o maior Entre com um número: ");
            if (N != null){
                n = Integer.parseInt(N);
                m = numero.ComparaSeMaior(n);
            }else{break;}
        }
        JOptionPane.showMessageDialog(null,"Número maior: " + m);
    }
}
