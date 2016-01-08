/*
 Estudo sobre herança, poliformismo e reescrista.
 */
package empresa;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 10/01/2015
 */
abstract class Funcionario{ // Super Classe
    private String nome; // Modificado protected só pode ser visivel pela 
    // propria classe ou subclasse.
    private String cpf;
    protected double salario;
    
    abstract public double getBonificacao(); // Método abstrato

    /**
     * @return the salario
     */
    public double getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(double salario) {
        this.salario = salario;
    }

    /**
     * @return the cpf
     */
    public String getCpf() {
        return cpf;
    }

    /**
     * @param cpf the cpf to set
     */
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
}
class Gerente extends Funcionario{  // Subclasse
    // A subclasse Gerente herda os atributos e 
    // metodos da superclasse Funcionário.
    int senha;
    
    public boolean autentica(int senha){
        if (this.senha == senha){
            System.out.print("Acesso permitido");
            return true;
        }else{
            System.out.print("Acesso negado");
            return false;
        }
    }
  
    public double getBonificacao(){ //Reecreve o metodo da superclasse.
        return this.salario * 0.15;
    }
}
class ControleDeBonificacoes{
    private double totalDeBonificacoes = 0;
    
    public void bonifica(Funcionario funcionario){
        this.totalDeBonificacoes += funcionario.getBonificacao();
    }
    
    public double getTotalDeBonificacoes(){
        return this.totalDeBonificacoes;
    }
}
public class Empresa {
    public static void main(String[] args) {
        Funcionario x = new Gerente();
        Funcionario xz = new Gerente();
        ControleDeBonificacoes a = new ControleDeBonificacoes();
        Gerente z = new Gerente();
        z.setSalario(5000.0);
        xz.setSalario(5000.0);
        System.out.println(xz.getBonificacao());
        a.bonifica(z);
        x.setSalario(1000.0);
        a.bonifica(x);
        System.out.println(a.getTotalDeBonificacoes()); 
    }  
}
