package soma;
import javax.swing.JOptionPane;


/**
 * @author Leonardo Pereira  Alves.
 *
 */
public class Soma {

	public static void main(String[] args) {
		
		String s1 = JOptionPane.showInputDialog("Enter com o primeiro n�mero");
		String s2 = JOptionPane.showInputDialog("Enter com o segundo n�mero");
		
		int n1 = Integer.parseInt(s1);
		int n2 = Integer.parseInt(s2);
		
		int soma = n1 + n2;
		
		JOptionPane.showMessageDialog(null, "A soma �: "+ soma, "Soma de dois n�meros",JOptionPane.DEFAULT_OPTION);	

	}
}
