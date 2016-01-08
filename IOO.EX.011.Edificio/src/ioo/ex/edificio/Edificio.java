package ioo.ex.edificio;
/**
 * Implentação orientada a objeto.
 * @author Leonardo Pereira Alves
 * @version 26/04/2015
 */
public class Edificio {
    private String cor;
    private static int totalDePortas;
    private int totalDeAndares;
    public Porta[] porta;
    //Construto da classe
    public Edificio(int n){
        this.cor = "Branco";
        this.totalDeAndares = 1;
        this.porta = new Porta[n]; //Reservando espaço para n portas
    }
    //Medoto de pintar porta.
    public void pintar(String cor){
        this.cor = cor;
    }
    //Metodo de regasta cor da porta
    public String getCor(){
        return this.cor;
    }
    //Metodo de adicionar porta.
    public void adicionarPorta(Porta p){
        porta[this.totalDePortas] = p;
        this.totalDePortas++;
    }
    //Metodo retorna quantas portas estão abertas.
    public int quantasPortasEstaoAbertas(){
        int x = 0;
        for(int i = 0; i < totalDePortas; i++){
            if(porta[i].estaAberta()){
                x++;
            }
        }
        return x;
    }
    //Metodo retorna total de portas.
    public int totalDePortas(){
        return this.totalDePortas;
    }
    
    public void adicionarAndar(){
        this.totalDeAndares++;
    }
    //Metodo retorna total de andades.
    public int totalDeAndares(){
        return this.totalDeAndares;
    }
    //Metodo mostra status dos atributos.
    public void mostrar(){
        System.out.println();
        System.out.println("Status edificio");
        System.out.println("Cor: "+getCor());
        System.out.println("Total de portas "+totalDePortas());
        System.out.println("Portas abertas: "+quantasPortasEstaoAbertas());
        System.out.println("Total de Andares: "+totalDeAndares());
    }
    
}
