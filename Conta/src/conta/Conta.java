/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conta;
class Conta {
    int numero;
    String dono;
    double saldo;
    double limite;
    void imprimeBanco(){
        System.out.print("Essa conta é do banco J.");
    } 
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }
    void deposita (double quantidade){
        this.saldo += quantidade; // Saldo recebe saldo mais quantidade.
    }
    boolean saque (double valor){
        if (this.saldo < valor){
            return false;           
        }else{
            this.saldo = this.saldo - valor;
            return true;
        }     
    }
    void transfere (Conta destino, double valor){
        this.saldo = this.saldo - valor;
        destino.saldo = destino.saldo + valor;
    }
    public static void main (String[] args){
        Conta Conta1 = new Conta();
        Conta Conta2 = new Conta();
        Conta1.dono = "Leonardo Pereira Alves";
        Conta1.saldo = 1000.0;
        Conta1.limite = 3000.0;
        Conta1.deposita(1000.0);
        System.out.println("O saldo atual é Conta1: "+Conta1.saldo);
        Conta1.saca(200);
        System.out.println("O saldo atual é Conta1: "+Conta1.saldo); 
        boolean consegui = Conta1.saque(10000.0);
        System.out.println(consegui);
        Conta1.transfere(Conta2, 1000);
        System.out.println("O saldo atual é Conta1: "+Conta1.saldo);
        System.out.println("O saldo atual é Conta2: "+Conta2.saldo);
        Conta1 = Conta2;
        Conta1.saldo = 100.0; 
        System.out.println("O saldo atual é Conta2: "+Conta2.saldo);
        
    }   
}