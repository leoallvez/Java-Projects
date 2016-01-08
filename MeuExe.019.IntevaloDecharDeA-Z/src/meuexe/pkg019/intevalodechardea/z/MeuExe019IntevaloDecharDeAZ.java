/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuexe.pkg019.intevalodechardea.z;

/**
 *
 * @author Leonardo
 */
public class MeuExe019IntevaloDecharDeAZ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here char c = 'Z';
        char c = '4';
        
        /*if((c >= 'A' )&&(c <= 'Z')){
        System.out.println("Sim");
        }else{
        System.out.println("não");
        }*/
        
        if(inRanger(c,'A','Z')){
            System.out.println("Sim");
        }else{
            System.out.println("não");
        }   
    }
    static public boolean inRanger(char c, char c1, char c2){
        return (c >= c1 )&&(c <= c2); 
    }
}
