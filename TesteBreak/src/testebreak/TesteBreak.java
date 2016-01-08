package testebreak;

/**
 *
 * @author Leonardo
 */
public class TesteBreak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x = 1;
        int y = 1000;
        for (int i = x; i < y; i++){
            if(i % 19 == 0){
                System.out.println("Achei o número "+i+" que é dividiavel por 19");
                break;
            }
        }
    } 
}
