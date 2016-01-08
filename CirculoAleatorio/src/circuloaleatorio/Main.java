
package circuloaleatorio;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;

public class Main {
    
    public static void main(String[] args) {
        
        Circulos circulo = new Circulos();
        circulo.pinta();
        JFrame janela = new JFrame();
        janela.setLayout(new BorderLayout());
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(circulo, BorderLayout.CENTER);
        janela.setSize(230,250);
        janela.setVisible(true);
        janela.setResizable(false);
        
        while(true){
            circulo.pinta();
            circulo.repaint();
            try{
                Thread.sleep(900); //Delay
            }catch(Exception e){
            }
        }
    }
}
