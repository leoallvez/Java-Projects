package meuexe7;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 18.02.2015
 */
public class Principal {
    public static void main(String[] args) {
        double totCompra = 0;
        double comissao;
        double saldoSemanal;
        int i = 1;
        String a = "";
        while(a != null){
            a = JOptionPane.showInputDialog("Valor do item "+ i +": ");
            if (a != null){
                totCompra = Double.parseDouble(a);
                i++;
            }else{JOptionPane.showMessageDialog(null,"Fim das compras!");}
        }
        
        comissao = (totCompra / 100) * 9;
        
        saldoSemanal = comissao + 200;
        JOptionPane.showMessageDialog(null,"Redimentos: "+saldoSemanal);
    }
}
