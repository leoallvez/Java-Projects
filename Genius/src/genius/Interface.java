package genius;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo
 */

public class Interface  extends JFrame {
    private JButton[] quadrado;
    private JPanel centro;
    
    
    public Interface(){
        super("Genius Box - Beta");
        JButton vermelho = new JButton();
        JButton verde = new JButton();
        JButton azul = new JButton();
        JButton amarelo = new JButton();
        
        vermelho.setBackground(new Color(254,18,18));
        verde.setBackground(new Color(128,255,0));
        azul.setBackground(new Color(0,162,232));
        amarelo.setBackground(new Color(255,255,0));
        
        setBounds(500,150,400,400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        quadrado = new JButton[] {vermelho,verde,azul,amarelo};
        
        centro = new JPanel(new GridLayout(2,2));
        int i = 0;
        
        for(int j = 0; j < 4; j++){
            centro.add((quadrado[i]));
            i++;
        }
        
        setLayout(new BorderLayout());
        
        add(centro,BorderLayout.CENTER);
    }
}
