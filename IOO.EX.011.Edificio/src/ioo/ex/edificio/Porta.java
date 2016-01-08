package ioo.ex.edificio;

/**
 * Implentação orientada a objeto.
 * Essa classe implenta uma porta.
 * @author Leonardo Pereira Alves
 * @version 26/04/2015
 * 
 */
public class Porta {
    // Declaração dos atributos da classse
    private boolean aberta;
    private String cor;
    private double dimensaoX, dimensaoY, dimensaoZ;
    
    // Construtor da classe inicializando os atributos.
    public Porta(){
        this.aberta = false;
        this.cor = "Branca";
        this.dimensaoX = 2.0;
        this.dimensaoY = 1.0;
        this.dimensaoZ = 1.0;
    }
    // Declaração dos metodos da classe
    
    // Esse metodo abre a porta.
    public void abre(){
        this.aberta = true;
    }
    // Esse metodo fecha a porta
    public void fecha(){
        this.aberta = false;
    }
    // Esse metodo muda a cor da porta
    public void pinta(String cor){
        this.cor = cor;
    }
    // Esse metodo retorna o status da cor da porta.
    public String getCor(){
        return this.cor;
    }
    // Esse metodo atribui valores aos atributos de dimensão da porta.
    public void setDimensoes(double x, double y, double z){
        this.dimensaoX = x;
        this.dimensaoY = y;
        this.dimensaoZ = z;
    }
    // Esse metodo retorna se a porta esta aberta ou fechada.
    public boolean estaAberta(){
        return aberta == true;
    }
    // Esse metodo mostra os status dos atributos da classe.
    public void mostrar(){
        System.out.println();
        System.out.println("Status da Porta");
        if(estaAberta())
            System.out.println("Porta Aberta");
        else
            System.out.println("Porta Fechada");
        System.out.println("Cor "+getCor());
        System.out.println("Dimensões "+dimensaoX+" x "+dimensaoY+" x "+dimensaoZ);
    }
}
