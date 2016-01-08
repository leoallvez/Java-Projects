package meuexe.pkg014.trycatch;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves
 * @version 07.03.15
 */
public class MeuExe014TryCatch {
    public static void main(String[] args) {
        
        int x = 0, y = 0, c = 0;
        
        String A,B;
        
        try{
            A = JOptionPane.showInputDialog(null,"Digite o valor de X: ");
            
            x = Integer.parseInt(A);
            
            B = JOptionPane.showInputDialog(null,"Digite o valor de Y: ");
            
            y = Integer.parseInt(A);
            
            c = x / y;
            
            JOptionPane.showMessageDialog(null,"A parte inteira"+" do resultado é "+c,"Erro",1);
        }
        catch(ArithmeticException ex){
            JOptionPane.showMessageDialog(null,"Você tentou dividir por zero !","ERRO",1);
        }
        
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"O dado tem que ser apenas númerico","ERRO",1);

        }
        System.exit(0);
    }
    
}
