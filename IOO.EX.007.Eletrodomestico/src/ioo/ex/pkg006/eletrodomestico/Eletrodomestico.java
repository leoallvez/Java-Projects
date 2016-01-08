package ioo.ex.pkg006.eletrodomestico;

public class Eletrodomestico {
    
    boolean ligado;
    String tipo, marca;
    int tensao,velocidade;
    
    void ligar(){
        ligado = true;
    }
    
    void deligar(){
        ligado = false;
        velocidade = 0;
    }
    
    void mudarVelocidade(int velocParam){
        if(velocParam < 0)
            System.out.println("Velocidade invalida!");
        else
            velocidade = velocParam;
    }
    
    void mudarTensao(){
        if(tensao == 110)
            tensao = 220;
        else
            tensao = 110;
    }
    
    void mostrar(){
        System.out.println("----ELETRODOMESTICO----");
        System.out.println("--Ligado: "+mostrarDescLigadoDesligado());
        System.out.println("--Tipo: "+tipo);
        System.out.println("--Marca: "+marca);
        System.out.println("--Tensão: "+tensao);
        System.out.println("-----------------------");  
    }
    
    String mostrarDescLigadoDesligado(){
        if(ligado)
            return "SIM";
        else
            return "NAO";
    }
}
