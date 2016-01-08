package tabelademultiplicacao;
/**
 *
 * @author Leonardo Pereira Alves.
 * @version 27-12-14
 */
public class TabelaDeMultiplicacao {
    private void exibeTabelaDeMultiplicacao (final int n){
        int contador = 1;
        System.out.println("O número "+n+" é multiplicado na tabela");
        while (contador < 11){ //Exibe de 2 a 12
            System.out.print (contador+" x "+n);
            System.out.println (" = "+contador * n);
            contador++;
        }
    }
    private void calculaTabela(int x){
        if ((x < 2) || ( x > 12)) {
            System.out.println ("Não é possivel exibir essa tabela");
        }else{
            exibeTabelaDeMultiplicacao(x);} // Um metodo camando outro
    }
    public static void main(String[] args) {
        final TabelaDeMultiplicacao objeto = new TabelaDeMultiplicacao();
        objeto.calculaTabela(12);
    }     
}
