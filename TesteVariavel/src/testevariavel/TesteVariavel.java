package testevariavel;
/**
 *
 * @author Leonardo
 */
public class TesteVariavel {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Aqui a variavel i não existe.
        int i = 0;
        // Aqui a variavel i existe.
        while(i != 10){
            // A variavel j só existe dentro do bloco do while.
            int j = 1;
            i++;
        }
        // Aqui j não existe mais, porém a variavel i continua a existir.
    }
}
