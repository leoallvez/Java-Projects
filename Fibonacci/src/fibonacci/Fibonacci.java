package fibonacci;
/**
 *
 * @author Leonardo Pereira Alves
 * @version 28-12-2014
 */
public class Fibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        while (a < 150){
            System.out.println(a);
            System.out.println(b);
            a = a + b;
            b = b + a;
        }
    }
}
