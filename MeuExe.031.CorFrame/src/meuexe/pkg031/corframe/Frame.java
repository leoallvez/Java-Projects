/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg031.corframe;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;



/**
 *
 * @author Leonardo
 */
public class Frame extends JFrame{
    private JPanel panel = new JPanel();
    
    
    public Frame(){
        setLayout(new BorderLayout());
        add(panel,BorderLayout.CENTER);
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }
    
    public Frame(Color cor){
        setLayout(new BorderLayout());
        panel.setBackground(cor);
        add(panel,BorderLayout.CENTER);
        setBounds(100, 100, 300, 300);
        setVisible(true);
    }  
    
    public Frame(int a, int b, int c){
        setLayout(new BorderLayout());
        panel.setBackground(new Color(a,b,c));
        add(panel,BorderLayout.CENTER);
        setBounds(100, 100, 300, 300);
        setVisible(true);   
        
    
    }
    
}
