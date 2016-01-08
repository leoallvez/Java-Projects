package meuexe5.gui;
import javax.swing.JFrame;

/**
 * Esse programa demonstra o suporte gráfico do java.
 * @author Leonardo Pereira Alves
 * @version 18.02.2015
 */
public class MeuExe5GUI {
    public static void main(String[] args) {
        //cria um novo painel que contem o nosso desenho.
        DrawPanel panel = new DrawPanel();
        
        //cria um novo quadro para armazenar o painel.
        JFrame application = new JFrame();
        
        //configura o frame para ser encerrado quando ele é fechado
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        application.add(panel); //adiciona o painel ao frame
        application.setSize(250,250); // configura o tamanho do frame
        application.setVisible(true); // torna o frame visivel
    }
}
