
package meuexe4;

/**
 * Esse programa mostra a utilização do incremento.
 * @author Leonardo Pereira Alves.
 * @version 18.02.2015
 */
public class Increment {
    public static void main(String[] args) {
        
        int c;
        
        //demonstra o operador de pós-incremento.
        c = 5; // Atribui 5 à variàvel c.
        System.out.println(c);    //imprime 5
        System.out.println(c++);  //imprime 5 e pós-incrementa.
        System.out.println(c);    //imprime 6
        
        System.out.println(); //pula uma linha.
        
        c = 5; // Atribui 5 à variàvel c.
        System.out.println(c);    //imprime 6
        System.out.println(++c);  //pré-incrementa e imprime 6.
        System.out.println(c);    //imprime 6 
    }//fim de main
}// fim da classe Increment
