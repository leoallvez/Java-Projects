/*
 * Programa que desennha na tela um padrão na tela.
 */
package padraotabuleiro;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 08/02/2015
 */
public class PadraoTabuleiro{

    public static void main(String[] args){
        for (int l = 0; l < 16; l++){
            
            for (int c = 0; c < 16; c++){
                
                if( (l + c ) % 2 == 0){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        } // Fim do for l
    } // Fim do for c
} // Fim da classe PadraoTabuleiro
