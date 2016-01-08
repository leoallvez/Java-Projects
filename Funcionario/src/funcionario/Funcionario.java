package funcionario;
import java.util.Scanner;
/**
 * @author Creative Machines
 * @version 31-12-2014
 *
 
 */
public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private String entrada;
    private String rg;
    private boolean status;
    Scanner in = new Scanner(System.in);
    public void bonificar (double valor){
        this.salario = this.salario + valor;
    }
    public void demite (){
        this.status = false;
    }
    public void mostrar (){
        System.out.println ("Nome: "+this.nome);
        System.out.println ("Departamento: "+this.departamento);
        System.out.println ("Salario: "+salario);
        System.out.println ("Data de entrada: "+this.entrada);
        System.out.println ("Rg: "+this.rg);
        System.out.println ("Status do funcinario: "+this.status);
    }
    public void entrada(){
        System.out.print("Digite o nome: ");
        this.nome = in.next();
        System.out.print("Digite o departamento: ");
        this.departamento = in.next();
        System.out.print("Digite a entrada: ");
        this.entrada = in.next();
        System.out.print("Digite o Rg: ");
        this.rg = in.next();
    }
    public static class X {
        String teste;
    }
    public static void main(String[] args) {
        Funcionario func1 = new Funcionario();
        Funcionario func2 = new Funcionario();
        X t = new X();
        
        t.teste = "Leo";
        
        func1.entrada();
        
        func1.mostrar();
        func1.bonificar(100.00);
        func1.mostrar();
        func1.demite();
        func1.mostrar();
        func2.mostrar();
    } 
}
