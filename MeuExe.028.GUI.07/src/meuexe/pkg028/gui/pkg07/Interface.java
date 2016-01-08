package meuexe.pkg028.gui.pkg07;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Leonardo Pereira Alves.
 * @version 02/04/2015
 */
public class Interface extends JFrame {
    // Declaração dos elementos
    JMenuItem menuItem = new JMenuItem("Sair");
    JMenu menu = new JMenu("Arquivo");
    JMenuBar menuBar = new JMenuBar();
    JLabel infixa = new JLabel("Infixa:");
    JTextField entrada = new JTextField("");
    JLabel saida = new JLabel();
    JButton botao = new JButton("Converter");
    JLabel etiqueta = new JLabel("Give your jumps");
    JPanel painelCentral = new JPanel (new GridLayout(4,1));
    
    JPanel painelGeral = new JPanel (new BorderLayout());
    
    Interface(){
        // Definindo o titulo do Frame.
        super("Conversor Melhor Ainda - Beta");
        setBounds(400,200,640,480); // Posiciona o frame na tela
        // Criando menus e adicionado no frame.
        menu.add(menuItem);
        menuBar.add(menu);
        add(menuBar,BorderLayout.NORTH);
        menuItem.setForeground(Color.BLUE);
        menu.setForeground(Color.BLUE);
        infixa.setForeground(Color.BLUE);
        entrada.setForeground(Color.BLUE);
        etiqueta.setForeground(Color.GRAY);
        
        // Adicionado elementos no JPanel painelCentral.
        painelCentral.setBackground(Color.white);
        painelCentral.add(infixa);
        painelCentral.add(entrada);
        painelCentral.add(botao);
        painelCentral.add(saida);
        painelCentral.setBorder(BorderFactory.createEmptyBorder(0,30,0,30));
        //Adicionado o painelCentral no painelGeral
        painelGeral.setBackground(Color.green);
        painelGeral.setBorder(BorderFactory.createEmptyBorder(60,60,60,60));
        painelGeral.add(painelCentral,BorderLayout.CENTER);
        add(etiqueta,BorderLayout.SOUTH);
       
        // Adicionando painelGeral no Frame.
        add(painelGeral);
        
        // Evento de fazer a conversão.
        botao.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){
                
                Check verif = new Check();
                String a = entrada.getText();                    
                a = a.toUpperCase(); // String de minuscula para maiuscula.
                
                boolean x = verif.checkEveryone(a);
            
                if(x == true){
                    // Alocação dinamica.
                    int b = a.length();
                    NotacaoPolonesaReversa test = new NotacaoPolonesaReversa(b);
                    a = test.posfixa(a);
                }
              
                boolean y = verif.checkParenthesis(a);
                
                if((x == true) && (y == true)){
                    saida.setForeground(Color.blue);
                    saida.setText("Pósfixa: "+a);
                    }else{
                    saida.setForeground(Color.red);
                    saida.setText("Desculpe não foi possivel converter.");
                }
            }
        });
        
        //Evento que finalizar programa ao clicar no JMenuItem sair.
        menuItem.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){
                System.exit(0);
            }
        });
    }      
}
