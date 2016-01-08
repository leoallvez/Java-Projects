package array;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 01-01-2015
 */
public class Array {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        String resp = "";
        String p = "";
        while(resp != " "){
            System.out.println("Digite algo: ");
            p = in.next();
            a.add(p);// Adicionand na ArrayList.
            System.out.println("Deseja continuar?: ");
            resp = in.next();
        }
    }
}
