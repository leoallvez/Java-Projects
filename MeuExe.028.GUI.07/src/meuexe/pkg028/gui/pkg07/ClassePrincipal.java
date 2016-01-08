package meuexe.pkg028.gui.pkg07;

import javax.swing.JFrame;

/**
 * @author Leonardo Pereira Alves
 * @version 02/04/2015
 */
public class ClassePrincipal {

    public static void main(String[] args) {
        Interface janela = new Interface();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
        janela.pack();
        janela.setResizable(false);
        janela.setSize(550,350);    
    }
}
