package meuexe1;
/**
 *
 * @author Leonardo Pereira Alves.
 */
public class Account {
    private double balance; // Variável de instância que armazena o saldo.
    
    //Construtor
    public Account(double initialBalance){
        // Validar que initinalBalance é maior que 0.0;
        //se não, o saldo é inicializado como o valor padrão 0.0
        if(initialBalance > 0.0){
            balance = initialBalance;
        }
    }// Fim do construtor Account.
    
    //credita (adicionar) uma quantia à conta.
    public void credit (double amount){
        balance = balance + amount; // adiciona quantia a saldo.
    }// Fim do metodo credit.
    
    //retorna o salado da conta;
    public double getBalance(){
        return balance;
    }// Fim do metodo getBalance.  
}//Fim da classe Account.
