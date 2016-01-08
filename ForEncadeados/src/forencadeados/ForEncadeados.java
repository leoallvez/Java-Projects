package forencadeados;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 28-12-2014
 */
public class ForEncadeados {
    public static void main(String[] args) {
        for (int a = 1; a < 9; a++){
            for(int b = 1; b <= a; b++){
                System.out.print(a*b+" ");
            }
            System.out.println(" ");
        }
    }
}
