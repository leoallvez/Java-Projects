package meuexe.pkg016.pkgthis;
import javax.swing.*;

/**
 * @author Leonardo Pereira Alves.
 * @version 08.03.15
 */
public class Programa {

    public static void main(String[] args) {
        // TODO code application logic here
        Nome u = new Nome();
        String n = JOptionPane.showInputDialog(null,"Digite um nome: ");
        u.setNome(n);
        u.mostrarNome();
        JOptionPane.showMessageDialog(null,u.resp,"Resposta",1);
    }
    
}
