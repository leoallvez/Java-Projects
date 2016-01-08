/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author 12141100130
 */
public class Casa {

    private double preco;
    private Porta[] porta;
    private Comodo[] comodo;
    
    public Casa(){}
    
    public Casa(double p, int qtdePorta){
        preco = p;
        porta = new Porta[qtdePorta];
    }
    
    public void adicionarPorta(){
        
        double cp, alt, larg;
        String desc, color;
        
        for(int i = 0; i<porta.length;i++){
        
            cp   = Double.parseDouble(JOptionPane.showInputDialog("Comprimento?"));
            alt   = Double.parseDouble(JOptionPane.showInputDialog("Altura?"));
            larg  = Double.parseDouble(JOptionPane.showInputDialog("Largura?"));
            desc  =  JOptionPane.showInputDialog("Descricao?");
            color =  JOptionPane.showInputDialog("Cor?");
            
            porta[i]= new Porta(cp,larg,alt,desc,color);
        }
    }
    
    public void adicionarComodo(){
        
        double cp, alt, larg;
        String desc, color;
        
        for(int i = 0; i<porta.length;i++){
        
            cp   = Double.parseDouble(JOptionPane.showInputDialog("Comprimento?"));
            alt   = Double.parseDouble(JOptionPane.showInputDialog("Altura?"));
            larg  = Double.parseDouble(JOptionPane.showInputDialog("Largura?"));
            desc  =  JOptionPane.showInputDialog("Descricao?");
            color =  JOptionPane.showInputDialog("Cor?");
            
            porta[i]= new Porta(cp,larg,alt,desc,color);
        }
    }
    
    public void mostrarCasa(){
        
        System.out.println("Preco>>>>"+preco);
        for(int i = 0; i<porta.length;i++){
            porta[i].mostrarPorta();
        }
    } 
}
