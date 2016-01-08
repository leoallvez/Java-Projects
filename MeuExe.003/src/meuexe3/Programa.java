package meuexe3;
import javax.swing.JOptionPane;
/**
 * Esse programa soma dois números e exibe o resultado usando os metodos 
 * da classe JOptionPane
 * @author Leonardo Pereira Alves.
 * @version 17.02.2015
 */
public class Programa {
    public static void main(String[] args){
        // Declaração de váriaveis.
        String a;
        String b;
        int n1;
        int n2;
        // Entradas
        a = JOptionPane.showInputDialog("Primeiro inteiro: ");
        if(a != null){
            n1 = Integer.parseInt(a); // Convertendo string em inteiro.
            b = JOptionPane.showInputDialog("Segundo inteiro: ");
            if (b != null){
                n2 = Integer.parseInt(b); // Convertendo string em inteiro.
                //Calculo.
                int soma = n1 + n2;
                //Saida.
                JOptionPane.showMessageDialog(null,"Total: " + soma);
            }else{
                JOptionPane.showMessageDialog(null,"Fim do programa");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Fim do programa");
        }
    }//Fim do metodo main.
}//Fim da classe Programa.
