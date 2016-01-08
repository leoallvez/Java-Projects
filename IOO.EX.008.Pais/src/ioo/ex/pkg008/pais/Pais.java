
package ioo.ex.pkg008.pais;

/**
 * Implentação orientada a objeto.
 * Essa classe define um pais, e ultiliza encapsulamento dos atributos que são
 * manitulados pelos metodos get e set
 * @author Leonardo Pereira Alves
 * @version 24/04/2015
 * 
 */
public class Pais {
    //Declaração privada dos atributos.
    private String nomeDoPais;
    private String nomeDaCapital;
    private double dimensaoDoPais;
    private double populacao;
    private Pais limite;
    // Esse construtor é ultilizado para não atribuir nenhum valor aos atributos
    public Pais(){}
    /** Esse construtor é usado para atribuir valor aos atributos da classe,
     *  você pode escolher qualquer um dos construtores pois um sub-escreve o
     *  outro dependendo da forma que você usar o construtor para criar um 
     *  objeto.
     */
    
    // Pais Brasil = new Pais("Brasiil","Brasilia",10.000,1000.00); Inicializando;
    // Pais Brasil = new Pais(); metodo oco;
    public Pais(String nome, String capital, double dimensao,double populacao, Pais limite){
        this.nomeDoPais = nome;
        this.nomeDaCapital = capital;
        this.dimensaoDoPais = dimensao;
        this.populacao = populacao;
        this.limite = limite;
    }
    
    public Pais(String nome, String capital, double dimensao,double populacao){
        this.nomeDoPais = nome;
        this.nomeDaCapital = capital;
        this.dimensaoDoPais = dimensao;
        this.populacao = populacao;
    }
    // Esse metodo coloca o nome no pais.
    public void setNomeDoPais(String nomeDoPais){
        this.nomeDoPais = nomeDoPais;
    }
    // Esse metodo vê qual é o nome do pais.
    public String getNomeDoPais(){
        return this.nomeDoPais;
    }
    // Esse metodo vê qual é o nome da capital.
    public String getNomeDaCapital() {
        return this.nomeDaCapital;
    }
    // Esse metodo coloca o nome na capital.
    public void setNomeDaCapital(String nomeDaCapital) {
        this.nomeDaCapital = nomeDaCapital;
    }
    // Esse metodo vê qual é a dimenção do país.
    public double getDimencaoDoPais() {
        return this.dimensaoDoPais;
    }
    // Esse metodo coloca a dimeção no país
    public void setDimencaoDoPais(double dimensaoDoPais) {
        this.dimensaoDoPais = dimensaoDoPais;
    }
     public double getPopulacao() {
        return this.populacao;
    }

    public void setPopulacao(double populacao) {
        this.populacao = populacao;
    }
    public String getNomeDoLimite(){
        return this.limite.nomeDoPais; 
    }
    // Metodo mostrar os valores do atributos.
    public void mostrar(){
        System.out.println();
        System.out.println("Nome do País............: "+getNomeDoPais());
        System.out.println("Nome da Capital.........: "+getNomeDaCapital());
        System.out.println("Dimensão do País........: "+getDimencaoDoPais());
        System.out.println("População...............: "+getPopulacao());
        System.out.println("Limite..................: "+getNomeDoLimite());
        System.out.println();
    }
}
