package meuexe5.gui;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo
 */
class DrawPanel extends JPanel {
    //desenha um X a partair dos cantos do painel
    @Override
    public void paintComponent(Graphics g){
        // chama paintComponent para assegurar que o painel seja exibido corretamente
        super.paintComponent(g); // Chamando metodo da super classe.
        
        int width = getWidth();
        int height = getHeight();
       
        //desenha uma linha a partir do canto superior esquerdo até o inferior direito.
        g.drawLine(0,0,width,height);
       
        //desenha uma linha a partir do canto inferio até o superior direito.
        g.drawLine(0, height, width, 0);
    }
}
