package smiley;

import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MainSmiley {

    public static void main(String[] args) {
        DrawSmiley painel = new DrawSmiley();
        JFrame aplicacao = new JFrame();
        
        aplicacao.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacao.setLayout(new BorderLayout());
        aplicacao.add(painel, BorderLayout.CENTER);
        aplicacao.setSize(230,250);
        aplicacao.setVisible(true);
        aplicacao.setResizable(false);
    }
    
}
