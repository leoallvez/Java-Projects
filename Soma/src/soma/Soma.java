package soma;
import javax.swing.JOptionPane;


/**
 * @author Leonardo Pereira  Alves.
 *
 */
public class Soma {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Enter com o primeiro número");
		String s2 = JOptionPane.showInputDialog("Enter com o segundo número");
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "A soma é: "+ soma, "Soma de dois números",JOptionPane.DEFAULT_OPTION);	

	}
}
