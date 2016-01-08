package provasi;

public class ContaCorrente {
    private String nomeDoCorrentista; 
    private int numeroDaConta;
    private double saldo, limite;
    
    public void definirNome(String nome){
        nomeDoCorrentista = nome;
    }
    
    public void definirNumeroDaConta(int numero){
        numeroDaConta = numero;
    
    }
    
    public void criarConta (double saldoInicial){    
        saldo = saldoInicial;
         
    }
    
    public void cederLimite(){
        if(saldo > 0.0){
            limite = saldo * 0.30;
        }else{
            System.out.println("Não é possivel ceder limite");
        }
    }
    
    public void sacar(double quantia){
        if(quantia <= saldo + limite){
            saldo = saldo - quantia;
        
        }else{
            System.out.print("Não é possivel sacar.");
        
        }
    }
    
    public void depositar (double quantia){
        if(quantia > 0){
            saldo = saldo + quantia;
        }else{
            System.out.println("Não é possivel depositar essa quantia");
                
        }
        
    }   
    
    public void mostrarExtrato(){
        System.out.println("------------Extrato---------------");
        System.out.println("Nome do cliente: "+nomeDoCorrentista);
        System.out.println("Número da conta: "+numeroDaConta);
        System.out.println("Saldo: "+saldo);
        System.out.println("Limite: "+limite);
    }
}
