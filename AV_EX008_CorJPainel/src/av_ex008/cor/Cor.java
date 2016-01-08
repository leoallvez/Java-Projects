package av_ex008.cor;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ambientes visual
 * @author Leonardo Pereira Alves 12141500534
 * @author Camila Sampaio 12141100130;
 * @version 23/03/2015
 */
public class Cor extends JFrame{
    
    private final JMenuItem azul; 
    private final JMenuItem amarelo; 
    private final JMenuItem verde; 
    private final JMenuItem vermelho; 
    private final JMenuItem preto; 
    private final JMenuItem ciano; 
    private final JMenuItem cinza; 
    private final JMenuItem laranja;       
    private final JMenuItem rosa; 
    private final JSeparator divisao;        
    private final JMenuItem sair;
    
    private final JMenu menu;
    
    private final JMenuBar menus;
    
    private final JLabel ocioso;
    
    private JPanel painel;
    
    
    public Cor(){
        
        super("Cores");
        
        setResizable(false); // Evita que a janela seja maximinizada.
        //setSize(480,480);
        setVisible(true);
        setBounds(100,100,640,480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        
        azul = new JMenuItem("Azul");
        amarelo = new JMenuItem("Amarelo");
        verde = new JMenuItem("Verde");
        vermelho = new JMenuItem("Vermelho");
        preto = new JMenuItem("Preto");
        ciano = new JMenuItem("Ciano");
        cinza = new JMenuItem("Cinza");
        laranja = new JMenuItem("Laranja");
        rosa = new JMenuItem("Rosa");
        divisao = new JSeparator();
        sair = new JMenuItem ("Sair");
        
        painel = new JPanel();
        
        ocioso = new JLabel("ocioso");
  
        menu = new JMenu("Cor");
        
        menus = new JMenuBar();
        
        menu.add(azul);
        menu.add(amarelo);
        menu.add(verde);
        menu.add(vermelho);                 
        menu.add(preto);
        menu.add(ciano);
        menu.add(cinza);
        menu.add(laranja);
        menu.add(rosa);
        menu.add(divisao);
        menu.add(sair);
        
        menus.add(menu);
        
        add(ocioso,BorderLayout.SOUTH);
        add(painel,BorderLayout.CENTER);
        add(menus, BorderLayout.NORTH);
        
        
        azul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.blue);
            }
        });
        
        amarelo.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.yellow);
            }
        });
        
        verde.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.green);
            }
        });
        
        vermelho.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.red);
            }
        });
     
        azul.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.blue);             
            }
        });  
        
        preto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.black);             
            }
        });
        
        ciano.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.cyan);             
            }
        });
        
        cinza.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.gray);             
            }
        });

        laranja.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.orange);             
            }
        });
        
        rosa.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                painel.setBackground(Color.pink);             
            }
        });
        
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });   
    }// Fim do construtor cor
}// Fim da classe cor
