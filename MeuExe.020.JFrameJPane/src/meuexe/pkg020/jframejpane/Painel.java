package meuexe.pkg020.jframejpane;

import javax.swing.JPanel;
import java.awt.Graphics;

/**
 *
 * @author Leonardo
 */
public class Painel extends JPanel {

    /**
     *
     * @param g
     */
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int pixel;
        
        for(pixel = 0; pixel <= getHeight(); pixel += 10){
            g.drawLine(0, pixel, pixel, getHeight());
        }
        
        for(pixel = getHeight(); pixel >= 0; pixel -= 10){
            g.drawLine(0, pixel, getHeight() - pixel, 0);
        }
        
        for(pixel = 0; pixel <= getHeight(); pixel += 10){
            g.drawLine(getWidth(), pixel, getWidth() - pixel, getHeight());
        }
        
        for(pixel = getHeight(); pixel >= 0; pixel -= 10){
            g.drawLine(getWidth(), pixel, getWidth() -(getHeight() - pixel),0);
        }  
    }
}
