package av_ex010_xadrez;

import javax.swing.JFrame;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class ProgramaPrincipal {

    public static void main(String[] args) {
        Xadrez janela = new Xadrez();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}
