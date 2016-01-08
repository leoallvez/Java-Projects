/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nascimento;
import java.util.Scanner;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 29-12-2014
 */
public class Nascimento {
    public static void main(String[] args) {
        int idAtual, id2028, anoAtual, anoNasc;
        String a = " ";
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o ano atual: ");
        anoAtual = input.nextInt();
        System.out.print("Digite o ano de nascimento: ");
        anoNasc = input.nextInt();
        
        idAtual = anoAtual - anoNasc;
        id2028 = 2028 - anoNasc;
        
        System.out.printf("\nSua idade é: %d", idAtual);
        System.out.printf("\nSua idade em 2028 é: %d", id2028);
    }
}
