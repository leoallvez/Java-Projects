package av_ex003;
import javax.swing.JOptionPane;
/**
 * Programa mostra várias funções do comando JOpitionPane.
 * @author Leonardo Pereira Alves.
 * @version 09/02/2015
 */
public class Programa {
    public static void main(String[] args) {
        // Esse comando atribui a uma string um valor digitado numa caixa de dialogo
        String nome = JOptionPane.showInputDialog(null,"Digite o seu nome: ");
        String idade = JOptionPane.showInputDialog(null,"Qual a sua idade: ");
        // Esse comando mostra uma mensagem na tela
        JOptionPane.showMessageDialog(null, "Bem-vindo " + nome);
        // Esse comando mostra uma caixa de confimação de sim ou não.
        int escolha = JOptionPane.showConfirmDialog(null,nome + " Você gosta de filmes?");
        if(escolha == JOptionPane.YES_OPTION){ // Se a opção for sim
            JOptionPane.showMessageDialog(null,nome + " você tem "+ idade +" anos e gosta de filmes!");
        }else{
            if(escolha == JOptionPane.NO_OPTION){ // Se a opção for não.
                JOptionPane.showMessageDialog(null,nome + " você tem "+ idade +" anos e não gosta de filmes!");
            }
        }
        // Mostra a mensagem de fim de programa.
        JOptionPane.showMessageDialog(null,"Fim do programa " + nome + " até mais");
        // String sidade = 10;
        // int idade = Integer.parseInt(sIdade); Conventendo string em integer.
    }
}
