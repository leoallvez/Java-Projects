package ioo.ex.pkg010.casa;
/**
 * Implentação orientada a objeto.
 * @author Leonardo Pereira Alves
 * @version 26/04/2015
 * 
 */
public class Casa {
    // Atributos da classe Casa
    private String cor;
    public final Porta[] porta; //Declarando um array do tipo porta
    // Construtor da classe Casa.
    
    public Casa(int n){ // Parametro para definir a quantidade de portas da casa.
        this.cor = "Branca";
        porta = new Porta[n]; // Instanciando tamanho do array.
        
        for(int i = 0; i < porta.length ; i++){ // Criando um objeto do tipo Porta para cada array.
            this.porta[i] = new Porta();
        }
    }
    // Esse metodo pinta a casa.
    public void pintar(String cor){
        this.cor = cor;
    }
    // Esse metodo retorna a cor da casa
    public String getCor(){
        return this.cor;
    }
    //Esse metodo retorna a quantidade de porta abertas. 
    public int quantasPortasEstaoAbertas(){
        int x = 0;
        for(int i = 0; i < porta.length; i++){
            if(this.porta[i].estaAberta()){
                x++;
            }
        }
        return x; 
    }
    public int quantasPortasEstaoFechadas(){
        int x = 0;
        for(int i = 0; i < porta.length; i++){
            if(!this.porta[i].estaAberta()){
                x++;
            }
        }
        return x; 
    }
    
    
    
    public int totalDePortas(){
        return porta.length;
    }
    
    public void mostrar(){
        System.out.println();
        System.out.println("Status Casa");
        System.out.println("Cor da casa "+getCor());
        System.out.println("Quantidade de portas "+totalDePortas());
        System.out.println("Portas abertas "+quantasPortasEstaoAbertas());
        System.out.println("Portas fechadas "+quantasPortasEstaoFechadas());
        for(int i = 0; i < porta.length; i++){
            this.porta[i].mostrar();
        }
    }
}
