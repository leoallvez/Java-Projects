package meuexe.pkg026;

import javax.swing.JOptionPane;

/**
 * @author Leonardo Pareira Alves;
 * @version 25/03/2015
 */
public class Princinpal {

    public static void main(String[] args) {
        Check x = new Check();
        String s = JOptionPane.showInputDialog(null,"Digita ai mano: ");
        if(x.checkNumber(s) == true){
            JOptionPane.showMessageDialog(null,"Tem número ai mano");
        
        }else{
            JOptionPane.showMessageDialog(null,"Não tem número ai mano");
        }
        
        if(x.checkParenthesis(s) == true ){
            JOptionPane.showMessageDialog(null, "Tudo ok mano");
        }else{
            JOptionPane.showMessageDialog(null,"tá faltando parenteses ai mano");
        }
    }
}
