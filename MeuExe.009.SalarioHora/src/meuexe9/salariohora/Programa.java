package meuexe9.salariohora;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alve.
 * @version 18.02.2015
 */
public class Programa {
    public static void main(String[] args) {
        Pagamento fuc1 = new Pagamento();
        
        double sh;
        double pg;
        int ht;
        
        String a = "";
        String b = "";
        
        while(a != null && b != null){
            a = JOptionPane.showInputDialog("Digite o salario/hora: ");
            if(a != null){
                sh = Double.parseDouble(a);
                b = JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas: ");
                ht = Integer.parseInt(b);
            
                pg = fuc1.getPagamento(sh ,ht);
            
                JOptionPane.showMessageDialog(null,"Total a receber: " + pg);
            }
        }
    }
}
