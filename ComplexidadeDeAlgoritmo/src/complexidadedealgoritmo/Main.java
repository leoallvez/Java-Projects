package complexidadedealgoritmo;

/**
 *
 * @author Leonardo Pereira Alves.
 */
public class Main {

    public static void main(String[] args) {
        int[] v = new int[10];
        v[0] = 88;
        v[1] = 9;
        v[2] = 9;
        v[3] = 2;
        v[4] = 3;
        v[5] = 19;
        v[6] = 11;
        v[7] = 45;
        v[8] = 15;
        v[9] = 0;
        Ordenacao teste = new Ordenacao(v);
        
       
        teste.bubbleSort2();
        teste.mostrar();
        System.out.println(teste.buscaBinaria(0));
        
    }
}
