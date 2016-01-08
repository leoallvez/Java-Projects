/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe1;

import java.util.Scanner; //programa utiliza Scanner.

/**
 *
 * @author Leonardo
 */
public class MeuExe1 {
    
    public static void main(String[] args) {
        Account account1 = new Account(50.00);
        Account account2 = new Account(-7.53);
        // Exibe o saldo inicial de cada objeto.
        System.out.println("Conta 1 Saldo: " + account1.getBalance());
        System.out.println("Conta 2 Saldo: " + account2.getBalance());
        // Cria Scanner para obter entrada a patir da janela de comando.
        Scanner input = new Scanner(System.in);
        
        System.out.println("Entre com um deposito para a Conta 1: ");
        double depositAmount = input.nextDouble(); //Entrada do usuário.
        account1.credit(depositAmount); 
   
        System.out.println("Conta 1 saldo: " + account1.getBalance());
    } 
}
