package teste;
/**
 *
 * @author Leonardo Pereira Alves.
 * 
 */
abstract class Funcionario{
    protected String nome;
    protected String cpf;
    protected double salario;
    abstract void teste();
}
interface Autenticavel{
    boolean autentica (int senha);
}
class Gerente extends Funcionario implements Autenticavel{
    int senha;
    public boolean autentica (int senha){
        if(this.senha == senha){
            System.out.println("Acesso Permitido!");
            return true;
        }else{
            System.out.println("Acesso Negado!");
            return false;
        }
    }
    void teste(){System.out.println("Ola");}
}
class X extends Funcionario implements Autenticavel{
    void teste(){
       
    }
    @Override
    public boolean autentica (int senha){
        if (senha > 5){
            senha = 3;
            return true;       
        }else{
            senha = 10;
            return true;
        }
    }
}
public class Teste {
    public static void main(String[] args) {
        Gerente x = new Gerente();
        x.nome = "Leonardo";
    } 
}
