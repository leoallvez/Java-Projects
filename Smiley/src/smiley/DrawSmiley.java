package smiley;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo Pereira Alves.
 * Esse programa desenha um smiley
 */
public class DrawSmiley extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponents(g);
        
        //desenha rosto
        g.setColor(Color.yellow);
        g.fillOval(10, 10, 200, 200);
        
        //desenha os olhos
        g.setColor(Color.black);
        g.fillOval(55, 65, 30, 30);
        g.fillOval(135, 65, 30, 30);
        
        //desenha a boca 
        g.fillOval(50, 110, 120, 60);
        
        //"retoca" a boca para criar um sorriso
        g.setColor(Color.yellow);
        g.fillRect(50, 110, 120, 30);
        g.fillOval(50, 120, 120, 40);
    }
}
