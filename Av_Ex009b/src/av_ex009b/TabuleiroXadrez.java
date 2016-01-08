/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex009b;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author marcoaurelio
 */
public class TabuleiroXadrez extends JFrame {
    
    private JMenuBar barraMenu;
    private JMenu menuTabuleiro;
    private JMenuItem menuPreto, menuAzul, menuVermelho;
    
    private JPanel barraStatus;
    private JLabel lblStatus;
    
    private JPanel tabuleiro;
    private JPanel[] casasTabuleiro;
    
    public TabuleiroXadrez() {
        setBounds(100, 100, 800, 600);
        setTitle("UMChess");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // BARRA DE MENUS
        barraMenu = new JMenuBar();
        menuTabuleiro = new JMenu("Tabuleiro");
        menuPreto = new JMenuItem("Preto");
        menuVermelho = new JMenuItem("Vermelho");
        menuAzul = new JMenuItem("Azul");
                        
        menuTabuleiro.add(menuPreto);
        menuTabuleiro.add(menuVermelho);
        menuTabuleiro.add(menuAzul);
        
        barraMenu.add(menuTabuleiro);               
        
        getContentPane().add(barraMenu, BorderLayout.NORTH);                       
        
        // BARRA DE STATUS
        lblStatus = new JLabel("Ocioso");
        barraStatus = new JPanel();
        barraStatus.setLayout(new FlowLayout(FlowLayout.LEFT));        
        barraStatus.add(lblStatus);
        
        getContentPane().add(barraStatus, BorderLayout.SOUTH);
        
        // CASAS DO TABULEIRO
        tabuleiro = new JPanel();
        tabuleiro.setBackground(Color.GRAY);
        tabuleiro.setLayout(new GridLayout(8,8));
        
        casasTabuleiro = new JPanel[64];
        
        for (int i=0; i<64; i++) {
            casasTabuleiro[i] = new JPanel();            
            tabuleiro.add(casasTabuleiro[i]);
        }        
        MudarCorTabuleiro(Color.BLACK);        
        getContentPane().add(tabuleiro, BorderLayout.CENTER);
        
        menuPreto.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MudarCorTabuleiro(Color.BLACK);
            }
        });
        
        menuVermelho.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MudarCorTabuleiro(Color.RED);
            }
        });
        
        menuAzul.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                MudarCorTabuleiro(Color.BLUE);
            }
        });
        
        setVisible(true);
    }
    
    private void MudarCorTabuleiro(Color cor) {
        boolean  controle = true;
        
        for (int i=0; i<64; i++) {
            
            if (i % 8 == 0)
                controle = !controle;
            
            if (controle == true)
                casasTabuleiro[i].setBackground(cor);
            else
                casasTabuleiro[i].setBackground(Color.WHITE);
            
            controle = !controle;
        }
    }
}
