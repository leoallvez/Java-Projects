/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg015.trycatchfinally;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira
 */
public class Entrada {
    
    public static int recebeDados(){
        int a = 0, b = 0;
        try{
             a = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor para A: "));
             b = Integer.parseInt(JOptionPane.showInputDialog("Entre com um valor para B: "));
        }
        
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Digite apenas números","Erro",0); 
     
        }
        
        finally{
            return a + b;
        
        }
        
        
    }
    
}
