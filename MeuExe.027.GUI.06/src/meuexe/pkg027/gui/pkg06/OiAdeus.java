package meuexe.pkg027.gui.pkg06;
//Importações
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

/** 
 * @author Leonardo Pereira Alves
 * @version 01.04.15
 */
public class OiAdeus extends JFrame {
    /** Os dois string que serão exibidos. */
    private static final String OI = "Oi!";
    private static final String ADEUS = "Adeus!";
    /** O valor atual do string exibido. */
    private String mensagem = OI;
    
    public OiAdeus(){
        
        // Definir titulo
        super("Oi Adeus");
        
        //Não deixa que janela seja maximizada.
        setResizable(false); 
        
        //Criando um JLabel.
        final JLabel umRotulo = new JLabel(mensagem, SwingConstants.CENTER);
        //Criando um JButtom.
        final JButton umBotao = new JButton("Clique em mim");
        
        /** Evento executado ao clicar no JButton */
        umBotao.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent e){
                mensagem = mensagem.equals(OI)?ADEUS : OI;
                umRotulo.setText(mensagem);
            }
        });
        
        /** 1)Cria um painel para amazenar o rotulo e o botão. 
         *  2)Define a borda ao redor dos elementos gráfico e configura o 
         *  gerenciador de layout.
         *  3)O padrão é FlowLayout, mas queremos usar o BoderLayout.
         *  Assim adicionamos os componentes na seção certa de BoderLayout.
         */
        // 1)Criar um JPainel para ser usado com um conteiner.
        final JPanel umPainel = new JPanel();
        //2)Configurar a borda do JFrame e layout dos elementos.
        umPainel.setBorder(BorderFactory.createEmptyBorder(20,60,20,60));
        /**
         * 3)Especificando no umPainel um Layout do tipo "Border layout", 
         * criando um objeto desse tipo e configurando-o como gerenciador 
         * de Layout.
         */
        umPainel.setLayout(new BorderLayout());
        
        //Adicionar o JButton no JPanel.
        umPainel.add(umBotao,BorderLayout.SOUTH);
        
        //Adicionar o JLabel no JPanel.
        umPainel.add(umRotulo,BorderLayout.CENTER);
        
        //Adiciona o painel à modura (Frame).
        add(umPainel);
        // Quando a janela for fechada finalizar programa.
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        /** Determina o tamanho do Frame com o minimo necessario para exibição
         * dos componentes.
         */
        pack();
        //Cria uma janela com 300 x 400 pixel.
        //setSize(300,400);
        // Tornar janela visivel.
        setVisible(true); 
        
    }// Fim do construtor OiAdeus. 
}//Fim da classe OiAdeus.
