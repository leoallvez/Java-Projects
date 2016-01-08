package maiorinteiro;
import java.util.Scanner;
/**
 * Programa imprime o maior de cinco números
 * @author Leonardo Pereira Alves.
 * @version 08/02/2015
 */
public class MaiorInteiro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a, b, c, d, e, maior;
        
        System.out.print("Entre com o 1° inteiro: ");
        a = input.nextInt();
        
        System.out.print("Entre com o 2° inteiro: ");
        b = input.nextInt();
        
        System.out.print("Entre com o 3° inteiro: ");
        c = input.nextInt();
        
        System.out.print("Entre com o 4° inteiro: ");
        d = input.nextInt();
        
        System.out.print("Entre com o 5° inteiro: ");
        e = input.nextInt();
        
        maior = 0;
        
        if (a > b){
            maior = a;
        }else{ 
            if (b < c){
                maior = c;
            }else{ maior = b;}
        }
        
        if( d > e && d > maior){
           maior = d; 
        }else{
            if( e > maior){
                maior = e;
            }
        }
        System.out.print("O maior número é: " + maior);     
    }
}
