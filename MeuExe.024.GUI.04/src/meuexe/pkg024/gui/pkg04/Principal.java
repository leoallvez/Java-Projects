package meuexe.pkg024.gui.pkg04;

import javax.swing.JFrame;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 
 */
public class Principal {

    public static void main(String[] args) {
        Interface janela = new Interface();
        janela.setSize(280,170);
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
