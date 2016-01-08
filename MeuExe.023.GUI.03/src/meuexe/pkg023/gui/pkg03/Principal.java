
package meuexe.pkg023.gui.pkg03;

import javax.swing.JFrame;

public class Principal {

    public static void main(String[] args) {
        Interface janela = new Interface();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(350,100);
        janela.setVisible(true);
    } 
}
