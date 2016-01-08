package meuexe.pkg025.gui.pkg5;
import javax.swing.*;

/**
 * Ola mundo no modo gráfico
 * @author Leonardo Pereira Alves
 * @version 23/03/2015
 */
public class AloMundo 
{
    public static void main(String[] args)
    {
        JFrame tela = new JFrame("Alô mundo");
        JLabel texto = new JLabel("Liguagem Java");
        // Anula layout
        tela.setLayout(null);
        //Iserir texto na tela
        tela.setContentPane(texto);
        
        tela.setBounds(30,20,210,20);
        
        tela.setSize(280,100);
        
        tela.setVisible(true);
        
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
}
