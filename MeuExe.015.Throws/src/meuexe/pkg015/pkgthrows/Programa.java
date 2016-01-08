package meuexe.pkg015.pkgthrows;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 08.03.15
 */
public class Programa {
    public static void efetuar(){

   
        
        int x = 12, y = 0, c = 0;
        
        try{
            String B = JOptionPane.showInputDialog(null,"Digite o valor de Y: ");
            y = Integer.parseInt(B);
            
            if( x / y == 1){
                try {
                    throw new Exception ("Nova_Exeção");
                } catch (Exception ex) {
                    Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            c = x / y;
            JOptionPane.showMessageDialog(null,"A parte inteira do resultado é "+c,"Resultado",1); 
        }
    
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números !","ERRO",0);
            efetuar();
        }
    }
    
    public static void main(String[] args) {
    }
    
    
}
