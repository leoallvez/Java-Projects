/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veiculo;

/**
 *
 * @author 12141100130
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //VeiculoPasseio fusca = new VeiculoPasseio(3000,120,2.000,new Motor(300,500),"Amarelo","67");
        //fusca.mostrar();
        Motor xpto = new Motor(300,500);
        
        //Caminhao transforme = new Caminhao(300,120,10.000,xpto,18.000,4.00,20.00);
        
        //transforme.mostrar();
        
        Veiculo Brasilia = new VeiculoPasseio(300,120,3.00, xpto,"VERDE","55");
        
        Brasilia.mostrar();
                
        
    }
    
}
