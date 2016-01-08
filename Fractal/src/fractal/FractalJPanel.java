
package fractal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo Pereira Alves
 * Desenhando a fractal com recursão.
 */
public class FractalJPanel extends JPanel{
    private Color color; //amarzena a cor ultilizada para desenhar a fractal
    private int level;   //amarzena o nível atual da fractal
    
    private static final int WIDTH = 400; //define a largura do JPanel.
    private static final int HEIGHT = 400; //define a altura do JPanel.
    
    //configura o nível do fractal incial com valor especificado.
    //e configura as especificações do JPanel
    public FractalJPanel(int currentLevel){
        color = Color.BLUE; //inicializa a cor do desenho como azul
        level = currentLevel; //configura o nivel da fractal inicial.
        setBackground(Color.WHITE);
        setPreferredSize(new Dimension(WIDTH,HEIGHT));
    }//fim do construtor FractalJPanel.
    
    //desenhando fractal recursivamente.
    public void drawFractal(int level, int xA, int yA, int xB, int yB, Graphics g){
        
        //caso basico: dsenhado uma linha conectando dois pontos dados.
        if(level == 0)
            g.drawLine(xA,yA,xB,yB);
        else{
            // passo de recursão: determina novos pontos desenha próximos nivel.
            //calcula o ponto intermediario entre (xA, yA) e (xB, yB)
            int xC = (xA + xB) / 2;
            int yC = (yA + yB) / 2;
            /**calcula o quarto ponto (xD, yD) que forma um triangulo isoceles
             * reto entre (xA, yA) e (xC, yC
             * onde o angulo direito está a (xD, yD).
             */
            int xD = xA + (xC - xA) / 2 - (yC - yA) / 2;
            int yD = yA + (yC - yA) / 2 + (xC - xA) / 2;
            
            //desenhado recursivamente
            drawFractal(level - 1, xD, yD, xA, yA, g);
            drawFractal(level - 1, xD, yD, xC, yC, g);
            drawFractal(level - 1, xD, yD, xB, yB, g);
        }//Fim do else
    }// fim do metodo construstor
    
    //começar desenha fractal
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        //desenha padrão fractal
        g.setColor(color);
        drawFractal(level, 100, 90, 290, 200, g);
    }// fim do metodo paintComponet
    
    //configura cor do desenho
    public void setColor(Color c){
        color = c;
    }
    
    //configura novo nivel de recursão
    public void setLevel(int level){
        this.level = level;
    }
    
    //retorna n´vel de recursão
    public int getLevel(){return level;}
}//Fima da classe FractalJPane
