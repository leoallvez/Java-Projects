package meuexe2;

import javax.swing.JOptionPane; //Importa a classe OptionPane.

/**
 * Esse programa é um estudo sobre interface no java
 * @author Leonardo Alves.
 * @version 17.02.2015
 */
public class Programa {
    public static void main(String[] args) {
        //exibe um dialogo com uma mensagem.
        JOptionPane.showMessageDialog(null,"Welcome\nto\nJava");
        //pede para o usuario inserir seu nome.
        String nome = JOptionPane.showInputDialog("Whats is your name?: ");
        //cria mensagem de saudação.
        if (nome != null){
            JOptionPane.showMessageDialog(null,"Welcame "+ nome);
        }
        
    }// Fim do main   
}// fim da classe programa.
