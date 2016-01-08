package meuexe.pkg015.trycatchfinally;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 07.03.15
 */
public class Programa {

    public static void main(String[] args) {
        int result = Entrada.recebeDados();
        JOptionPane.showMessageDialog(null, "Total é "+ result, "Total", -1);
        
    }
    
}
