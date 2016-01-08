package av_ex004;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves.
 * @version 23.02.15
 */
public class Programa {
    public static void main(String[] args){
       // Criando uma istancia da classe Calculadora.
       Calculadora x = new Calculadora();
       // Declaração de variaveis.
       int num1;
       int num2;
       int soma;
       //Chamando os metodos da referencia ao objeto x
       num1 = x.setVal1();
       num2 = x.setVal2();
       
       soma = x.soma(num1, num2);
       
       JOptionPane.showMessageDialog(null,"A soma é: " + soma); 
    } 
}
