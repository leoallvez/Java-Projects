/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package av_ex005_login;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo
 */
public class AV_EX005_LOGIN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String l = JOptionPane.showInputDialog(null,"Login: ");
        String s = JOptionPane.showInputDialog(null,"Senha: ");
        JOptionPane.showMessageDialog(null,"Login: "+l+"\nSenha: "+s);
    }
}
