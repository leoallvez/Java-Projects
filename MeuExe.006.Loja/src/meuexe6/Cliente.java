package meuexe6;

import javax.swing.JOptionPane;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class Cliente {    
    private int itensCobrados;
    private int credito;
    
    Cliente(int credito){
        this.credito = credito;
    }
    
    private void setItensCobrados(int valor){
        this.itensCobrados += valor;
    }
    
    private int getItensCobrados(){
        return itensCobrados;
    }
    
    private void setCredito(int valor){
        this.credito += valor;
    }
    
    private int getCredito(){
        return credito;
    }
    
    private void UsaCredito(int valor){
        this.credito -= valor;
    }
    
    public void compra(){
        String a = JOptionPane.showInputDialog("Valor da compra: ");
        if (a != null){
            int valor = Integer.parseInt(a);
            if (valor < getCredito()){
                setItensCobrados(valor);
                UsaCredito(valor); 
                }else{
                JOptionPane.showMessageDialog(null,"Limite de credito exedido");
                JOptionPane.showMessageDialog(null,"Compra cancelada!");
            }
        }else{JOptionPane.showMessageDialog(null,"Compra cancelada!");}
    }
    public void mostra(){
        JOptionPane.showMessageDialog(null,"Limite de credito: "+ this.getCredito()+"\nTotal gasto: " + this.getItensCobrados());
    }
}
