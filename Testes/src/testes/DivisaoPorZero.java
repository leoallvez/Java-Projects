package testes;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class DivisaoPorZero {
    
    public static int quociente(int numerador, int denominador){
        return numerador / denominador;
    }
    
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in); //Scanner para entrada de dados
        boolean continueLoop = true;
        do{
            try{
            
                System.out.println("Entre com um inteiro numerador: ");
                int numerador = scanner.nextInt();
                System.out.println("Entre com um inteiro denominador: ");
                int denominador = scanner.nextInt();
        
                int resultado = quociente(numerador, denominador);
                System.out.println(numerador+" / "+denominador+" = "+resultado);
                continueLoop = false;
            }catch(InputMismatchException i){
                System.err.printf("\nExceção: %s\n", i);
                scanner.nextLine();
                System.out.println("Por favor entre com um número inteiro");
            }catch(ArithmeticException a){
                System.err.printf("\nExceção: %s\n", a);
                System.out.println("Zero  não pode ser um denominador tente novamente");
            }
        }while(continueLoop);
    }
    
}
