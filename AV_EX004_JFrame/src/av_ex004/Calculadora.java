/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex004;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class Calculadora {
    
    private int val1;
    private int val2;
    
    public int setVal1(){
        String x = JOptionPane.showInputDialog("Entre com o primeiro número: ");
        val1 = Integer.parseInt(x);
        return val1;
    }
    
    public int setVal2(){
        String x = JOptionPane.showInputDialog("Entre com o segundo número: ");
        val2 = Integer.parseInt(x);
        return val2;
    }
    
    public int soma(int val1, int val2){
        return  val1 + val2;
    }
}
