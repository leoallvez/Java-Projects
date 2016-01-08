package meuexe6;

import java.util.Scanner;

/**
 *
 * @author Leonardo Pereira Alves.
 * @version 18.02.2015
 */
public class CalculaGastos {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int km = 0;     // quilometros rodados
        int com = 0;    // combustivel consumidos
        int somaKm = 0;
        int somaCom = 0;
        double kml; // quilometro por litro;
        while(km != -1 && com != - 1){
            
            System.out.println("Digite quantos quilometro foram rodados: ");
            km = input.nextInt();
            if (km != -1){

                System.out.println("Digite a quantidade combustivel usados: ");
                com = input.nextInt(km);
                if(km != -1 && com != -1){
                    somaKm += km;
                    somaCom += com;
                    kml = (double)com / km;
            
                    System.out.println("Total de quilometros rodados: " + somaKm);
                    System.out.println("Total de combustivel gastos: " + somaCom);
                    System.out.println("Quilometro por litro: " + kml);
                }
            }
        }
        System.out.println("Fim do programa");
    }  
}
