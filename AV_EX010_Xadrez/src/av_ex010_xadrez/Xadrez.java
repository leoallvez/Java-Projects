package av_ex010_xadrez;

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
import javax.swing.JSeparator;

/**
 * Ambiente Visuais
 * @author Leonardo Pereira Alves.
 * @version 06.04.2015
 */
public final class Xadrez extends JFrame {    
    private final JMenu menu;
    private final JMenuItem preto, azul, vermelho, sair;
    private final JSeparator separador;
    private final JMenuBar menus;
    private final JLabel status;
    private final JPanel barraDeStatus;
    private final JPanel central;
    private final JPanel[] xadrez;
    
    
    Xadrez(){
        super("Xadrez"); // Definindo titulo
        //Configurando frame
        setBounds(500,100,600,600); // Definindo tamanho e posição do frame.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Definindo os menus
        preto =  new JMenuItem("Preto");
        azul = new JMenuItem("Azul");
        vermelho = new JMenuItem("Veremlho");
        separador = new JSeparator();
        sair = new JMenuItem("Sair");
        
        menu = new JMenu ("Cores");
        menu.add(preto);
        menu.add(azul);
        menu.add(vermelho);
        menu.add(separador);
        menu.add(sair);
        menus = new JMenuBar();
        menus.add(menu);
        add(menus,BorderLayout.NORTH);
        
        //Defindo xadrez
        central = new JPanel(new GridLayout(8,8));
        xadrez = new JPanel[64];
        for(int i = 0; i < xadrez.length; i++){
            xadrez[i] = new JPanel();
            central.add(xadrez[i]);    
        }
        mudarDeCor(Color.red);
        add(central,BorderLayout.CENTER);
        
        // Definindo barra de status
        barraDeStatus = new JPanel( new FlowLayout(FlowLayout.LEFT));
        status = new JLabel("Ocioso");
        barraDeStatus.add(status);
        add(barraDeStatus,BorderLayout.SOUTH);
        
        // Eventos de mudança de cor do xadrez.
        preto.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                mudarDeCor(Color.BLACK);
            }
        
        });
        
        azul.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                mudarDeCor(Color.BLUE);
            }
        });
        
        vermelho.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                mudarDeCor(Color.RED);
            }
        });
        
       sair.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                System.exit(0);
            }
        });
    }//Fim do construtor Xadrez
    
    void mudarDeCor(Color cor){
        
        boolean x = true;
        
        for(int i = 0; i < xadrez.length; i++){
            if( i % 8 == 0){ x = !x;}
            
            if(x == true){
                xadrez[i].setBackground(cor);
            }else{
                xadrez[i].setBackground(Color.WHITE);
            }
            x = !x;
        }  
    }    
}// Fim da classe Xadrez.
