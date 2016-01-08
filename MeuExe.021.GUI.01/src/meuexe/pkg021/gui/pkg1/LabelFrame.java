package meuexe.pkg021.gui.pkg1;
// Demonstrando a classe JLabel
import java.awt.FlowLayout; //especifica como os componentes são organizados.
import javax.swing.Icon;    //Interface usada para manibular imagem.
import javax.swing.JFrame;  // fornece recurso básicos de janela.
import javax.swing.JLabel;  // exibe texto e imagens.
import javax.swing.SwingConstants; // contantes comuns itilizadas como Swing.
import javax.swing.ImageIcon; //carrega imagens

/**
 *
 * @author Leonardo
 */
public class LabelFrame extends JFrame{
    private JLabel label1;  // JLabel apenas com texto
    private JLabel label2;  // JLabel construído com texto e ícone
    private JLabel label3;  // JLabel com e ícone adcionados
    
    //construtor LabelFrame adicionar adicona JLabels a JFrame
    public LabelFrame(){
        super("Teste");
        setLayout(new FlowLayout()); //configurar o Layout do frame
        
        //Contrutor JLabel com um argumento de String
        label1 = new JLabel("Label com um texto"); // mostra
        label1.setToolTipText("Este é label1");
        add(label1); //adionar label1 ao JFrame
        
        //Contrutor JLabel com string, Icon e argumento de aliamento
        //Icon bug = new ImageIcon(getClass().getResource("bug1.png"));
        //label2 = new JLabel("Label com texto e incone",bug,SwingConstants.LEFT);
        //label2.setToolTipText("Este é label2");
        //add(label2); // adiconar label2 ao JFrame
        
        
        //Contrutor de JLabeel sem argumentos
        label3 = new JLabel();
        label3.setText("Label com incone e botão de texto");
        //label3.setIcon(bug);
        label3.setHorizontalTextPosition(SwingConstants.CENTER);
        label3.setVerticalTextPosition(SwingConstants.BOTTOM);
        label3.setToolTipText("Este é o Label3");
        add(label3); // adiocionar label3 ao JFrame

    }//Fim do construtor LabelFrame
}//Fim da classe LabelFrame
