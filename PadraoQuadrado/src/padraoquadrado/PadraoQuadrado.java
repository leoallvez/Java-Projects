package padraoquadrado;

/**
 * Esse programa imprime um padrão quadrado
 * @author Leonardo Pereira Alves.
 * @version 08/02/2015
 */
public class PadraoQuadrado {
    public static void main(String[] args) {
        for(int l = 0; l < 9; l++ ){
            for(int c = 0; c < 9; c++){
                if (l == 0 | c == 0 | l == 8 | c == 8){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}