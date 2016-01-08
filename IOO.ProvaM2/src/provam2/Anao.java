package provam2;

public class Anao {
    protected String nome;
    protected double altura;
    
    public Anao(String nome, double altura){
        this.nome = nome;
        if(altura <= 1.50){
            this.altura = altura;
        }else{
            System.out.print("não é possivel existir anão com essa altura");
        }
    }
}
