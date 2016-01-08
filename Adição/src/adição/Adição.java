/*
 * Programa de adição que exibe a soma de dois números.
 */
package adição; // programa utiliza a classe Scanner.

import java.util.Scanner;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 08/02/2015
 */
public class Adição {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // cria um Scanner para obter entrada da janela de comando
        Scanner input = new Scanner(System.in);
        
        int numero1; // primeiro número a adcionar
        int numero2; // segundo número a adcionar
        int soma; // soma de numero1 e numero2
        
        System.out.print("Entrer com o primeiro inteiro: ");
        numero1 = input.nextInt(); // lê o primeiro número fornecido pelo usuário
        
        System.out.print("Entrer com o segundo unteiro: ");
        numero2 = input.nextInt(); // lê o segundo número fornecido pelo usuário
        
        soma = numero1 + numero2; // soma os dois números e armazena na váriavel soma
        
        System.out.print("A soma de " + numero1 + " + " + numero2 + " é: " + soma);  
    }
}
