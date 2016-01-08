package casa;

import javax.swing.JOptionPane;

/**
 *
 * @author 12141100130
 */
public class Comodo {
    
    String descrisão;
    double area;
    Porta[] porta;
    
    Comodo(){}
    
    Comodo(String desc, double area, int quartPorta){
        this.descrisão = desc;
        this.area = area;
        porta = new Porta[quartPorta];
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
    
    /*public void definirArea(double lagura,double comprimento){
    area = lagura * comprimento;
    }*/
    
    public void mostrarComodo(){
        System.out.println("Descrição: "+descrisão);
        System.out.println("Area: "+area);
        for(int i = 0; i<porta.length;i++){
            porta[i].mostrarPorta();
        }
    }
}
