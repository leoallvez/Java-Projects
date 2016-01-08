package pessoa;
public class Pessoa {
    String nome;
    int idade;
    
    void fazNiver(){
        idade++;
    }
    
    void mostra (){
        System.out.println("Nome: "+this.nome);
        System.out.println("idade: "+this.idade);
    }
    
    public static void main(String[] args) {
        Pessoa a = new Pessoa();
        Pessoa[] b = new Pessoa[10];
        a.nome = "Léo";
        a.idade = 32;
        a.mostra();
        a.fazNiver();
        a.mostra();
        a.fazNiver();
        a.fazNiver();
        a.mostra();
    } 
}
