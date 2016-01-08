package testeframe;

import javax.swing.JFrame;

/* Esse programa cria uma janela que é criada por uma variavel instanciada
   na classe JFrame.
 * @author Leonardo Pareira Alves.
 * @version 22.03.15
 */
public class TesteFrame {
    //metodo main.
    public static void main(String[] args) {
        // Criar a variavel janela e istancia-la à JFrame
        JFrame janela = new JFrame("Titulo");
        // Criar uma variavel de Painel e instanciar a classe Painel.
        Painel painel = new Painel();
        // Finalizar o programa ao fechar a janela.
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // De finir o tamanho da janela.
        janela.setSize(260,180);
        // Adicionar painel a janela.
        janela.add(painel);
        // Tornar a janela visivel.
        janela.setVisible(true);
    }
}
