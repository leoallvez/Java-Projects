/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.swing.Icon;
import javax.swing.ImageIcon;

/**
 * Esse programa testa se é possivel comparar se dois objetos do tipo
 * @author Leonardo Pereira Alves.
 * @version 19/07/2007
 */
public class ComparaIcone {
    static Icon x;
    static Icon y;
    static Icon z;
    
    public ComparaIcone() {
       x = new ImageIcon(getClass().getResource("x1.png"));
       y = new ImageIcon(getClass().getResource("o1.png"));
       z = x;
    }
    
    public static boolean comparaIcone(Icon a,Icon b){
        return a.equals(b);
    }
    
    public static void main(String[] args){
        z = x;
        
        //System.out.println("Resultado: "+comparaIcone(z, x));
        if(z.equals(x)) {
            System.out.print("Iguais");
        }
    }  
}
