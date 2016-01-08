package banco;
/**
 *
 * @author Leonardo Pereira Alves
 * @version 24.12.14
 */
class Banco implements NewInterface {
    
    private int numero; // Controle de acesso privado atributo.
    private String dono;
    private double saldo;
    private double limite;
    private static int numeroDaConta; // Atributo privado e estatico.
    @Override
    public void imprimeBanco(){// Controle de acesso publico. 
        System.out.println("Essa conta é do banco J.");
    } 
    @Override
    public void saca(double quantidade){ 
        if (quantidade > this.saldo + this.limite){
            System.out.println("Não é possivel saca essa quantidade");
        }else{
            if (quantidade >= this.saldo ){
                this.saldo -= quantidade;
            }else{
                this.limite -= quantidade;
            }
        }
    }
    @Override
    public void deposita (double quantidade){
        if (quantidade < 0){
            System.out.print("Não é possivel depositar essa quantidade");
        }else{
            this.saldo += quantidade;
        }
    } 
    @Override
    public void transfere (Banco destino, double valor){
        this.saca(valor); // Metodos dentro de metodos
        destino.deposita(valor);
    }
    @Override
    public void mostra (){
        this.imprimeBanco();
        System.out.println("Nome: "+this.dono);
        System.out.println ("Saldo: "+this.saldo);
        System.out.println("Limite: "+this.limite);
        System.out.println ("Número de contas criadas "+numeroDaConta);
    }
    private class Cliente{
        String nome;
    }
    Banco(){
        numeroDaConta = numeroDaConta + 1;
    } 
    public static void main(String[] args) {
        Banco conta1 = new Banco();
        Banco conta2 = new Banco();
        Banco conta3 = new Banco();
        conta1.dono = "Leonardo Pereira Alves";
        conta1.saldo = 1000.00;
        conta1.limite = 3000.00;
        conta1.transfere(conta2,800.00); // Usando objeto como paramentro
        System.out.println("Saldo da conta2: "+conta2.saldo);
        conta2.mostra();
        conta2.transfere(conta1, 800.0);
        conta1.mostra();
        conta1.saca(200.0);
        conta1.mostra();
        conta3.mostra();
        
    }  
}
