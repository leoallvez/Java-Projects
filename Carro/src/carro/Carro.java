package carro;
/**
 *
 * @author Leonardo Pereira Alves.
 * @version 28-12-14
 */
public class Carro {
    String cor;
    String modelo;
    double velocidadeAtual;
    double velocidadeMaxima;
    //liga o carro
    void liga(){
        System.out.println("O carro esta ligado");
    }
    //acelera uma certa quantidade
    void acelera (double quantidade){
        this.velocidadeAtual += quantidade;
    }
    //devolve a marcha do carro
    int pegarMarcha(){
        if (this.velocidadeAtual < 0){
            return -1;
        }
        if (this.velocidadeAtual >= 0 && this.velocidadeAtual < 40){
            return 1;
        }
        if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80){
            return 2;
        }
        return 3;
    }
    void mostra(){
        System.out.println("Cor: "+this.cor);
        System.out.println("Modelo: "+this.modelo);
        System.out.println("Velocidade Atual: "+this.velocidadeAtual);
        System.out.println("Velocidade Maxima: "+this.velocidadeMaxima);
        System.out.print("Marchar: "+pegarMarcha());
    }
    public static void main(String[] args) {
        Carro meuCarro = new Carro();
        meuCarro.cor = "Azul";
        meuCarro.modelo = "Fusca";
        meuCarro.velocidadeAtual = 10;
        meuCarro.velocidadeMaxima = 80;
        meuCarro.acelera(100);
        meuCarro.mostra();
        
        
        
    } 
}
