package testeframe;
import javax.swing.*;

// A classe Painel é uma classe filha de JPanel
public class Painel extends JPanel {

    // criando uma variavel JLabel. 
    private final JLabel label1;
    // Construtor de Painel
    Painel(){
        // Instaciando label1 a JLabel.
        label1 = new JLabel("Ola mundo");
        // Adionar label1 a JFrame.
        label1.setToolTipText("Isto é um texto de label");
        add(label1);
    }
}
