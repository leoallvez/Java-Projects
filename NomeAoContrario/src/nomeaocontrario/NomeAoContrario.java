/*
 * Esse programa imprime o nome ao contrario
 */
package nomeaocontrario;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class NomeAoContrario{ 
    public static void main(String[] args) {
        String nome = "leonardo";
        int i; 
        System.out.print (nome);
        i = nome.length(); 
        System.out.print(i);
        
        String nomeContrario = "";
        
        for(int a = i; a == 0; a--){
            nomeContrario = nomeContrario + nome.charAt(a);   
            System.out.println(); 
        }
        System.out.print(nomeContrario);
    }
}
