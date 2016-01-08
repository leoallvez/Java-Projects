package iooex004.soma;

/**
 * Implementação orientada a objeto.
 * @author Leonardo Pereira Alves.
 * @version 11.03.15
 */
public class IOOEX004Soma {

    public static void main(String[] args) {
        int soma = 0;
       
        for(int i = 1; i <= 100; i++){
            soma = soma + i;
        }
        
        System.out.println("O Resultado é: "+soma);
    }
}
