package entradastring;
import java.util.Scanner;


/**
 * Programa com entrada de String pelo usuario.
 * @author Leonardo Pereira Alves.
 * @version 29-12-2014
 */
public class EntradaString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite alguma coisa: ");
        String a = in.next();
        System.out.println("Você digitou: "+a);
        
    } 
}
