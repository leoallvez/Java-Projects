package av_ex002;
import javax.swing.JOptionPane; //
/**
 * Programa mostra vários comandos JOptionPane.
 * @author Leonardo Pereira Alves.
 * @version 09/02/2015
 */
public class Programa {
    public static void main(String[] args) {
        // Imprime uma mensagem na tela
        JOptionPane.showMessageDialog(null, "Não vou falar palavão");
        // Imprime uma caixa de dialogo na tela
        String nome = JOptionPane.showInputDialog("Digite o seu nome");
        JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
        int escolha = JOptionPane.showConfirmDialog(null,"Você é gay?");
        
        if (escolha == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null," Uiii " + nome);
        }else{
            JOptionPane.showMessageDialog(null, nome+ " Você é machão ");
        } 
    } 
}
