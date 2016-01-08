package balancotrismestral;
/**
 *
 * @author Leonardo
 */
public class BalancoTrismestral {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimestre = gastosJaneiro + gastosFevereiro + gastosMarco;
        System.out.println ("Total gasto em Janeiro: "+gastosJaneiro);
        System.out.println ("Total gasto em Fevereiro: "+gastosFevereiro);
        System.out.println ("Total gasto em Março: "+gastosMarco);
        System.out.println ("Total gasto no Primeiro trismestre: "+gastosTrimestre);
    }  
}
