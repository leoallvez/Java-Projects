
package meuexe.pkg020.jframejpane;

import javax.swing.JFrame; // Importando JFrame do pacote swing.


/**
 *
 * @author Leonardo
 */
public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Criando um objeto janela que é uma instancia de JFrame.
        JFrame janela = new JFrame("Primeiro Frame java");
        // criando um objeto do tipo painel e chamar de "meuPainel"
        Painel meuPainel = new Painel();
        /**Adicionar esse JPanel em JFrame, usando o metodo add() que recebe
         * como argumento um JPanel.
         */
        janela.add(meuPainel);
        /**
         * O metodo setSize() recebe dois parametros como os pixels da janela
         * (horizontal e vertical).
         */
        janela.setSize(300,200);
       
        //Fechar a janela sem erro de execução.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        /**
         * Metodo setVisible() recebe um tipo borelano para que a janela seja 
         * visivel ou não.
         */
    
        janela.setVisible(true);
    }
}
