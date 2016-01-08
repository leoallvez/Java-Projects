/*
 * Esse Programa implementa as estruras de dados pilhas e filas.
 */
package meuexe.pkg018.estruturadedados;

import javax.swing.JOptionPane;

/**
 * Estrutura de Dados
 * @author Leonardo Pereira Alves.
 * @version 11.03.15
 */
public class ProgramaPrincinpal {
    
    public static void main(String[] args) {
        
        int n;
        String s;
    
        String x = JOptionPane.showInputDialog(null,"Digite a notação Infixa: ","Entrada",-1);
        if(x == null){
            s = "Fim do programa!";   
        }else{
            /**Criar variavel de referencia a objeto e alocar espaço na
             * memoria basedo na quantidade de elementos da operação, ou seja
             * a pilha terar exatamente o espaço maximo necessario.
             */
            n = x.length(); //Comprimento de x em n
            // Alocação dinamica, a pilha tem exatamente o tamanho necessario.
            NotacaoPolonesaReversa k = new NotacaoPolonesaReversa(n);
            s = "Notação Infixa: "+x+"\nNotação Pósfixa: "+k.posfixa(x); 
        }
        JOptionPane.showMessageDialog(null,s,"Saida: ",-1);
        System.exit(0);
    }//Fim do main
}//Fim da classe programa principal.
