/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fractal;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo
 */
public class Fractal extends JFrame{
    
    private static final int WIDTH = 400; // define a lagura da GUI.
    private static final int HEIGHT = 480; // define a altura da GUI.
    private static final int MIN_LEVEL = 0, MAX_LEVEL = 15;
    
    private final JButton chagerColorJButton, increaseLevelJButton, decreaseLevelJButton;
    private JLabel levelJLabel;
    private FractalJPanel drawSpace;
    private final JPanel mainPanel, controlJPanel;
    
    //configura GUI
    public Fractal(){
        super("Fractal");
        
        //configurar painel de controle
        controlJPanel = new JPanel();
        controlJPanel.setLayout(new FlowLayout());
        
        //configura botão de cor e registra o ouvinte
        chagerColorJButton = new JButton("Cor");
        controlJPanel.add((chagerColorJButton));
        chagerColorJButton.addActionListener( new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                Color color = JColorChooser.showDialog(Fractal.this,"Escolha de cor", Color.BLUE);
                
                //figuarar cor padrão se nenhuma cor for retomada.
                if(color == null)
                    color = Color.BLUE;
                
                drawSpace.setColor(color);     
            }
        });
        
        //configura o botão de decrease level para adicionar o painel de controle
        //ouvinte registrado.
        decreaseLevelJButton  = new JButton("menos");
        controlJPanel.add(decreaseLevelJButton);
        decreaseLevelJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int level = drawSpace.getLevel();
                --level; // diminui n´vel por um.
                //modifica nível se possivel
                if((level >= MIN_LEVEL) && (level <= MAX_LEVEL)){
                    levelJLabel.setText("Level: "+level);
                    drawSpace.setLevel(level);
                    repaint();
                }
            }
        });
        
        //configura o botão de increase level para adicionar o painel de controle
        //ouvinte registrado.
        increaseLevelJButton  = new JButton("mais");
        controlJPanel.add(increaseLevelJButton);
        increaseLevelJButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent ae) {
                int level = drawSpace.getLevel();
                ++level; // diminui n´vel por um.
                //modifica nível se possivel
                if((level >= MIN_LEVEL) && (level <= MAX_LEVEL)){
                    levelJLabel.setText("Level: "+level);
                    drawSpace.setLevel(level);
                    repaint();
                }
            }
        });
        
        //configura levelJLabel para adicionar ao controlJPanel
        levelJLabel = new JLabel("Level: 0");
        controlJPanel.add(levelJLabel);
        drawSpace = new FractalJPanel(0);
        
        //Criar mainPanel para conter control panel e drawspace
        mainPanel = new JPanel();
        mainPanel.add(controlJPanel);
        mainPanel.add(drawSpace);
        
        add(mainPanel); // adiciona mainPanel ao Frame.
       
        setSize(WIDTH,HEIGHT); //configura o tamanho do frame.
        setVisible(true); //exibe frame.
        setResizable(false);
        
    
    }
    
}
