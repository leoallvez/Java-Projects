/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg030.contador;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo
 */
public class InterfaceContador extends JFrame {
    
    JLabel etiqueta;
    JButton aumentar;
    JButton diminuir;
    JPanel painelCentral;
    JPanel painelBotao;
    int n;
    
    public InterfaceContador(){
        super("Contador");
        setBounds(500,300,640,480);
        etiqueta = new JLabel(" A contagem é: "+n);
        aumentar = new JButton("Aumentar");
        diminuir = new JButton("Diminuir");
        painelCentral = new JPanel(new BorderLayout());
        painelBotao = new JPanel(new GridLayout(0, 2));
        
        painelBotao.add(aumentar);
        painelBotao.add(diminuir);
        painelCentral.setBorder(BorderFactory.createEmptyBorder(30,30,30,30));
        painelCentral.add(painelBotao,BorderLayout.SOUTH);
        painelCentral.add(etiqueta,BorderLayout.CENTER);
        
        add(painelCentral,BorderLayout.CENTER);
        
        aumentar.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){
                n++;
                etiqueta.setText("  A contagem é: "+n);
            }
        });
        
        diminuir.addActionListener(new ActionListener(){
            public void actionPerformed(final ActionEvent ae){
                n--;
                etiqueta.setText("  A contagem é: "+n);
            }
        });
        
        
    
    
    }
    
    
    
    
}
