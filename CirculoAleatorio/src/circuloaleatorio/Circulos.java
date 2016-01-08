package circuloaleatorio;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class Circulos extends JPanel{
    Color cor1;
    Color cor2;
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        g.setColor(cor1);
        g.fillOval(10, 10, 200, 200);
        g.setColor(cor2);
        g.fillOval(35, 35, 150, 150);
        g.setColor(cor1);
        g.fillOval(60, 60, 100, 100);
        g.setColor(cor2);
        g.fillOval(85, 85, 50, 50);
        g.setColor(cor1);
        g.fillOval(100, 100, 20, 20);
    }
    
    public void pinta(){
        Random n = new Random();
        int a = n.nextInt(250) + 1;
        int b = n.nextInt(250) + 1;
        int c = n.nextInt(250) + 1;
        cor1 = new Color(a,b,c);
        
        a = n.nextInt(250);
        b = n.nextInt(250);
        c = n.nextInt(250);
        cor2 = new Color(a,b,c);
        
    }
    
    
}
