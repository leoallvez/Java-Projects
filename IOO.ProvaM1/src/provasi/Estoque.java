package provasi;

/**
 *
 * @author 12141100130
 */
public class Estoque {
    private String nomeDaPeca;
    private int quantAtual, quantMinima;
    
    public void definirQuantAtual(int quant){
        if(quant > 0){
            quantAtual = quant;
        }else{
            System.out.println("Não é possivel definir essa quantidade");
        }
    }
    
    public void definirQuantMinima (int quant){
        if(quant > 0){
            quantMinima = quant;
        }else{
            System.out.println("Não é possivel definir essa quantidade");
        }
    }
    
    public void baixarPeca(int quant){
        if(quant <= quantAtual){
            quantAtual = quantAtual - quant;
        }else{
            System.out.println("Não é possivel retirar essa quantidade");
        
        }
    }
    
    public boolean verificarReposicao(){
        return (quantAtual < quantMinima);
    }
    
    public void comprar(int quant){
        quantAtual = quantAtual + quant;
    
    }
    
    public void mostrar(){
        System.out.println("Nome da peça: "+nomeDaPeca);
        System.out.println("Quantidade Atual: "+quantAtual);
        System.out.println("Quantidade Minima: "+quantMinima);
        if(verificarReposicao() == true){
            System.out.print("É necessario repor está peça");
        }
    }
      
    
    
}
