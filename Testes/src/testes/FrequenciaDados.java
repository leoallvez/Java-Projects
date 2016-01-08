/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.util.Random;

/**
 *
 * @author Leonardo
 */
public class FrequenciaDados {
    public static void main(String[] args){
        Random lado = new Random(); //gerador de número aleatório
        int[] frequencia = new int[7]; //array contador de frequencia
        
        //lançar dados 6000 vezes; ultizar o valor do dado como indice de frequencia
        for(int i = 0; i <= 6000; i++)
            ++frequencia[1 + lado.nextInt(6)];
        
        System.out.printf("%s%10s\n","Face","Frequencia");
        
        for(int face = 1; face < frequencia.length; face++)
            System.out.printf("%4d%10d\n",face,frequencia[face]);  
    }
}
