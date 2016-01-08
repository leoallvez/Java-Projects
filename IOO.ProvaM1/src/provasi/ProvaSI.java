package provasi;


public class ProvaSI {

  
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente();
        
        conta1.criarConta(100);
        conta1.definirNome("Leonardo Pereira");
        conta1.definirNumeroDaConta(12345);
        conta1.cederLimite();
        conta1.mostrarExtrato();
        conta1.sacar(100);
        conta1.mostrarExtrato();
        conta1.depositar(-9);
        
        Estoque peca1 = new Estoque();
        
        peca1.definirQuantAtual(10);
        peca1.definirQuantMinima(5);
        peca1.baixarPeca(6);
        peca1.comprar(6);
        peca1.mostrar();
        
        
        
    }
    
}
